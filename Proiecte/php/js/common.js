function registerPage() {
	location.href = 'register.html';
}

function fakeLogin()
{
	
	var username = $('#user').val().trim(); // select data from input and trim it
	var password = $('#password').val().trim(); // select data from input and trim it
	if (username.length > 0 && password.length > 0) {
       
	   if(username==localStorage.getItem("user") && password==localStorage.getItem("password")){
		   localStorage.setItem("loged",1)
		    location.href = 'pag1.html';
	   }
	   else
		   alert("User/Password incorrect");
	 
    }
	else
		alert("insert credentials");
}
function registerToLocal()
{
	var username = $('#user').val().trim(); 
	var password = $('#password').val().trim();
	var team=$("#team option:selected").text();
	var repeatPass = $('#repeatPass').val().trim(); 
	if (username.length > 0 && password.length > 0 && repeatPass.length >0 && team !='Select Team:') {
      
	  localStorage.setItem("user",username);
	  localStorage.setItem("password",password);
	  localStorage.setItem("team",'#'+team);
	   if(repeatPass==password){
		   alert(team);
		   location.href = 'log.html';
	   }
    }
	else
		alert("insert credentials");
}
