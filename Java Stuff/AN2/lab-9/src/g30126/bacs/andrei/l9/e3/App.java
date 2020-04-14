package g30126.bacs.andrei.l9.e3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App extends JFrame{
	JTextField textField;
	JTextArea area;

	public App() {
		setTitle("App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		init();
		setVisible(true);
		
	}
	void init()
	{
		this.setLayout(null);
		JButton button=new JButton("Apasa");
		button.setBounds(200, 150,100, 30);
		JTextField textField=new JTextField();
		textField.setBounds(150, 50, 200, 20);
		JTextArea area=new JTextArea();
		area.setBounds(10, 300, 460, 150);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File file=new File(textField.getText());
				if(file.exists())
				{
					try {
						FileInputStream inputStream=new FileInputStream(file);
						while(inputStream.available()>0)
						{
							area.append((char)inputStream.read()+"");
						}
						
					} catch (IOException e2) {
						System.out.println(e2.getStackTrace());
					}
				}
				else {
					area.setText("file not found");
				}
			}
		});
		add(button);add(textField);add(area);
	}
	public static void main(String[] args) {
		App app=new App();
	}

}
