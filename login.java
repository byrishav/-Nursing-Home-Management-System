import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import java.applet.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class login extends JFrame implements ActionListener,FocusListener
{
	//
	ImageIcon icon = new ImageIcon("admin.png");
    Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
     JLabel lblpic = new JLabel(new ImageIcon(img));
	 
	 ImageIcon icon3 = new ImageIcon("login5.jpg");
	 Image img3 = icon3.getImage().getScaledInstance(1540,780, Image.SCALE_SMOOTH);
     JLabel pic = new JLabel(new ImageIcon(img3));

	 //
	 ImageIcon icon2 = new ImageIcon("pass.png");
     Image img2 = icon2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
     JLabel passpic = new JLabel(new ImageIcon(img2));
     //btns
   
	 
	JLabel formname = new JLabel ("Login");
	
	JTextField txusername = new JTextField("username");
	JPasswordField txpassword = new JPasswordField("password");
	JButton btnlogin = new JButton("Log In");
	JButton btncancel = new JButton("cancel");
	//
	Label[] loading = new Label[10];
	int x=0;
	
	
	public login()
	{
		setSize(1380,765);
	 setLocationRelativeTo(null);
	 getContentPane().setBackground(new Color(130, 211, 243));
	 setLayout(null);
	 setUndecorated(true);
     setResizable(false);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	 pic.setBounds(8,0,1380,765);
		//getContentPane().setBackground(new Color(173, 216, 230));
		txusername.setBounds(970,305,300,45);
	
		//label1.setBounds(10,20,40,40);
		//add(label1);
		//JLabel lformname = new JLabel("DOCTOR FORM",SwingConstants.CENTER);
		txusername.setForeground(new Color(160,160,160));
		txusername.setFont (new Font("Centaur",Font.BOLD,20));
		txpassword.setBounds(970,365,300,45);
		txpassword.setForeground(new Color(160,160,160));
		txpassword.setFont (new Font("Centaur",Font.BOLD,20));
		btnlogin.setBounds(970,475,300,45);
		btnlogin.setFont (new Font("Arial",Font.BOLD,30));
		btnlogin.setBackground(new Color(0,0,255));
		btnlogin.setForeground(new Color(255,255,255));
		btncancel.setBounds(1390,545,400,60);
		btncancel.setFont (new Font("Arial",Font.BOLD,27));
		btncancel.setBackground(new Color(0,0,0));
		
		
		//
		lblpic.setBounds(733,130,400,400);
		passpic.setBounds(733,184,400,400);
		//
		
		int x=0;
		for(int i=0;i<10;i++)
			{
				
			 loading[i]=new Label(" ");
			 loading[i].setBounds(1380+x,700,30,30);
			 loading[i].setVisible(false);
			 loading[i].setFont(new Font("Arial",Font.BOLD,20));
			 add(loading[i]);
			 loading[i].setBackground(new Color(255,255,255));
			 x=x+45;
			 
			}
			 
		
		btncancel.setForeground(new Color(255,255,255));
		formname.setBounds(1050,140,980,70);
		formname.setFont (new Font("Gadugi",Font.BOLD,50));
		
		formname.setForeground(new Color(255,255,255));
		//label.setBounds(50,50,200,200);
		add(lblpic);
		add(passpic);
		
		add(txusername);
		add(txpassword);
		add(formname);
		add(btnlogin);
		add(btncancel);
		add(pic);
		txusername.addActionListener(this);
		txpassword.addActionListener(this);
		btnlogin.addActionListener(this);
		txusername.addFocusListener(this);
		txpassword.addFocusListener(this);
		repaint();
	}
		String abc ="username";
		String abc2 ="password";
		int flg =0;
		int flg1 =0;
		//focusListener
			  public void focusGained(FocusEvent a)
		     {
			 }
		     public void focusLost (FocusEvent a)
		     {
				 //1
				 
				 if(a.getSource()==txusername)
				{
					if (flg ==0)
					{
					abc ="";
					txusername.setText(abc);
					flg=1;
					}
					txusername.setFont (new Font("Arial",Font.BOLD,20));
					txusername.setForeground(new Color(0,0,0));
				}
				//2
				 if(a.getSource()==txpassword)
				{
					if (flg1 ==0)
					{
					abc2 ="";
					txpassword.setText(abc2);
					flg1=1;
					}
					txpassword.setFont (new Font("Arial",Font.BOLD,20));
					txpassword.setForeground(new Color(0,0,0));
				}
				
			 }
		
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==btnlogin)
		{
			int a;
            try
            {
            	int flg=0;
            	Connection connection =DriverManager.getConnection("jdbc:odbc:nursingdsn");
            	Statement st= connection .createStatement();
            	String str="Select * from logintbl where user='"+txusername.getText()+"' and pwd='"+txpassword.getText()+"'";
            	ResultSet res=st.executeQuery(str);
            	while(res.next()) 
            	{
            		flg=1;
			
            	}
            	if(flg==0)
            	{
            		JOptionPane.showMessageDialog(null,"Invalid login");
                    //txusername.setText("");
                    //txpassword.setText("");
                    txusername.requestFocus(true);
            	}
				if(flg ==1 )
				{
					this.dispose();
					master obj = new master();
					//for (a=0;a<15;a++)
				//	{
					//	loading[a].setVisible(true);
					//	for(double k =1 ; k< 200000000;k++);
					//	x=1;
						
					//}
					
				}
				
					
				
				
            }
            catch(Exception ee)
            {
            	System.out.println(ee);
            }
		}
		
		
    }


	public static void main(String[] args) 
	{
		login obj = new login();

	}

}
