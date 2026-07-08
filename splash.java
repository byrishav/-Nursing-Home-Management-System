import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;


import javax.swing.*;
import java.awt.Color;
public class splash extends JFrame implements ActionListener
{
	JButton ok = new JButton("Continue >>");
	JButton cancel = new JButton ("Close");
	//JLabel projectname = new JLabel ("NursingHome Automation System");
	//JLabel devloper = new JLabel("Developed By : RISHAV ARYA");
	//JTextField txdevloper = new JTextField("");
	String dev = "rishav";
	String input;
	 ImageIcon icon2 = new ImageIcon(getClass().getResource("loginpage.png"));
     Image img2 = icon2.getImage().getScaledInstance(1400,845, Image.SCALE_SMOOTH);
     JLabel pic = new JLabel(new ImageIcon(img2));
	
	public splash()
	{
		
		setSize(1400,745);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setTitle("Nursing Home Automation System");
	   setIconImage(icon2.getImage());
	   setVisible(true);
 		//projectname.setBounds(100,150,500,80);
		//projectname.setFont(new Font ("Onyx",Font.BOLD,45));
		//devloper.setBounds(320,610,500,80);
		//txdevloper.setBounds(250,260,150,35);
		ok.setBounds(40,600,150,50);
		pic.setBounds(0,0,1400,845);
		cancel.setBounds(200,600,150,50);
		ok.setBackground(new Color(239,230,220));
		ok.setFont (new Font("Arial",Font.BOLD,20));
		ok.setForeground(Color.BLACK);
		cancel.setFont (new Font("Arial",Font.BOLD,20));
	    cancel.setBackground(new Color(239,230,220));
		cancel.setForeground(Color.BLACK);
		//cancel.setFont (new Font("Arial",Font.BOLD,20));
		//add(projectname);
		//add(devloper);
		//add(txdevloper);
		add(ok);
		add(cancel);
		//add(logo);
		
		ok.addActionListener(this);
		
		cancel.addActionListener(this);
		add(pic);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==ok)
		{
			this.dispose();
	        login obj=new login();
		}
		if (e.getSource()==cancel)
		{
	       this.dispose();
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		splash obj = new splash();

	}

}
