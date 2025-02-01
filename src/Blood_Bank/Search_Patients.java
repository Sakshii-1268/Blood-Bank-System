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


class Search_Patients_Details  implements ActionListener
{
    JFrame f1;
    JTextField e_patientid;
    JButton search,print,back;
    JLabel patient, fpatient, display,age, page, gender, pgender,pblood_g,blood_g,email,pemail,phone,pphone,address,paddress;
	   
	Search_Patients_Details()
	{
		f1 = new JFrame(" Blood Bank Management System");

	    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
	    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
	    
	    JLabel lb1 = new JLabel("Search Patients");
	    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
	    lb1.setForeground(Color.WHITE);
	    lb1.setBounds(450,20 ,700 , 40);
	    f1.add(lb1);
	    
	    JLabel patient_id = new JLabel("Enter the Patient ID : ");
	    patient_id.setFont(new Font("Arial", Font.BOLD,20));
	    patient_id.setForeground(Color.RED);
	    patient_id.setBounds(150,80,200,40);
	    f1.add(patient_id);
	    
	    e_patientid = new JTextField();
	    e_patientid.setFont(new Font("Arial", Font.BOLD,15));
	    e_patientid.setForeground(Color.BLACK);
	    e_patientid.setBounds(370,80,150,40);
	    e_patientid.setBorder(bdr);
	    f1.add(e_patientid);
	    
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
	
	    patient = new JLabel("Patient Name");
	    patient.setFont(new Font("Arial", Font.BOLD,20));
	    patient.setForeground(Color.RED);
	    patient.setBounds(115,140,180,30);
	    f1.add(patient); 
	    
	    fpatient = new JLabel();
	    fpatient.setFont(new Font("Arial", Font.BOLD,17));
	    fpatient.setForeground(Color.BLACK);
	    fpatient.setBounds(115,180,180,30);
	    f1.add(fpatient);
	    
	    age = new JLabel("Age");
	    age.setFont(new Font("Arial", Font.BOLD,20));
	    age.setForeground(Color.RED);
	    age.setBounds(330,140,180,30);
	    f1.add(age);
	    
	    page = new JLabel();
	    page.setFont(new Font("Arial", Font.BOLD,17));
	    page.setForeground(Color.BLACK);
	    page.setBounds(330,180,180,30);
	    f1.add(page);
	    
	    gender = new JLabel("Gender");
	    gender.setFont(new Font("Arial", Font.BOLD,20));
	    gender.setForeground(Color.RED);
	    gender.setBounds(540,150,180,30);
	    f1.add(gender);
	    
	    pgender = new JLabel();
	    pgender.setFont(new Font("Arial", Font.BOLD,17));
	    pgender.setForeground(Color.BLACK);
	    pgender.setBounds(540,180,180,30);
	    f1.add(pgender);
	    

	    phone = new JLabel("Phone");
	    phone.setFont(new Font("Arial", Font.BOLD,20));
	    phone.setForeground(Color.RED);
	    phone.setBounds(115,250,180,30);
	    f1.add(phone);
	    
	    pphone = new JLabel();
	    pphone.setFont(new Font("Arial", Font.BOLD,17));
	    pphone.setForeground(Color.BLACK);
	    pphone.setBounds(115,280,180,30);
	    f1.add(pphone);
	    
	    email = new JLabel("Email");
	    email.setFont(new Font("Arial", Font.BOLD,20));
	    email.setForeground(Color.RED);
	    email.setBounds(330,250,180,30);
	    f1.add(email);
		
	    pemail = new JLabel();
	    pemail.setFont(new Font("Arial", Font.BOLD,17));
	    pemail.setForeground(Color.BLACK);
	    pemail.setBounds(330,280,180,30);
	    f1.add(pemail);
	    
	    blood_g = new JLabel("Blood Group");
	    blood_g.setFont(new Font("Arial", Font.BOLD,20));
	    blood_g.setForeground(Color.RED);
	    blood_g.setBounds(540,250,180,30);
	    f1.add(blood_g);
	    
	    pblood_g = new JLabel();
	    pblood_g.setFont(new Font("Arial", Font.BOLD,17));
	    pblood_g.setForeground(Color.BLACK);
	    pblood_g.setBounds(540,280,180,30);
	    f1.add(pblood_g);
	    
	    address = new JLabel("Address");
	    address.setFont(new Font("Arial", Font.BOLD,20));
	    address.setForeground(Color.RED);
	    address.setBounds(115,350,180,30);
	    f1.add(address);
	    
	    paddress = new JLabel();
	    paddress.setFont(new Font("Arial", Font.BOLD,17));
	    paddress.setForeground(Color.BLACK);
	    paddress.setBounds(115,380,280,30);
	    f1.add(paddress);
	    

	    display = new JLabel();
	    display.setFont(new Font("Arial", Font.BOLD,20));
	    display.setForeground(Color.RED);
	    display.setBounds(520,380,280,30);
	    f1.add(display);
	    
	    back = new JButton("Close");
	    back.setFont(new Font("Arial", Font.BOLD,20));
	    back.setBackground(Color.RED);
	    back.setForeground(Color.BLACK);
	    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
	    back.setBounds(750,440,150,40);
	    back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    back.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(back);
	    
	    
	    print = new JButton("Save");
	    print.setFont(new Font("Arial", Font.BOLD,20));
	    print.setBackground(Color.RED);
	    print.setForeground(Color.BLACK);
	    print.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/save.png"));
	    print.setBounds(550,440,150,40);
	    print.addActionListener(this);
	    print.setVisible(false);
        print.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    print.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(print);
	    
	    JPanel p =new JPanel();
	    JLabel l1,l2,l3,l4,l5;
	    p.setBounds(930,100,250,350);
	    p.setBackground(Color.RED);
	    l1= new JLabel("    Be     ");
	    l2= new JLabel("      Someone's   ");
	    l3= new JLabel(" Lifeline   ");
	    l4= new JLabel("  Donate Blood ");
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
		String s_id = e_patientid.getText();
		
		if(e.getSource() == search)
		{
			if(s_id.equals(""))
			   {
			     JOptionPane.showMessageDialog(null,"Enter a valid Donor ID");
			   }
			else
			{
			    print.setVisible(true);

				try
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
					java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				    ResultSet rs = st.executeQuery("Select * from pateints where id ="+s_id);
				    
				    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
					java.sql.Statement st1 = con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				    ResultSet rs1 = st1.executeQuery("Select * from bloodtransfer where id ="+s_id);
				    
				    while(rs.next())
				    {
				    		int get_id = rs.getInt(1);
					        String str_id = String.valueOf(get_id);
					        
					        
					        
					        if(s_id.equals(str_id) )
					    	{
					        	
					        	String d_name1 = rs.getString(2);
					        	fpatient.setText(d_name1);
					        	
					             int d_age = rs.getInt(3);
						 		 String str = String.valueOf(d_age);
								 page.setText(str);
								 
								 String d_gender = rs.getString(4);
							 	 pgender.setText(d_gender);
							 	 
							 	 String d_phone = rs.getString(5);
								 pphone.setText(d_phone);
								 
								 String d_aadhar = rs.getString(6);
								 pemail.setText(d_aadhar);
								 
								 String d_bloodg= rs.getString(7);
								 pblood_g.setText(d_bloodg);
								 
								 String d_address = rs.getString(8);
								 paddress.setText(d_address);
					    	}
				    }
					        while(rs1.next())
					    	{
					        	int get_id1 = rs1.getInt(1);
						        String str_id1 = String.valueOf(get_id1);
						        
						    
					          if(s_id.equals(str_id1))
					          {
					         	display.setText("Blood is Transfered");
					          }
					          else
					          {
						         	display.setVisible(false);
					          }
				            }
				    }
				
				catch(Exception e1)
				 {
					System.out.println(e1);
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
	   	   

	   	  JFileChooser jf = new JFileChooser(new File("C:\\Users\\sakshi yadav\\eclipse-workspace\\Blood_Bank_System\\Details_Store\\Patients"));
	   	  jf.showSaveDialog(f1);
	   	  File f = jf.getSelectedFile();

	   	  try
	   	  {
	   	   FileWriter fw = new FileWriter(f);
	   	  
	   	   String id = "ID :- " + e_patientid.getText();
	   	   fw.write(id);
	   	  
	   	   String name = "\n\nName :- " + fpatient.getText();
	   	   fw.write(name);
	   	   
	   	   String age = "\n\nAge :- " + page.getText();
	   	   fw.write(age);
	   	   
	   	   String gender = "\n\nGender :- " + pgender.getText();
	   	   fw.write(gender);
	   	   
	   	   String phone = "\n\nPhone :- " + pphone.getText();
	   	   fw.write(phone);
	   	   
	   	   String email = "\n\nEmail :- " + pemail.getText();
	   	   fw.write(email);
	   	   
	   	   String blood_group = "\n\nBlood Group :-" +  pblood_g.getText();
	   	   fw.write(blood_group);
	   	   
	   	  
	   	   String  address = "\n\nAddress :- " + paddress.getText();
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
public class Search_Patients
{

	public static void main(String[] args) 
	{
	  new Search_Patients_Details();
	}
}
