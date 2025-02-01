package Blood_Bank;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;



class Home_Page implements ActionListener
{
	JFrame f1;
	JButton add_Donor,update_Donor,search_Donor,add_pateints,search_patients,stock,blood_Transfer,dashboard;
	Home_Page()
		{
			 f1 = new JFrame(" Blood Bank Management System"); 
			 Border b = BorderFactory.createLineBorder(Color.black, 4);
	
			 JLabel lb1 = new JLabel("Blood Bank Management System");
			 lb1.setFont(new Font("Algerian", Font.ITALIC, 40));
		     lb1.setForeground(Color.RED);
	         lb1.setBounds(250,100 ,700 , 40);
	     	 f1.add(lb1);
				
	     	 Border br = BorderFactory.createLineBorder(Color.RED, 3);

	     	add_Donor = new JButton("Add new Donor");
	     	add_Donor.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
	     	add_Donor.addActionListener(this);
	     	add_Donor.setBorder(br);
	     	add_Donor.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/ww.mp4"));
	     	add_Donor.setCursor(new Cursor(Cursor.HAND_CURSOR));
	     	add_Donor.setBounds(180,190,160,100);
			f1.add(add_Donor);
			    
		     	 JLabel l1 = new JLabel();
				 l1.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
		         l1.setBounds(170,180,160,100);
		         f1.add(l1);
         
	        update_Donor = new JButton("Update Details");
	        update_Donor.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
	        update_Donor.addActionListener(this);
	        update_Donor.setBorder(br);
	        update_Donor.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        update_Donor.setBounds(430,190,160,100);
		    f1.add(update_Donor);
     
	            JLabel l2 = new JLabel();
			    l2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l2.setBounds(420,180,160,100);
	            f1.add(l2);
	            
            search_Donor = new JButton("Search Donor");
            search_Donor.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
            search_Donor.addActionListener(this);     
            search_Donor.setBorder(br);
            search_Donor.setCursor(new Cursor(Cursor.HAND_CURSOR));
            search_Donor.setBounds(680,190,160,100);
		    f1.add(search_Donor);
	            
	            JLabel l3 = new JLabel();
			    l3.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l3.setBounds(670,180,160,100);
	            f1.add(l3);

	        add_pateints = new JButton("Add Patient");
	        add_pateints.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
	        add_pateints.addActionListener(this);
	        add_pateints.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        add_pateints.setBorder(br);
	        add_pateints.setBounds(930,190,160,100);
		    f1.add(add_pateints);
			
			    JLabel l4 = new JLabel();
			    l4.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l4.setBounds(920,180,160,100);
	            f1.add(l4);
	                       
            blood_Transfer = new JButton("Transfer Blood");
            blood_Transfer.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
            blood_Transfer.addActionListener(this);
            blood_Transfer.setCursor(new Cursor(Cursor.HAND_CURSOR));
            blood_Transfer.setBorder(br);
            blood_Transfer.setBounds(180,340,160,100);
		    f1.add(blood_Transfer);
	            
			    JLabel l5 = new JLabel();
			    l5.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l5.setBounds(170,330,160,100);
	            f1.add(l5);
            
            search_patients = new JButton("Search Patients");
            search_patients.setFont(new Font("Book Antiqua", Font.ITALIC,20));
            search_patients.addActionListener(this);
            search_patients.setCursor(new Cursor(Cursor.HAND_CURSOR));
            search_patients.setBorder(br);
            search_patients.setBounds(430,340,160,100);
		    f1.add(search_patients);

	            JLabel l6 = new JLabel();
			    l6.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l6.setBounds(420,330,160,100);
	            f1.add(l6);
            
            stock = new JButton("Stock");
            stock.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
            stock.addActionListener(this);
            stock.setCursor(new Cursor(Cursor.HAND_CURSOR));
            stock.setBorder(br);
            stock.setBounds(680,340,160,100);
		    f1.add(stock);
	            
	            JLabel l7 = new JLabel();
			    l7.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l7.setBounds(670,330,160,100);
	            f1.add(l7);
            
            dashboard = new JButton("DashBoard");
            dashboard.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
            dashboard.addActionListener(this);
            dashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
            dashboard.setBorder(br);
            dashboard.setBounds(930,340,160,100);
		    f1.add(dashboard);
	            
	            JLabel l8 = new JLabel();
			    l8.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/8.jpg"));
	            l8.setBounds(920,330,160,100);
	            f1.add(l8);
	            
			 JLabel img2 = new JLabel();
		     img2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white1.jpg"));
	         img2.setBounds(100,80,1070 ,470 );
		     img2.setBorder(b);
	         f1.add(img2);
			    
			 JLabel img = new JLabel();
			 img.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/9.jpg"));
	         img.setBounds(0, 0,1270 ,650 );
		     f1.add(img);
     
	        f1.setUndecorated(true);
		    f1.setBounds(10,10,1250,650);
		    f1.setLayout(null);
		    f1.setResizable(false);
		    f1.setVisible(true); 
    	}

	public void actionPerformed(ActionEvent e)
	{

		if(e.getSource() == add_Donor)
		  {
			new Add_Donor_Details();
			  f1.setVisible(false);
		  }	
		  if(e.getSource() == update_Donor)
		  {
			  new Update_Donor_Details();
			  f1.setVisible(false);
		  }	
		  if(e.getSource() == search_Donor)
		  {
			  new Search_Donor_Details();
			  f1.setVisible(false);
		  }
		  if(e.getSource() == add_pateints)
		  {
			 new Add_Patients_Details();
			  f1.setVisible(false);
		  }
		  if(e.getSource() == blood_Transfer)
		  {
			  new Transfer();
			  f1.setVisible(false);
		  }
		  if(e.getSource() == search_patients)
		  {
			  new Search_Patients_Details();
			  f1.setVisible(false);
		  }
		  if(e.getSource() == stock)
		  {
			  new Stock_Details();
			  Fetch d = new Fetch();
			   d.gain();
			  f1.setVisible(false);
		  }
		  if(e.getSource() == dashboard)
		  {
			  new DashBoard_Details();
			  f1.setVisible(false);
		  }
	}
}

public class Home 
{
	public static void main(String[] args) 
	{
	 new Home_Page();	
	}
}
