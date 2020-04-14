package g30126.bacs.andrei.l9.e2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter extends JFrame{

	int nr=0;
	public Counter() {
	setTitle("counter");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	init();
	setSize(500, 500);
	setVisible(true);
	}
	void init() {
		
		this.setLayout(null);
		JButton button = new JButton("Apasa");
		button.setBounds(200,400,100,30);
		JLabel label=new JLabel();
		label.setBounds(200,200,100,100);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nr++;
				label.setText(nr+" ");
				
			}
		});
		add(button);
		add(label);
	}
	public static void main(String[] args) {
		Counter counter=new Counter();
	}

}
