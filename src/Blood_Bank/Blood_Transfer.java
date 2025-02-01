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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

class Blood_Transfer_Details implements ActionListener
{
	JFrame f1;
	JLabel pname,pbg,pid,display,c_pname,t_ppg;
	JTextField t_pid;
	JButton search,back,transfer,reset;
	Blood_Transfer_Details()
	{
		f1 = new JFrame(" Blood Bank Management System");
	    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
	    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
	    
	    pid = new JLabel("Enter Patient ID : ");
	    pid.setFont(new Font("Arial", Font.BOLD,20));
	    pid.setForeground(Color.RED);
	    pid.setBounds(200,150,200,40);
	    f1.add(pid);
	    
	    t_pid = new JTextField();
	    t_pid.setFont(new Font("Arial", Font.BOLD,15));
	    t_pid.setForeground(Color.BLACK);
	    t_pid.setBounds(400,150,150,40);
	    t_pid.setBorder(bdr);
	    f1.add(t_pid);
	    
	    
	    search = new JButton("Search");
	    search.setFont(new Font("Arial", Font.BOLD,20));
	    search.setBackground(Color.RED);
	    search.setForeground(Color.BLACK);
	    search.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/search user.png"));
	    search.setBounds(600,150,150,40);
	    search.addActionListener(this);
	    search.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    search.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(search);
	    
	    pname = new JLabel("Patient Name ");
	    pname.setFont(new Font("Arial", Font.BOLD,20));
	    pname.setForeground(Color.RED);
	    pname.setBounds(200,200,200,40);
	    f1.add(pname);
	    
	    c_pname = new JLabel();
	    c_pname.setFont(new Font("Arial", Font.BOLD,15));
	    c_pname.setForeground(Color.BLACK);
	    c_pname.setBounds(200,250,150,40);
	    c_pname.setBorder(bdr);
	    f1.add(c_pname);
	    

	    pbg = new JLabel("Patient Blood Group : ");
	    pbg.setFont(new Font("Arial", Font.BOLD,20));
	    pbg.setForeground(Color.RED);
	    pbg.setBounds(200,300,300,40);
	    f1.add(pbg);

	    t_ppg = new JLabel();
	    t_ppg.setFont(new Font("Arial", Font.BOLD,15));
	    t_ppg.setForeground(Color.BLACK);
	    t_ppg.setBounds(200,350,150,40);
	    t_ppg.setBorder(bdr);
	    f1.add(t_ppg);
	    
	    
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
	    
	    transfer = new JButton("Transfer Blood");
	    transfer.setFont(new Font("Arial", Font.BOLD,20));
	    transfer.setBackground(Color.RED);
	    transfer.setForeground(Color.BLACK);
	    transfer.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/transfer.png"));
	    transfer.setBounds(200,450,200,40);
	    transfer.addActionListener(this);
	    transfer.setVisible(false);
        transfer.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    transfer.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(transfer);	    
	   
	    back = new JButton("Close");
	    back.setFont(new Font("Arial", Font.BOLD,20));
	    back.setBackground(Color.RED);
	    back.setForeground(Color.BLACK);
	    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
	    back.setBounds(750,290,150,40);
	    back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    back.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(back);
	    
	    display = new JLabel();
        display.setFont(new Font("Arial", Font.BOLD,25));
        display.setForeground(Color.RED);
        display.setBounds(500,300,500,40);
	    f1.add(display);
	    
	    JPanel p =new JPanel();
	    JLabel l1,l2,l3,l4,l5;
	    p.setBounds(930,100,250,350);
	    p.setBackground(Color.RED);
	    l1= new JLabel(" Donate Blood  ");
	    l2= new JLabel("  And Be The   ");
	    l3= new JLabel("   Reason For   ");
	    l4= new JLabel("   Someone's Existence   ");
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
	    l4.setFont(new Font("Comic Sans MS", Font.BOLD,23));
	    l4.setForeground(Color.WHITE);
	    l4.setBounds(10,170,200,30);
	    l5 = new JLabel();
	    l5.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/donate.png"));
        l5.setBounds(10,210,100,100);
        p.add(l4);
	    p.add(l5);
	    p.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
	    f1.add(p);

	    JLabel lb1 = new JLabel("Blood Transfer");
	    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
	    lb1.setForeground(Color.WHITE);
	    lb1.setBounds(450,20 ,700 , 40);
	    f1.add(lb1);
	    

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
		String getid = t_pid.getText();
		String  getname = c_pname.getText();
	    String get_bloodgroup = t_ppg.getText();
	    String get_id = t_pid.getText();
	    
		 if(e.getSource() == search)
		  {
			 
			 try
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
					java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				    ResultSet rs = st.executeQuery("select * from pateints where id =" + get_id);
				    
				    while(rs.next())
				    {
				    	String n = rs.getString(2);
				    	c_pname.setText(n);
				    	
					 	 
					 	 String b = rs.getString(7);
					 	 t_ppg.setText(b);
			        }
				    
				    
				    String getbloodgroup = t_ppg.getText();
                    System.out.print(getbloodgroup);
                  	   
                        String match_a = "A+";
                        String match_a1 = "A-";
				    	int res1 = getbloodgroup.compareTo(match_a);
				    	int res2 = getbloodgroup.compareTo(match_a1);

	                    System.out.print(res1);
	                    System.out.print(res2);
				    	if(res1 < 0)
				    	{				    	
				    		//String get_a = Fetch.str3;		  
				    		//System.out.print(get_a);
				    		/*
		                      int get1_a = Integer.valueOf(get_a);
		                     if (get1_a != 0) 
		                     {
		                      display.setText("Blood is available");
		                      transfer.setVisible(true);
		                     }
		                     else
		                     {
		                        display.setText("Blood is not available");
		                     }
		                     */
				    	}
				    	

					    //Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
						//java.sql.Statement st1 = con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
					    //ResultSet rs1 =  st1.executeQuery("Select * from donor");
					    //while(rs1.next())
					    //{
					    	// db_bg = rs1.getString("bloodg");	
					    	//String[] arr = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};
					    	 //for (String bloodType : arr) 
					    	 //{
				               //     if (getbloodgroup.equals("A+"))
				                 //   {
				                   //     String get_a = Blood_Bank.Stock_Details.a.getText();
				                     //   System.out.print(get_a);
				                       // int get1_a = Integer.valueOf(get_a);
				                        //if (get1_a != 0) 
				                        //{
				                          //  display.setText("Blood is available");
				                            //transfer.setVisible(true);
				                        //}
				                        //else
				                        //{
				                         //   display.setText("Blood is not available");
				                        //}
				                        //break;
				                    //}
				              //  }
				            } 
					    	
				    catch(Exception e1)
				    {
				    	System.out.println(e1);
				    }

		  }
		 if(e.getSource() == reset)
		  {
			 display.setText("");
			 t_ppg.setText("");
			 c_pname.setText("");
			 t_pid.setText("");
			 transfer.setVisible(false);
		  }
		 if(e.getSource() == back)
		  {
		      new Home_Page();
			  f1.setVisible(false);
		  }
		
		 if(e.getSource()== transfer)
		 {
			 try
			 {
			
				 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			     java.sql.Statement st1 = con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

						    String query = "INSERT INTO bloodtransfer values('"+getid+"' ,'"+getname+"' ,'"+get_bloodgroup+"' )";
							 PreparedStatement ps = con1.prepareStatement(query);
						     ps.execute();
				 		     JOptionPane.showMessageDialog(null,"Blood Transfer Successfully");

						      con1.close();
					   
			 }
			 catch(Exception f)
			 {
				   System.out.println(f);
	    	 }
		 }
	}
}

public class Blood_Transfer 
{
	public static void main(String[] args) 
	{
	  new Blood_Transfer_Details();
	}
}
