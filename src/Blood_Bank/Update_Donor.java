package Blood_Bank;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


class Update_Donor_Details implements ActionListener
{

	   JFrame f1;
	   JLabel donor,age,gender,phone,aadhar,blood_denote,address;
	   JTextField e_donorid,donor1,age1,phone1,aadhar1,blood_denote1;
	   JComboBox gender1;
	   JTextArea add;
	   JButton search,update,back;
	   
	Update_Donor_Details()
	{
		 f1 = new JFrame(" Blood Bank Management System");

		    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
		    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
		    
		    JLabel lb1 = new JLabel("Update Donor");
		    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
		    lb1.setForeground(Color.WHITE);
		    lb1.setBounds(450,20 ,700 , 40);
		    f1.add(lb1);
		    
		    JLabel donor_id = new JLabel("Enter the Donor ID : ");
		    donor_id.setFont(new Font("Arial", Font.BOLD,20));
		    donor_id.setForeground(Color.RED);
		    donor_id.setBounds(150,80,200,40);
		    f1.add(donor_id);
		    
		    e_donorid = new JTextField();
		    e_donorid.setFont(new Font("Arial", Font.BOLD,15));
		    e_donorid.setForeground(Color.BLACK);
		    e_donorid.setBounds(370,80,150,40);
		    e_donorid.setBorder(bdr);
		    f1.add(e_donorid);
		    
		    search = new JButton("Search");
		    search.setFont(new Font("Arial", Font.BOLD,20));
		    search.setBackground(Color.RED);
		    search.setForeground(Color.BLACK);
		    search.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/search user.png"));
		    search.setBounds(550,80,150,40);
		    search.addActionListener(this);
		    search.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    search.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
		    f1.add(search);
		    
		    donor = new JLabel("Donor Name");
		    donor.setFont(new Font("Arial", Font.BOLD,20));
		    donor.setForeground(Color.RED);
		    donor.setBounds(115,140,180,30);
		    f1.add(donor);

		    
		    donor1 = new JTextField();
		    donor1.setFont(new Font("Arial", Font.BOLD,15));
		    donor1.setForeground(Color.BLACK);
		    donor1.setBounds(115,180,180,30);
		    donor1.setEnabled(false);
		    donor1.setBorder(bdr);
		    f1.add(donor1);
		    
		    age = new JLabel("Age");
		    age.setFont(new Font("Arial", Font.BOLD,20));
		    age.setForeground(Color.RED);
		    age.setBounds(330,140,180,30);
		    f1.add(age);
		    
		    age1 = new JTextField();
		    age1.setFont(new Font("Arial", Font.BOLD,15));
		    age1.setForeground(Color.BLACK);
		    age1.setBounds(330,180,180,30);
		    age1.setEnabled(false);
		    age1.setBorder(bdr);
		    f1.add(age1);
		    
		    phone = new JLabel("Phone");
		    phone.setFont(new Font("Arial", Font.BOLD,20));
		    phone.setForeground(Color.RED);
		    phone.setBounds(540,150,180,30);
		    f1.add(phone);
		    
		    phone1 = new JTextField();
		    phone1.setFont(new Font("Arial", Font.BOLD,15));
		    phone1.setForeground(Color.BLACK);
		    phone1.setBounds(540,180,180,30);
		    phone1.setEnabled(false);
		    phone1.setBorder(bdr);
		    f1.add(phone1);
		    
		    
		    aadhar = new JLabel("Email");
		    aadhar.setFont(new Font("Arial", Font.BOLD,20));
		    aadhar.setForeground(Color.RED);
		    aadhar.setBounds(115,250,180,30);
		    f1.add(aadhar);
		    
		    aadhar1 = new JTextField();
		    aadhar1.setFont(new Font("Arial", Font.BOLD,15));
		    aadhar1.setForeground(Color.BLACK);
		    aadhar1.setBounds(115,290,180,30);
		    aadhar1.setEnabled(false);
		    aadhar1.setBorder(bdr);
		    f1.add(aadhar1);
		    
		    blood_denote = new JLabel("Blood Denote (ml)");
		    blood_denote.setFont(new Font("Arial", Font.BOLD,20));
		    blood_denote.setForeground(Color.RED);
		    blood_denote.setBounds(330,250,180,30);
		    f1.add(blood_denote);
		     
		    blood_denote1 = new JTextField();
		    blood_denote1.setFont(new Font("Arial", Font.BOLD,15));
		    blood_denote1.setForeground(Color.BLACK);
		    blood_denote1.setBounds(330,290,180,30);
		    blood_denote1.setEnabled(false);
		    blood_denote1.setBorder(bdr);
		    f1.add(blood_denote1);
		    
		    address = new JLabel("Address");
		    address.setFont(new Font("Arial", Font.BOLD,20));
		    address.setForeground(Color.RED);
		    address.setBounds(115,350,180,30);
		    f1.add(address);
		    
		    add = new JTextArea(10,10);
		    add.setFont(new Font("Arial", Font.BOLD,15));
		    add.setForeground(Color.BLACK);
		    add.setBounds(115,390,400,80);
		    add.setEnabled(false);
		    add.setBorder(bdr);
		    f1.add(add);
		    
		    JPanel p =new JPanel();
		    JLabel l1,l2,l3,l4,l5;
		    p.setBounds(900,100,250,350);
		    p.setBackground(Color.RED);
		    l1= new JLabel(" One Bag of ");
		    l2= new JLabel(" Blood can   ");
		    l3= new JLabel(" Bring Back one   ");
		    l4= new JLabel(" From Dead ");
		    l1.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		    l1.setForeground(Color.WHITE);
		    l1.setBounds(10,10,200,30);
		    p.add(l1);
		    l2.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		    l2.setForeground(Color.WHITE);
		    l2.setBounds(10,70,200,30);
		    p.add(l2);
		    l3.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		    l3.setForeground(Color.WHITE);
		    l3.setBounds(10,120,200,30);
		    p.add(l3);
		    l4.setFont(new Font("Comic Sans MS", Font.BOLD,30));
		    l4.setForeground(Color.WHITE);
		    l4.setBounds(10,170,200,30);
		    l5 = new JLabel();
		    l5.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/donate.png"));
	        l5.setBounds(10,210,100,100);
	        p.add(l4);
		    p.add(l5);
		    p.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
		    f1.add(p);
		    
		    update = new JButton("Update");
		    update.setFont(new Font("Arial", Font.BOLD,20));
		    update.setBackground(Color.RED);
		    update.setForeground(Color.BLACK);
		    update.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/save.png"));
		    update.setBounds(600,270,150,40);
	        update.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    update.addActionListener(this);
		    update.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
		    f1.add(update);
		    
		    back = new JButton("Close");
		    back.setFont(new Font("Arial", Font.BOLD,20));
		    back.setBackground(Color.RED);
		    back.setForeground(Color.BLACK);
		    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
		    back.setBounds(600,340,150,40);
		    back.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    back.addActionListener(this);
		    f1.add(back);

			
		    JLabel img2 = new JLabel();
		    img2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
		    img2.setBounds(100,60,1000 ,450 );
		    img2.setBorder(bdr);
		    f1.add(img2);
		    
		    JLabel img = new JLabel();
		    img.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/9.jpg"));
		    img.setBounds(0, 0,1270 ,650 );
		    f1.add(img);
		    

		    
		    f1.setUndecorated(true);
		    f1.setBounds(50,50,1200,600);
		    f1.setLayout(null);
		    f1.setResizable(false);
		    f1.setVisible(true);
	}
	 public void actionPerformed(ActionEvent e) 
	    {
	    	
	    	String s_id = e_donorid.getText();
	    	String b_ml = blood_denote1.getText();
	    	//   JTextField e_donorid,donor1,age1,phone1,aadhar1,blood_denote1;
	    	
	    	
	    	if(e.getSource() == search)
	    	{
	    		if(s_id.equals(""))
	 		   {
	 		        JOptionPane.showMessageDialog(null,"Enter a valid Donor ID");
	    
	 		   }
	    		else
	    		{
	    			
	    		
	    		try
	 		   {
	 			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
	 			   java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	 		       ResultSet rs = st.executeQuery("Select * from donor where id ="+s_id);
	 		
				  
	 		      while(rs.next())
			       {
	 		 
	 		        
	 		    	  String d_name1 = rs.getString(2);
	 		 		  donor1.setText(d_name1);   
	 		 		  donor1.setEnabled(true);
	 		 		  
	 		 		  int d_age = rs.getInt(3);
	 		 		  String str = String.valueOf(d_age);
					  age1.setText(str);
					  age1.setEnabled(true);
					  
					  String d_phone = rs.getString(5);
					  phone1.setText(d_phone);
					  phone1.setEnabled(true);
					  
					  String d_aadhar = rs.getString(6);
					  aadhar1.setText(d_aadhar);
					  aadhar1.setEnabled(true);
					  
					  int d_unit = rs.getInt(8);
	 		 		  String str1 = String.valueOf(d_unit);
	 		 		  blood_denote1.setText(str1);
	 		 		  blood_denote1.setEnabled(true);
	 		 		 
	 		 		 
	 				  String d_address = rs.getString(9);
	 				  add.setText(d_address);
	 				  add.setEnabled(true);
	 		         }
	 		       }
	 		   
	    		catch(Exception f)
	 		   {
	 			   System.out.println(f);
	 		   }
	    		}
	    	}
	    	if(e.getSource() == update)
			  {
		    		if(donor1.getText().equals("") && age1.getText().equals("") && phone1.getText().equals("") && aadhar1.getText().equals("") && blood_denote1.getText().equals(""))
		    		{
		    	        JOptionPane.showMessageDialog(null,"All Field are Required");
		    		}
		    		else
		    		{	
			    		 try
			    		 {
			    		   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			  			   String query = (" Update donor set donor =  '" +donor1.getText() + "',age = '" +age1.getText()+"',phone =  '" +phone1.getText()+ "',email = '" +aadhar1.getText()+"',blood_unit ='"+ b_ml + "',address = '" +add.getText() +"' where id ='"+s_id+"' ") ;
			  			   PreparedStatement ps = connection.prepareStatement(query);
			  			   ps.execute();
			  			   
			  		       JOptionPane.showMessageDialog(null,"Data Updated Successfully");
			  		       connection.close();
			  		       f1.setVisible(false);
						    new Home_Page();
			
			    		}
			    		catch(Exception f)
			 		   {
			 			   System.out.println(f);
			 		   }
		    		}
			  }
	    	
	    	if(e.getSource() == back)
			  {
			      new Home_Page();
				  f1.setVisible(false);
			  }
	    		
		
	    }
}

public class Update_Donor
{
	public static void main(String[] args)
	{
	  new Update_Donor_Details();	
	}
}
