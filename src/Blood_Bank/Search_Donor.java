package Blood_Bank;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

class Search_Donor_Details implements ActionListener
{
	   JFrame f1;
	   JTextField e_donorid;
	   JLabel donor,age,gender,phone,aadhar,address,blood_g,blood_denote,display,
	   fdonor,fage,fgender,fphone,faadhar,faddress,fblood_g,fblood_denote;
	   JButton search,back,print;
	
	   Search_Donor_Details()
	{
		   f1 = new JFrame("Search"); 

		    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
		    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
		    
		    JLabel lb1 = new JLabel("Search Donor");
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
		    
		    fdonor = new JLabel();
		    fdonor.setFont(new Font("Arial", Font.BOLD,17));
		    fdonor.setForeground(Color.BLACK);
		    fdonor.setBounds(115,180,180,30);
		    f1.add(fdonor);
		    
		    age = new JLabel("Age");
		    age.setFont(new Font("Arial", Font.BOLD,20));
		    age.setForeground(Color.RED);
		    age.setBounds(330,140,180,30);
		    f1.add(age);
		    
		    fage = new JLabel();
		    fage.setFont(new Font("Arial", Font.BOLD,17));
		    fage.setForeground(Color.BLACK);
		    fage.setBounds(330,180,180,30);
		    f1.add(fage);
		    
		    gender = new JLabel("Gender");
		    gender.setFont(new Font("Arial", Font.BOLD,20));
		    gender.setForeground(Color.RED);
		    gender.setBounds(540,150,180,30);
		    f1.add(gender);
		    
		    fgender = new JLabel();
		    fgender.setFont(new Font("Arial", Font.BOLD,17));
		    fgender.setForeground(Color.BLACK);
		    fgender.setBounds(540,180,180,30);
		    f1.add(fgender);
		    
		    phone = new JLabel("Phone");
		    phone.setFont(new Font("Arial", Font.BOLD,20));
		    phone.setForeground(Color.RED);
		    phone.setBounds(115,250,180,30);
		    f1.add(phone);
		    
		    fphone = new JLabel();
		    fphone.setFont(new Font("Arial", Font.BOLD,17));
		    fphone.setForeground(Color.BLACK);
		    fphone.setBounds(115,280,180,30);
		    f1.add(fphone);
		    
		    aadhar = new JLabel("Email");
		    aadhar.setFont(new Font("Arial", Font.BOLD,20));
		    aadhar.setForeground(Color.RED);
		    aadhar.setBounds(330,250,180,30);
		    f1.add(aadhar);
			
		    faadhar = new JLabel();
		    faadhar.setFont(new Font("Arial", Font.BOLD,17));
		    faadhar.setForeground(Color.BLACK);
		    faadhar.setBounds(330,280,180,30);
		    f1.add(faadhar);
		    
		    blood_g = new JLabel("Blood Group");
		    blood_g.setFont(new Font("Arial", Font.BOLD,20));
		    blood_g.setForeground(Color.RED);
		    blood_g.setBounds(540,250,180,30);
		    f1.add(blood_g);
		    
		    fblood_g = new JLabel();
		    fblood_g.setFont(new Font("Arial", Font.BOLD,17));
		    fblood_g.setForeground(Color.BLACK);
		    fblood_g.setBounds(540,280,180,30);
		    f1.add(fblood_g);
		    
		    blood_denote = new JLabel("Blood Denote (ml)");
		    blood_denote.setFont(new Font("Arial", Font.BOLD,20));
		    blood_denote.setForeground(Color.RED);
		    blood_denote.setBounds(115,350,180,30);
		    f1.add(blood_denote);
		    
		    fblood_denote = new JLabel();
		    fblood_denote.setFont(new Font("Arial", Font.BOLD,17));
		    fblood_denote.setForeground(Color.BLACK);
		    fblood_denote.setBounds(115,380,180,30);
		    f1.add(fblood_denote);
		    
		    address = new JLabel("Address");
		    address.setFont(new Font("Arial", Font.BOLD,20));
		    address.setForeground(Color.RED);
		    address.setBounds(330,350,180,30);
		    f1.add(address);
		    
		    
		    faddress = new JLabel();
		    faddress.setFont(new Font("Arial", Font.BOLD,17));
		    faddress.setForeground(Color.BLACK);
		    faddress.setBounds(330,380,280,30);
		    f1.add(faddress);
		    
		    
		    back = new JButton("Close");
		    back.setFont(new Font("Arial", Font.BOLD,20));
		    back.setBackground(Color.RED);
		    back.setForeground(Color.BLACK);
		    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
		    back.setBounds(650,400,150,40);
		    back.addActionListener(this);
	        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    back.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
		    f1.add(back);
		    
		    print = new JButton("Save");
		    print.setFont(new Font("Arial", Font.BOLD,20));
		    print.setBackground(Color.RED);
		    print.setForeground(Color.BLACK);
		    print.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/save.png"));
		    print.setBounds(450,400,150,40);
		    print.addActionListener(this);
		    print.setVisible(false);
	        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    print.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
		    f1.add(print);
		    
		    JPanel p =new JPanel();
		    JLabel l1,l2,l3,l4,l5;
		    p.setBounds(900,100,250,350);
		    p.setBackground(Color.RED);
		    l1= new JLabel(" The Gift of ");
		    l2= new JLabel(" Blood is a    ");
		    l3= new JLabel(" Gift to ");
		    l4= new JLabel("Someone's Life");
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
	   			        int get_id = rs.getInt(1);
	   			        String str_id = String.valueOf(get_id);
	   			        
	   			    	if(s_id.equals(str_id))
	   			    	{
	   			   		    print.setVisible(true);
 
	   			   		 
	   			    		String d_name1 = rs.getString(2);
	   				 		fdonor.setText(d_name1);
	   				 		
	   				 		 int d_age = rs.getInt(3);
	   				 		 String str = String.valueOf(d_age);
	   						 fage.setText(str);
	   						 
	   						 String d_gender = rs.getString(4);
	   					 	 fgender.setText(d_gender);
	   					 	 
	   					 	 String d_phone = rs.getString(5);
	   						 fphone.setText(d_phone);
	   						  
	   						 String d_aadhar = rs.getString(6);
	   						 faadhar.setText(d_aadhar);
	   						 
	   						 String d_bloodg= rs.getString(7);
	   						 fblood_g.setText(d_bloodg);
	   						 
	   						 int d_unit = rs.getInt(8);
	   				 		 String str1 = String.valueOf(d_unit);
	   				 		 fblood_denote.setText(str1);
	   						 
	   				 		 String d_address = rs.getString(9);
	   						 faddress.setText(d_address); 
	   			    	}
	   			    	else
				    	{
						  JOptionPane.showMessageDialog(null,"Incorrect Username or Password");  				  		  
				    	}	
	   			    	  
	   		        }
	   			 
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
	   	if(e.getSource() == print)
	   	{
	   	   

	   	  JFileChooser jf = new JFileChooser(new File("C:\\Users\\sakshi yadav\\eclipse-workspace\\Blood_Bank_System\\Details_Store\\Donor"));
	   	  jf.showSaveDialog(f1);
	   	  File f = jf.getSelectedFile();
	   	 
	   	  try
	   	  {
	   	   FileWriter fw = new FileWriter(f);
	   	  
	   	   String id = "ID :- " + e_donorid.getText();
	   	   fw.write(id);
	   	  
	   	   String name = "\n\nName :- " + fdonor.getText();
	   	   fw.write(name);
	   	   
	   	   String age = "\n\nAge :- " + fage.getText();
	   	   fw.write(age);
	   	   
	   	   String gender = "\n\nGender :- " + fgender.getText();
	   	   fw.write(gender);
	   	   
	   	   String phone = "\n\nPhone :- " + fphone.getText();
	   	   fw.write(phone);
	   	   
	   	   String email = "\n\nEmail :- " + faadhar.getText();
	   	   fw.write(email);
	   	   
	   	   String blood_group = "\n\nBlood Group :-" +  fblood_g.getText();
	   	   fw.write(blood_group);
	   	   
	   	   String  denote = "\n\nBlood Donated :- "+ fblood_denote.getText();
	   	   fw.write(denote);
	   	  
	   	   String  address = "\n\nAddress :- " + faddress.getText();
	   	   fw.write(address);
	   	   
	   	   fw.close();
	   	  }
	   	  catch(Exception e1)
	   	  {
	   		 System.out.println(e1); 
	   	  }
	   	}
	   }
}
public class Search_Donor
{
	public static void main(String[] args)
	{
	 new Search_Donor_Details();
	}
}
