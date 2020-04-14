package g30126.bacs.andrei.l8.e3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncDenc {

	public static void main(String[] args)  {
	//	File file=new File("C:\\Users\\abacs\\Desktop\\UTCN\\AN II\\ISP\\lab8\\data.dec");
	//	File file2=new File("C:\\Users\\abacs\\Desktop\\UTCN\\AN II\\ISP\\lab8\\data.enc");
		char answer = 0;
		String linie;
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("meniu:");
			System.out.println("e-Encrypt");
			System.out.println("d-Decrypt");
			System.out.println("t- Exit");
			try {
				linie=bReader.readLine();
				answer=linie.charAt(0);
				linie=bReader.readLine();
				File fileprim=new File(linie+".txt");
				File file=new File(linie+".dec");
				File file2=new File(linie+".enc");
				switch (answer) {
				case 'e':
					if(fileprim.exists()) {
						FileInputStream inputStream=new FileInputStream(fileprim);
						FileOutputStream outputStream=new FileOutputStream(file2);
						while(inputStream.available()>0)
						{
							char caracter=(char)inputStream.read();
							caracter+=1;
							outputStream.write((byte)caracter);
						}
						inputStream.close();
						outputStream.close();
					}
					break;
				case 'd':
					if (file2.exists()) {
						FileInputStream inputStream=new FileInputStream(file2);
						FileOutputStream outputStream=new FileOutputStream(file);
						while (inputStream.available()>0) {
							char carater2=(char)inputStream.read();
							carater2-=1;
							outputStream.write((byte)carater2);
						}
						inputStream.close();
						outputStream.close();
					}
					break;

				default:
					break;
				}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} while (answer!='t');
		
	/*	if(file.exists() && file2.exists())
		{
			try {
				FileInputStream inputStream= new FileInputStream(file);
				FileOutputStream outputStream=new FileOutputStream(file2);
				while(inputStream.available()>0)
				{
					char caracter=(char)inputStream.read();
					caracter+=1;
					outputStream.write((byte)caracter);

				}
				inputStream.close();
				outputStream.close();
			}
			catch (IOException e) {
				// TODO: handle exception
			}
*/
		
}
	}
