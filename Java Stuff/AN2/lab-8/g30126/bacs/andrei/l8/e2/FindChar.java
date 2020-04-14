package g30126.bacs.andrei.l8.e2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FindChar {

	public static void main(String[] args) {
		int cout=0;
		File file=new File("C:\\Users\\abacs\\Desktop\\UTCN\\AN II\\ISP\\lab8\\data.txt");
		if(file.exists())
		{
			try {
				FileInputStream inputStream= new FileInputStream(file);
				while(inputStream.available()>0)
				{
					char caracter=(char)inputStream.read();
					if(caracter=='e')
					{
						cout++;
					}
				}
				System.out.println(cout);
				inputStream.close();}
			catch (IOException e) {
				// TODO: handle exception
			}

}
	}
}
