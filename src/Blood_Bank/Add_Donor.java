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
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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


class Add_Donor_Details implements ActionListener
{
	JFrame f1;
	JLabel donor,age,gender,phone,aadhar,blood_g,blood_denote,donor_id,id,address;
    JTextField donor1,age1,phone1,aadhar1,blood_denote1;
    JComboBox gender1,blood_g1;
    JButton save,reset,back;
    JTextArea add;
    int p , a, a1 ;
    String getMail,dname,d_id;
	
	Add_Donor_Details()
	{
		f1 = new JFrame("Add Donor Details");

	    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
	    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
	
	    
	    JLabel lb1 = new JLabel("Add Donor");
	    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
	    lb1.setForeground(Color.WHITE);
	    lb1.setBounds(450,20 ,700 , 40);
	    f1.add(lb1);
	    
	    donor = new JLabel("Donor Name");
	    donor.setFont(new Font("Arial", Font.BOLD,20));
	    donor.setForeground(Color.RED);
	    donor.setBounds(150,90,200,30);
	    f1.add(donor);

	    
	    donor1 = new JTextField();
	    donor1.setFont(new Font("Arial", Font.BOLD,15));
	    donor1.setForeground(Color.BLACK);
	    donor1.setBounds(300,90,200,30);
	    donor1.setBorder(bdr);
	    f1.add(donor1);
	    
	    donor_id = new JLabel("Donor ID");
	    donor_id.setFont(new Font("Arial", Font.BOLD,20));
	    donor_id.setForeground(Color.RED);
	    donor_id.setBounds(700,90,200,30);
	    f1.add(donor_id);
	    
	    id = new JLabel();
	    id.setFont(new Font("Arial", Font.BOLD,20));
	    id.setForeground(Color.RED);
	   
	    try
	    {
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
	    	java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        ResultSet rs = st.executeQuery("Select max(id) from donor");

			if(rs.first())
			{
				
				int id1 = rs.getInt(1);
				id1 = id1 + 1;
				String str = String.valueOf(id1);
				id.setText(str);
		     }
			rs.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    id.setBounds(800,90,200,30);
	    f1.add(id);
	    
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
	    
	    blood_denote = new JLabel("Blood Denote (ml)");
	    blood_denote.setFont(new Font("Arial", Font.BOLD,20));
	    blood_denote.setForeground(Color.RED);
	    blood_denote.setBounds(540,250,180,30);
	    f1.add(blood_denote);
	     
	    blood_denote1 = new JTextField();
	    blood_denote1.setFont(new Font("Arial", Font.BOLD,15));
	    blood_denote1.setForeground(Color.BLACK);
	    blood_denote1.setBounds(540,290,180,30);
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
	    add.setBorder(bdr);
	    f1.add(add);
	    
	    JPanel p =new JPanel();
	    JLabel l1,l2,l3,l4,l5;
	    p.setBounds(930,100,250,350);
	    p.setBackground(Color.RED);
	    l1= new JLabel("    Donate    ");
	    l2= new JLabel("      Blood    ");
	    l3= new JLabel("    Save    ");
	    l4= new JLabel("    Life    ");
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
	    l5.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/bbms/Images/donate.png"));
        l5.setBounds(10,210,100,100);
        p.add(l4);
	    p.add(l5);
	    p.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(p);
	    

	    
	    save = new JButton("Add");
	    save.setFont(new Font("Arial", Font.BOLD,20));
	    save.setBackground(Color.RED);
	    save.setForeground(Color.BLACK);
	    save.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/bbms/Images/Add new.png"));
	    save.setBounds(750,150,150,40);
	    save.addActionListener(this);
        save.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    save.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
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
	    
	    
	    back = new JButton("Close");
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		   dname = donor1.getText();
		   d_id = id.getText();
		   String dage = age1.getText();
		   String dgender = gender1.getSelectedItem().toString();
		   String dphone = phone1.getText();
		   String demail = aadhar1.getText();
		   String dblood = blood_g1.getSelectedItem().toString();
		   String b_ml = blood_denote1.getText();
		   String add1 = add.getText();
		   

		   p = dphone.length();
		  
		  
		   
		   getMail = aadhar1.getText();
		   String regex = "^(.+)@(.+)$";
		   Pattern pattern = Pattern.compile(regex); 
		   Matcher matcher = pattern.matcher(getMail);  
		   
		   
		   if(e.getSource() == save)
			  {
			   if(dname.equals("") && dage.equals("") && dphone.equals("") && demail.equals("") )
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
			   /*
			   else if(a>18 || a<65)
			   {
			       JOptionPane.showMessageDialog(null,"Not a valid age to donate");
			   }
			    
			    */
			   else
			   {
			   try
			   {
				   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
				   String query = "INSERT INTO donor values(' " + d_id + " ' ,' " + dname + " ' ,' " + dage + " ',' " + dgender + " ',' " + dphone + " ',' " + demail + " ',' " + dblood + " ',' " + b_ml +"',' " + add1 + "')";
				   PreparedStatement ps = connection.prepareStatement(query);
				   ps.execute();
				   
			       JOptionPane.showMessageDialog(null,"Data Stored Successfully");
			       connection.close();
			       sendMail();
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
			   donor1.setText("");
			   age1.setText("");
			   donor1.setText("");
			   phone1.setText("");
			   aadhar1.setText("");
			   blood_denote1.setText(""); 
			   add.setText("");
			  }
		   if(e.getSource() == back)
			  {
			    new Home_Page();
				  f1.setVisible(false);
			  }
		
	}
	 void sendMail()
	   {
		   
		   String message = " Dear " + dname +  "             Donor Id : " +d_id+ "\n\n  On behalf "
		   		+ "of all the people you've helped , we'd like to say thank you for attending a recent"
		   		+ "donation session \n\n Your Continued support plays a big role in ensuring "
		   		+ "that we always have enough Blood and platelets to save and improve the lives of "
		   		+ "everyone who needs them. \n\n We look forward to seeing you again soon."; 
		   
			String subject = "You've Done something amazing";
			String to = getMail;
			String from = "binaryycoder0106@gmail.com";
			
			sendEmail(message,subject,to,from);

	   }
	   private static void sendEmail(String message, String subject, String to, String from)
		{
			String host = "smtp.gmail.com";
			
			Properties properties = System.getProperties();
			System.out.println("PROPERTIES" +properties);
			
			properties.put("mail.smtp.host",host);
			properties.put("mail.smtp.port","465");
			properties.put("mail.smtp.ssl.enable","true");
			properties.put("mail.smtp.auth","true");
			
			Session session = Session.getInstance(properties, new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication(){
					return new PasswordAuthentication("binaryycoder0106@gmail.com","oxptnwatsqsfiyeq");
				}
				});
				
				session.setDebug(true);
				
				
				MimeMessage m = new MimeMessage(session);
				try
				{
					m.setFrom(from);
					m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
					m.setSubject(subject);
					m.setText(message);
					Transport.send(m);			
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
}

public class Add_Donor 
{
	public static void main(String[] args)
	{
		new Add_Donor_Details();
	}
}
