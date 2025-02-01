package Blood_Bank;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import Blood_Bank.Login;

class Loading
{
	JFrame f;
	JProgressBar b;  
	Loading()
	{
		  f = new JFrame(" Blood Bank Management System");
		 
		  b = new JProgressBar();
	      b.setValue(0);
	      b.setBounds(50,430,900,20);
	      b.setForeground(Color.red);
	      b.setBackground(Color.BLACK);
	      b.setStringPainted( true );
	      f.add(b);
	      
	      JLabel name = new JLabel("Blood \n Bank");
	      name.setFont(new Font("Algerian", Font.ITALIC, 40));
	      name.setBounds(300,130 ,1000 , 40);
	      f.add(name);
	      
	      JLabel name1 = new JLabel("Management");
	      name1.setFont(new Font("Algerian", Font.ITALIC, 40));
	      name1.setBounds(300,200 ,1000 , 40);
	      f.add(name1);
	      
	      JLabel name2 = new JLabel("System");
	      name2.setFont(new Font("Algerian", Font.ITALIC, 40));
	      name2.setBounds(300,270 ,1000 , 40);
	      f.add(name2);
	        
	      JLabel img1 = new JLabel();
	      img1.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/2.png"));
	      Dimension size1 = img1.getPreferredSize();    
	      img1.setBounds(250, -20,500 ,500 );
	      f.add(img1);

	      JLabel img = new JLabel();
	      img.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/1.jpg"));
	      Dimension size = img.getPreferredSize();
	      img.setBounds(0, 0,1000 ,500 );
	      f.add(img);
	      
	      f.setUndecorated(true);
	      f.setBounds(150,80,1000,500);
	      f.setLayout(null);
	      f.setVisible( true );
	      fill();
	}
	 public void fill()
	  {
	      int i = 0;
	      try
	      {
	          while ( i <= 100)
	          {
	              b.setValue( i+5 );
	              Thread.sleep( 1000 );
	              i += 10;
	              if(i == 100 )
	              {
	                   new Admin();
	                  f.setVisible(false);
	              }
	          }  
	      }
	      catch (Exception e)
	      {
	          System.out.println( e );
	      }
	  }
}

public class Start
{
	public static void main(String[] args) 
	{
	   new	Loading();
	}
}
