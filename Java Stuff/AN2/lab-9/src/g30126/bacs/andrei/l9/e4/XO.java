package g30126.bacs.andrei.l9.e4;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class XO extends JFrame implements ActionListener{
	JButton [] buttons=new JButton[9];
	int cout=0;
	private String letter="";
			
	public XO() {
		setTitle("XO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLayout (new GridLayout (3, 3));
		setVisible(true);
		
		init();
	}
	void init() {
		cout=0;
		for(int i=0;i<9;i++)
		{
			buttons[i]=new JButton("");
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
	}
	public void actionPerformed(ActionEvent e) {
		cout++;
		ImageIcon X=new ImageIcon("X.png");
		ImageIcon O=new ImageIcon("O.png");
		if(cout%2==0)
		{
			letter="x";
		}
		else {
			letter="o";
		}
		for(JButton jButton:buttons)
		{
			if(e.getSource()==jButton)
			{	
				switch (letter) {
				case "x":
					jButton.setText(letter);
					//jButton.setIcon(X);
					jButton.setEnabled(false);
					break;
				case "o":
					jButton.setText(letter);
					//jButton.setIcon(O);
					jButton.setEnabled(false);
					break;
				}
			}
		}
			
		}

	public static void main(String[] args) {
		XO xo=new XO();
	}

}
