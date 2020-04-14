package com.example.location2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;



import android.location.Location;
import android.os.Bundle;
import android.provider.Settings;



import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.location2.API.ClientRetrofit;
import com.example.location2.API.Login;
import com.example.location2.API.PositionBody;
import com.example.location2.API.Token;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;




import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private FusedLocationProviderClient clientLocation;

    private MapView mapView;
    private GoogleMap gmap;
    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";
    public LatLng pos;
    public String devID;




    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl("http://192.168.43.212:8081")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    ClientRetrofit apiClient =retrofit.create(ClientRetrofit.class);



    public Double lat;
    public Double longi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.authenticate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authenticate();
            }
        });

        final Button sendButton=findViewById(R.id.send);
        sendButton.setEnabled(false);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }
        });


        TextView deviceID=findViewById(R.id.DeviceID);
        devID= Settings.Secure.getString(getContentResolver(),Settings.Secure.ANDROID_ID);
        deviceID.setText(devID);

        requestPermissions();
        clientLocation= LocationServices.getFusedLocationProviderClient(this);
        Button button=findViewById(R.id.getLocation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clientLocation.getLastLocation().addOnSuccessListener(MainActivity.this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location!=null)
                        {
                            lat=location.getLatitude();
                            longi=location.getLongitude();
                            TextView latitude=findViewById(R.id.Latitude);
                            latitude.setText("Latitude "+lat);
                            TextView longitude=findViewById(R.id.Longitude);
                            longitude.setText("Longitude "+longi);
                            pos=new LatLng(location.getLatitude(),location.getLongitude());
                            sendButton.setEnabled(true);
                           // Toast.makeText(MainActivity.this,pos.toString(),Toast.LENGTH_LONG).show();
                            gmap.addMarker(new MarkerOptions().position(new LatLng(pos.latitude,pos.longitude)));
                            gmap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(),location.getLongitude())));

                        }
                    }
                });

            }
        });
        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY);
        }

        mapView = findViewById(R.id.mapView);
        mapView.onCreate(mapViewBundle);
        mapView.getMapAsync(this);





    }

    private String token;
    private void authenticate(){
        Login login=new Login("admin","admin");
        Call<Token> call=apiClient.authenticate(login);

        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(Call<Token> call, Response<Token> response) {
               if( response.isSuccessful())
               {
                   token=response.body().getJwt();
                   Toast.makeText(MainActivity.this,"Authenticated successfully",Toast.LENGTH_LONG).show();
               }
               else {
                   Toast.makeText(MainActivity.this,response.code(),Toast.LENGTH_LONG).show();
               }
            }
            @Override
            public void onFailure(Call<Token> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private void create(){

        PositionBody positionBody=new PositionBody(0,null,devID,Double.toString(lat),Double.toString(longi));

        Call<PositionBody> call=apiClient.create("Bearer "+token, positionBody);
        call.enqueue(new Callback<PositionBody>() {
            @Override
            public void onResponse(Call<PositionBody> call, Response<PositionBody> response) {
                if(response.isSuccessful())
                {

                    Toast.makeText(MainActivity.this,"Location Sent",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Authenticate First",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<PositionBody> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

    }


    private void requestPermissions()
    {
        ActivityCompat.requestPermissions(this,new String[]{ACCESS_FINE_LOCATION},1);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAP_VIEW_BUNDLE_KEY);
        if (mapViewBundle == null) {
            mapViewBundle = new Bundle();
            outState.putBundle(MAP_VIEW_BUNDLE_KEY, mapViewBundle);
        }

        mapView.onSaveInstanceState(mapViewBundle);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }
    @Override
    protected void onPause() {
        mapView.onPause();
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        mapView.onDestroy();
        super.onDestroy();
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {

        gmap = googleMap;
        gmap.setMinZoomPreference(15);

    }




}


