package Blood_Bank;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



class DashBoard_Details implements ActionListener
{

	JFrame f1;
	JLabel count_of_donor,count_of_pateints,count_of_bloodtransfer ;
	JLabel A1_count, A2_count,B1_count,B2_count, AB1_count, AB2_count,O1_count, O2_count;
	JButton back;
	
	DashBoard_Details()
	{

		f1 = new JFrame(" Blood Bank Management System");

	    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
	    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
	    
	    JLabel lb1 = new JLabel("Dashboard");
	    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
	    lb1.setForeground(Color.WHITE);
	    lb1.setBounds(450,20 ,700 , 40);
	    f1.add(lb1);
	    
	    
	    // 1 - Donor
	     count_of_donor = new JLabel("0");
	     count_of_donor.setFont(new Font("Constantia", Font.BOLD,25));
	     count_of_donor.setForeground(Color.RED);
	     count_of_donor.setBounds(290,160,200,40);
		 f1.add(count_of_donor);
	     
	    
	     JLabel donorcount = new JLabel("Donor");
	     donorcount.setFont(new Font("Algerian", Font.BOLD,25));
	     donorcount.setForeground(Color.RED);
	     donorcount.setBounds(240,120,200,40);
		 f1.add(donorcount);
		 
		 
	     JLabel l11 = new JLabel();
	     l11.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
	     l11.setBorder(bdr1);
	     l11.setBounds(210,110,170,100);
	     f1.add(l11);

	    JLabel l1 = new JLabel();
	    l1.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l1.setBounds(200,100,160,100);
        f1.add(l1);
        
        getcount_donor();
        
	    // 2 - Pateients
        count_of_pateints = new JLabel("0");
        count_of_pateints.setFont(new Font("Constantia", Font.BOLD,25));
        count_of_pateints.setForeground(Color.RED);
        count_of_pateints.setBounds(590,160,200,40);
		f1.add(count_of_pateints);
	     
        JLabel pcount = new JLabel("Pateints");
        pcount.setFont(new Font("Algerian", Font.BOLD,25));
        pcount.setForeground(Color.RED);
        pcount.setBounds(540,120,200,40);
		 f1.add(pcount);
		 
		 
        JLabel l12 = new JLabel();
        l12.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l12.setBorder(bdr1);
        l12.setBounds(510,110,170,100);
	     f1.add(l12);
   
        JLabel l2 = new JLabel();
	    l2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l2.setBounds(500,100,160,100);
        f1.add(l2);
        getcount_patient();

	    // 3 - Blood Transfer 
        
        count_of_bloodtransfer = new JLabel("0");
        count_of_bloodtransfer.setFont(new Font("Algerian", Font.BOLD,25));
        count_of_bloodtransfer.setForeground(Color.RED);
        count_of_bloodtransfer.setBounds(865,160,200,40);
		f1.add(count_of_bloodtransfer);
		 
        JLabel btcount = new JLabel("Blood Transfer");
        btcount.setFont(new Font("Algerian", Font.BOLD,18));
        btcount.setForeground(Color.RED);
        btcount.setBounds(815,120,200,40);
		f1.add(btcount);
		 
        JLabel l13 = new JLabel();
        l13.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l13.setBorder(bdr1);
        l13.setBounds(810,110,170,100);
	     f1.add(l13);
	     
	    JLabel l3 = new JLabel();
	    l3.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l3.setBounds(800,100,160,100);
        f1.add(l3);
        getcount_bloodtransfer();
        
	    // 4 = A+
        
        A1_count = new JLabel("0");
        A1_count.setFont(new Font("Constantia", Font.BOLD,40));
        A1_count.setForeground(Color.RED);
        A1_count.setBounds(210,310,200,40);
		f1.add(A1_count);
		
        
        JLabel Alabel = new JLabel("A+");
        Alabel.setFont(new Font("Constantia", Font.BOLD,30));
        Alabel.setForeground(Color.RED);
        Alabel.setBounds(200,270,200,40);
		 f1.add(Alabel);
		 
        JLabel bimg1 = new JLabel();
        bimg1.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg1.setBounds(140,260,100,100);
        f1.add(bimg1);
        
        JLabel l14 = new JLabel();
        l14.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l14.setBorder(bdr1);
        l14.setBounds(130,260,170,100);
	     f1.add(l14);
	     
        JLabel l4 = new JLabel();
	    l4.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l4.setBounds(120,250,160,100);
        f1.add(l4);
        getcount_A();
        
	    // 5 - A-
        A2_count = new JLabel("0");
        A2_count.setFont(new Font("Constantia", Font.BOLD,40));
        A2_count.setForeground(Color.RED);
        A2_count.setBounds(460,310,200,40);
		f1.add(A2_count);
		
        
        JLabel Alabel1 = new JLabel("A-");
        Alabel1.setFont(new Font("Constantia", Font.BOLD,30));
        Alabel1.setForeground(Color.RED);
        Alabel1.setBounds(450,270,200,40);
		f1.add(Alabel1);
		 
        JLabel bimg2 = new JLabel();
        bimg2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg2.setBounds(390,260,100,100);
        f1.add(bimg2);
        
        JLabel l15 = new JLabel();
        l15.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l15.setBorder(bdr1);
        l15.setBounds(380,260,170,100);
	     f1.add(l15);
        
        JLabel l5 = new JLabel();
        l5.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l5.setBounds(370,250,160,100);
        f1.add(l5);
        getcount_A1();
        
	    // 6 - B+
        B1_count = new JLabel("0");
        B1_count.setFont(new Font("Constantia", Font.BOLD,40));
        B1_count.setForeground(Color.RED);
        B1_count.setBounds(690,310,200,40);
		f1.add(B1_count);
		
        JLabel Blabel = new JLabel("B+");
        Blabel.setFont(new Font("Constantia", Font.BOLD,30));
        Blabel.setForeground(Color.RED);
        Blabel.setBounds(680,270,200,40);
		 f1.add(Blabel);
        
        JLabel bimg3 = new JLabel();
        bimg3.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg3.setBounds(620,260,100,100);
        f1.add(bimg3);
        
        JLabel l16 = new JLabel();
        l16.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l16.setBorder(bdr1);
        l16.setBounds(610,260,170,100);
	    f1.add(l16);
        
        JLabel l6 = new JLabel();
	    l6.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l6.setBounds(600,250,160,100);
        f1.add(l6);
        getcount_B();
        
        
	    // 7 - B-
        B2_count = new JLabel("0");
        B2_count.setFont(new Font("Constantia", Font.BOLD,40));
        B2_count.setForeground(Color.RED);
        B2_count.setBounds(930,310,200,40);
		f1.add(B2_count);
		
        JLabel Blabel1 = new JLabel("B-");
        Blabel1.setFont(new Font("Constantia", Font.BOLD,30));
        Blabel1.setForeground(Color.RED);
        Blabel1.setBounds(920,270,200,40);
		f1.add(Blabel1);
        
        JLabel bimg4 = new JLabel();
        bimg4.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg4.setBounds(860,260,100,100);
        f1.add(bimg4);
        
        JLabel l17 = new JLabel();
        l17.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l17.setBorder(bdr1);
        l17.setBounds(850,260,170,100);
	    f1.add(l17);
        
        JLabel l7 = new JLabel();
        l7.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l7.setBounds(840,250,160,100);
        f1.add(l7);
        getcount_B1();
        
	    // 8 - AB+
        AB1_count = new JLabel("0");
        AB1_count.setFont(new Font("Constantia", Font.BOLD,40));
        AB1_count.setForeground(Color.RED);
        AB1_count.setBounds(210,430,200,40);
		f1.add(AB1_count);
		
        JLabel ABlabel = new JLabel("AB+");
        ABlabel.setFont(new Font("Constantia", Font.BOLD,30));
        ABlabel.setForeground(Color.RED);
        ABlabel.setBounds(200,390,200,40);
		 f1.add(ABlabel);
        
        JLabel bimg5 = new JLabel();
        bimg5.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg5.setBounds(140,380,100,100);
        f1.add(bimg5);
        
        JLabel l18 = new JLabel();
        l18.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l18.setBorder(bdr1);
        l18.setBounds(130,380,170,100);
	    f1.add(l18);
        
        JLabel l8 = new JLabel();
        l8.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l8.setBounds(120,370,160,100);
        f1.add(l8);
        
        getcount_AB();
        
	    // 9 - AB-
        AB2_count = new JLabel("0");
        AB2_count.setFont(new Font("Constantia", Font.BOLD,40));
        AB2_count.setForeground(Color.RED);
        AB2_count.setBounds(460,430,200,40);
		f1.add(AB2_count);
		
        JLabel ABlabel1 = new JLabel("AB-");
        ABlabel1.setFont(new Font("Constantia", Font.BOLD,30));
        ABlabel1.setForeground(Color.RED);
        ABlabel1.setBounds(450,390,200,40);
		f1.add(ABlabel1);
        
        JLabel bimg6 = new JLabel();
        bimg6.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg6.setBounds(390,380,100,100);
        f1.add(bimg6);
        
        JLabel l19 = new JLabel();
        l19.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l19.setBorder(bdr1);
        l19.setBounds(380,380,170,100);
	    f1.add(l19);
        
        JLabel l9 = new JLabel();
        l9.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l9.setBounds(370,370,160,100);
        f1.add(l9);
        
        getcount_AB1();
	    // 10 - O+
        O1_count = new JLabel("0");
        O1_count.setFont(new Font("Constantia", Font.BOLD,40));
        O1_count.setForeground(Color.RED);
        O1_count.setBounds(690,430,200,40);
		f1.add(O1_count);
        
        JLabel Olabel = new JLabel("O+");
        Olabel.setFont(new Font("Constantia", Font.BOLD,30));
        Olabel.setForeground(Color.RED);
        Olabel.setBounds(680,390,200,40);
		f1.add(Olabel);
		
		
        JLabel bimg7 = new JLabel();
        bimg7.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg7.setBounds(620,380,100,100);
        f1.add(bimg7);
        
        JLabel l110 = new JLabel();
        l110.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l110.setBorder(bdr1);
        l110.setBounds(610,380,170,100);
	    f1.add(l110);
        
        JLabel l10 = new JLabel();
        l10.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l10.setBounds(600,370,160,100);
        f1.add(l10);
        getcount_O();
        
	    // 11 - O-
        O2_count = new JLabel("0");
        O2_count.setFont(new Font("Constantia", Font.BOLD,40));
        O2_count.setForeground(Color.RED);
        O2_count.setBounds(930,430,200,40);
		f1.add(O2_count);
        
        JLabel Olabel1 = new JLabel("O-");
        Olabel1.setFont(new Font("Constantia", Font.BOLD,30));
        Olabel1.setForeground(Color.RED);
        Olabel1.setBounds(920,390,200,40);
		f1.add(Olabel1);
        
        JLabel bimg8 = new JLabel();
        bimg8.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/d2.jpg"));
        bimg8.setBounds(860,380,100,100);
        f1.add(bimg8);
        
        JLabel l1111 = new JLabel();
        l1111.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
        l1111.setBorder(bdr1);
        l1111.setBounds(850,380,170,100);
	    f1.add(l1111);
        
        JLabel l111 = new JLabel();
        l111.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
        l111.setBounds(840,370,160,100);
        f1.add(l111);
        getcount_O1();
        
        back = new JButton("Close");
	    back.setFont(new Font("Arial", Font.BOLD,20));
	    back.setBackground(Color.WHITE);
	    back.setForeground(Color.BLACK);
	    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
	    back.setBounds(750,540,150,40);
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
	void getcount_donor()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(id) from donor");
		    
		    while(rs.next())
		    {
		    	 int d_c = rs.getInt(1);
		 		 String str1 = String.valueOf(d_c);
				 count_of_donor.setText(str1);
		    }
	     }
		catch(Exception e)
		{
			
		}
	}
	
	void getcount_patient()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(id) from pateints");
		    
		    while(rs.next())
		    {
		    	 int p_c = rs.getInt(1);
		 		 String str2 = String.valueOf(p_c);
		 		 count_of_pateints.setText(str2);
		    }
	     }
		catch(Exception e)
		{
			
			
	    }
	}
	void getcount_bloodtransfer()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(id) from bloodtransfer");
		    
		    while(rs.next())
		    {
		    	 int d_c = rs.getInt(1);
		 		 String str1 = String.valueOf(d_c);
		 		count_of_bloodtransfer.setText(str1);
		    }
	     }
		catch(Exception e)
		{
			
		}
	}
	void getcount_A()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' A+ ' ");
		    
		    while(rs.next())
		    {
		    	 int a_c = rs.getInt(1);
		 		 String str3 = String.valueOf(a_c);
		 		 A1_count.setText(str3);
		 		 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	
	void getcount_A1()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' A- ' ");
		    
		    while(rs.next())
		    {
		    	 int a1_c = rs.getInt(1);
		 		 String str4 = String.valueOf(a1_c);
		 		 A2_count.setText(str4); 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	void getcount_B()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' B+ ' ");
		    
		    while(rs.next())
		    {
		    	 int b_c = rs.getInt(1);
		 		 String str5 = String.valueOf(b_c);
		 		 B1_count.setText(str5);
		 		 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	void getcount_B1()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' B- ' ");
		    
		    while(rs.next())
		    {
		    	 int b1_c = rs.getInt(1);
		 		 String str6 = String.valueOf(b1_c);
		 		 B2_count.setText(str6); 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	void getcount_AB()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' AB+ ' ");
		    
		    while(rs.next())
		    {
		    	 int ab_c = rs.getInt(1);
		 		 String str7 = String.valueOf(ab_c);
		 		 AB1_count.setText(str7);
		 		 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	void getcount_AB1()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' AB- ' ");
		    
		    while(rs.next())
		    {
		    	 int ab1_c = rs.getInt(1);
		 		 String str8 = String.valueOf(ab1_c);
		 		 AB2_count.setText(str8); 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	void getcount_O()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' O+ ' ");
		    
		    while(rs.next())
		    {
		    	 int o_c = rs.getInt(1);
		 		 String str9 = String.valueOf(o_c);
		 		 O1_count.setText(str9);
		 		 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	void getcount_O1()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' O- ' ");
		    
		    while(rs.next())
		    {
		    	 int o1_c = rs.getInt(1);
		 		 String str10 = String.valueOf(o1_c);
		 		 O2_count.setText(str10); 
		    }
	     }
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		 if(e.getSource() == back)
		  {
		       new Home_Page();
			  f1.setVisible(false);
		  }
		
	}
}

public class DashBoard 
{
	public static void main(String[] args) 
	{
	  new DashBoard_Details();
	}
}
