package g30126.bacs.andrei.l10.e6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Chronometer extends JFrame{
	JButton start,reset;
	JTextField counter;
	JLabel minLabel,secLabel,msecLabel;
	Timer timer;
	Chronometer() {
		setTitle("Chronometer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setSize(300,300);
		setVisible(true);
	}
	void init()
	{
		 this.setLayout(null);
		 
		 start =new JButton("Start");
		 start.setBounds(70, 50, 70, 20);
		 add(start);
		 start.addActionListener(new ButtonAction());
		 
		 reset=new JButton("Reset");
		 reset.setBounds(160,50,70,20);
		 add(reset);
		 reset.addActionListener(new ButtonAction());
		 
	/*	 counter=new JTextField();
		 counter.setBounds(50,100,200,100);
		 counter.setHorizontalAlignment(JTextField.CENTER);
		 add(counter);*/
		 
		 minLabel=new JLabel("00"+ " : ");
		 minLabel.setBounds(100, 100, 50, 20);
		 add(minLabel);
		 
		 secLabel=new JLabel("00"+ " : ");
		 secLabel.setBounds(130, 100, 50, 20);
		 add(secLabel);
		 
		 msecLabel=new JLabel("00");
		 msecLabel.setBounds(160,100,50,20);
		 add(msecLabel);
		 
		 timer=new Timer(this);
	}
	class ButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "Start":
				start.setText("Pause");
				if(!timer.isAlive())
					timer.start();
				timer.starting();
				break;
			case "Pause":
				start.setText("Start");
				timer.pause();
				break;
				
			case "Reset":
				timer.pause();
				timer.sec=0;
				timer.min=0;
				timer.msec=0;
				start.setText("Start");
				minLabel.setText(String.format("%02d",0) + " : ");
				secLabel.setText(String.format("%02d",0) + " : ");
				msecLabel.setText("00");
				break;
			}
			
		}
		
	}
		

		
	public static void main(String[] args) {
		new Chronometer();
	}

}
