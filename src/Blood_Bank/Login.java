package Blood_Bank;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Admin implements ActionListener
{
	JFrame f1;
    JTextField user;
	JPasswordField pass1;	  
	Admin()
	{
		    f1 = new JFrame(" Blood Bank Management System"); 
		    
		    Border b = BorderFactory.createLineBorder(Color.black, 2);
		    Border b1 = BorderFactory.createLineBorder(Color.black, 2);
		    
		    JLabel name = new JLabel("Username : ");
		    name.setFont(new Font("Algerian", Font.ITALIC, 25));
		    name.setBounds(450,70 ,300 , 40);
		    f1.add(name);
		    
		    user = new JTextField();
		    user.setFont(new Font("Arial", Font.ITALIC, 20));
		    user.setBounds(450,120,200,30);
		    f1.add(user);
		    
		    JLabel pass = new JLabel("Password : ");
		    pass.setFont(new Font("Algerian", Font.ITALIC, 25));
		    pass.setBounds(450,170 ,300 , 40);
		    f1.add(pass);
		    
		    pass1 = new JPasswordField();
		    pass1.setFont(new Font("Arial", Font.ITALIC, 20));
		    pass1.setBounds(450,220,200,30);
		    f1.add(pass1);
		    
		    JButton btn = new JButton("Login");
		    btn.setFont(new Font("Algerian", Font.ITALIC, 25));
		    btn.setBackground(Color.RED);
		    btn.setForeground(Color.BLACK);
		    btn.setBorder(new EmptyBorder(10,20,10,20));
		    btn.setBounds(500,270,120,40);
		    btn.setBorder(BorderFactory.createCompoundBorder(b,b));
		    btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    btn.addActionListener(this);
		    f1.add(btn);
		    
		    JLabel img2 = new JLabel();
		    img2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/6.jpg"));
		    img2.setBounds(420, 30,400 ,300 );
		    f1.add(img2);
		    
		    JLabel img1 = new JLabel();
		    img1.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpeg"));
		    img1.setBounds(400, 50,400 ,300 );
		    f1.add(img1);		        

		    JLabel img = new JLabel();
		    img.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/7.jpg"));
		    Dimension size = img.getPreferredSize();
		    img.setBounds(0, 0,1000 ,500 );
		    f1.add(img);
		    
		    f1.setUndecorated(true);
		    f1.setBounds(150,80,1000,500);
		    f1.setLayout(null);
		    f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	  {
		  if(user.getText().equals("bbms") && pass1.getText().equals("admin"))
		  {
			   new Home_Page();
			  f1.setVisible(false);
		  }
		  else
		  {
			  JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
		  }
	  }
}

public class Login 
{
	public static void main(String[] args)
	{
		new Admin();
	}
}
