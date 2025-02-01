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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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


class Add_Patients_Details implements ActionListener
{
   JLabel pateint,pateint_id,id1,age,gender,phone,aadhar,blood_g,blood_denote,donor_id,id,address;
   JTextField pateint_t,age1,phone1,aadhar1,blood_denote1;
   JComboBox gender1,blood_g1;
   JButton save,reset,back;
   JTextArea add;
   JFrame f1;
   int p , a, a1 ;
   String getMail;

	Add_Patients_Details()
	{
		f1 = new JFrame("Pateints"); 

	    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
	    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
	    
	    JLabel lb1 = new JLabel("Patients");
	    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
	    lb1.setForeground(Color.WHITE);
	    lb1.setBounds(450,20 ,700 , 40);
	    f1.add(lb1);
	    
	    pateint = new JLabel("Pateint Name");
	    pateint.setFont(new Font("Arial", Font.BOLD,20));
	    pateint.setForeground(Color.RED);
	    pateint.setBounds(150,90,200,30);
	    f1.add(pateint);

	    
	    pateint_t = new JTextField();
	    pateint_t.setFont(new Font("Arial", Font.BOLD,15));
	    pateint_t.setForeground(Color.BLACK);
	    pateint_t.setBounds(300,90,200,30);
	    pateint_t.setBorder(bdr);
	    f1.add(pateint_t);

	    
	    pateint_id = new JLabel("Pateint ID");
	    pateint_id.setFont(new Font("Arial", Font.BOLD,20));
	    pateint_id.setForeground(Color.RED);
	    pateint_id.setBounds(700,90,200,30);
	    f1.add(pateint_id);
	    
	    id1 = new JLabel();
	    id1.setFont(new Font("Arial", Font.BOLD,20));
	    id1.setForeground(Color.RED);
	    try
	    {
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
	    	java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        ResultSet rs = st.executeQuery("Select max(id) from pateints");

			if(rs.first())
			{
				
				int id2 = rs.getInt(1);
				id2 = id2 + 1;
				String str = String.valueOf(id2);
				id1.setText(str);
		     }
			rs.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }

	    id1.setBounds(800,90,200,30);
	    f1.add(id1);

	    
	    age = new JLabel("Age");
	    age.setFont(new Font("Arial", Font.BOLD,20));
	    age.setForeground(Color.RED);
	    age.setBounds(115,150,180,30);
	    f1.add(age);
	    
	    age1 = new JTextField();
	    age1.setFont(new Font("Arial", Font.BOLD,15));
	    age1.setForeground(Color.BLACK);
	    age1.setBounds(115,190,180,30);
	    age1.setBorder(bdr);
	    f1.add(age1);
	    
	    gender = new JLabel("Gender");
	    gender.setFont(new Font("Arial", Font.BOLD,20));
	    gender.setForeground(Color.RED);
	    gender.setBounds(330,150,180,30);
	    f1.add(gender);
	    
	    String g[] = {"Male" , "Female"};
	    gender1 = new JComboBox(g);
	    gender1.setFont(new Font("Arial", Font.BOLD,15));
	    gender1.setForeground(Color.BLACK);
	    gender1.setBounds(330,190,180,30);
	    gender1.setBorder(bdr);
	    f1.add(gender1);
	    
	    
	    phone = new JLabel("Phone");
	    phone.setFont(new Font("Arial", Font.BOLD,20));
	    phone.setForeground(Color.RED);
	    phone.setBounds(540,150,180,30);
	    f1.add(phone);
	    
	    phone1 = new JTextField();
	    phone1.setFont(new Font("Arial", Font.BOLD,15));
	    phone1.setForeground(Color.BLACK);
	    phone1.setBounds(540,190,180,30);
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
	    aadhar1.setBorder(bdr);
	    f1.add(aadhar1);
	    
	    blood_g = new JLabel("Blood Group");
	    blood_g.setFont(new Font("Arial", Font.BOLD,20));
	    blood_g.setForeground(Color.RED);
	    blood_g.setBounds(330,250,180,30);
	    f1.add(blood_g);
	    
	    String b1[] = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};
	    blood_g1 = new JComboBox(b1);
	    blood_g1.setFont(new Font("Arial", Font.BOLD,15));
	    blood_g1.setForeground(Color.BLACK);
	    blood_g1.setBounds(330,290,180,30);
	    blood_g1.setBorder(bdr);
	    f1.add(blood_g1);
	    
	    address = new JLabel("Address");
	    address.setFont(new Font("Arial", Font.BOLD,20));
	    address.setForeground(Color.RED);
	    address.setBounds(115,350,180,30);
	    f1.add(address);
	    
	    add = new JTextArea(10,10);
	    add.setFont(new Font("Arial", Font.BOLD,15));
	    add.setForeground(Color.BLACK);
	    add.setBounds(115,390,400,80);
	    add.setBorder(bdr);
	    f1.add(add);
	    
	    
	    JPanel p =new JPanel();
	    JLabel l1,l2,l3,l4,l5;
	    p.setBounds(930,100,250,350);
	    p.setBackground(Color.RED);
	    l1= new JLabel("    Be The     ");
	    l2= new JLabel("      Reason of   ");
	    l3= new JLabel("    Someone's    ");
	    l4= new JLabel("    HeartBeat    ");
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
	    
	    
	    save = new JButton("Add");
	    save.setFont(new Font("Arial", Font.BOLD,20));
	    save.setBackground(Color.RED);
	    save.setForeground(Color.BLACK);
	    save.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/Add new.png"));
	    save.setBounds(750,150,150,40);
        save.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    save.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    save.addActionListener(this);
	    f1.add(save);
	    
	    reset = new JButton("Reset");
	    reset.setFont(new Font("Arial", Font.BOLD,20));
	    reset.setBackground(Color.RED);
	    reset.setForeground(Color.BLACK);
	    reset.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/reset.png"));
	    reset.setBounds(750,230,150,40);
	    reset.addActionListener(this);
        reset.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    reset.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(reset);
	    
	    back = new JButton("Back");
	    back.setFont(new Font("Arial", Font.BOLD,20));
	    back.setBackground(Color.RED);
	    back.setForeground(Color.BLACK);
	    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
	    back.setBounds(750,310,150,40);
	    back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    back.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
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
	  	   String pname = pateint_t.getText();
	  	   String p_id = id1.getText();
	  	   String page = age1.getText();
	  	   String pgender = gender1.getSelectedItem().toString();
	  	   String pphone = phone1.getText();
	  	   String pemail = aadhar1.getText();
	  	   String pblood = blood_g1.getSelectedItem().toString();
	  	   String padd1 = add.getText();
	  	   p = pphone.length();
	  	   
	  	   getMail = aadhar1.getText();
		   String regex = "^(.+)@(.+)$";
		   Pattern pattern = Pattern.compile(regex); 
		   Matcher matcher = pattern.matcher(getMail);  
	  	 if(e.getSource() == save)
		  {
		   if(pname.equals("") && page.equals("") && pphone.equals("") && pemail.equals("") )
		   {
	       JOptionPane.showMessageDialog(null,"All Field are Required");

		   }
		   else if(p != 10)
		   {
		        JOptionPane.showMessageDialog(null,"Enter a valid Phone number");

		   }
		   else if(!matcher.matches())
		   {
		        JOptionPane.showMessageDialog(null,"Enter a Valid Email");

		   }
		   else
		   {
			   
		   
			   try
			   {
				   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
				   String query = "INSERT INTO pateints values(' " + p_id + " ' ,' " + pname + " ' ,' " + page + " ',' " + pgender + " ',' " + pphone + " ',' " + pemail + " ',' " + pblood + " ',' " + padd1 + "')";
				   PreparedStatement ps = connection.prepareStatement(query);
				   ps.execute();
				   
			       JOptionPane.showMessageDialog(null,"Data Stored Successfully");
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

	  	 if(e.getSource() == reset)
		  {
	  	   pateint_t.setText("");
		   age1.setText("");
		   pateint_t.setText("");
		   phone1.setText("");
		   aadhar1.setText("");
		   add.setText("");
		  }
	    if(e.getSource() == back)
		  {
		      new Home_Page();
			  f1.setVisible(false);
		  }

	  	}
}

public class Add_Patients
{
	public static void main(String[] args) 
	{
       new 	Add_Patients_Details();	
	}
}
