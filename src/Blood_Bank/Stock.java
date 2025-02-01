package Blood_Bank;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

class Stock_Details implements ActionListener
{
	JFrame f2;
	static JTable table;

	String driverName = "com.mysql.jdbc.Driver";
	String[] columnNames = {"ID", "Donor Name", "Blood Group"};
	JLabel A,A1,B,B1,AB,AB1,O,O1;
	static public  JLabel a, a1 ,b, b1, ab,ab1,o,o1;

	JButton back;
	
	Stock_Details()
	{
		 f2 = new JFrame("Stock");

		    Border bdr = BorderFactory.createLineBorder(Color.black, 2);
		    Border bdr1 = BorderFactory.createLineBorder(Color.black, 2);
		    
		    JLabel blood_details = new JLabel("Blood Details");
		    blood_details.setFont(new Font("Algerian", Font.BOLD,20));
		    blood_details.setForeground(Color.RED);
		    blood_details.setBounds(200,90,200,30);
		    blood_details.setForeground(Color.RED);
		    f2.add(blood_details);
		    
		    JLabel donor_list = new JLabel("Donor List");
		    donor_list.setFont(new Font("Algerian", Font.BOLD,20));
		    donor_list.setForeground(Color.RED);
		    donor_list.setBounds(650,90,200,30);
		    donor_list.setForeground(Color.RED);
		    f2.add(donor_list);
		    
		    A = new JLabel("A+");
		    A.setFont(new Font("Arial", Font.BOLD,17));
		    A.setForeground(Color.BLACK);
		    A.setBounds(150,130,100,30);
		    A.setBorder(bdr1);
		    A.setForeground(Color.RED);
		    f2.add(A);
		    
		    a = new JLabel();
		    a.setFont(new Font("Arial", Font.BOLD,17));
		    a.setForeground(Color.BLACK);
		    a.setBounds(250,130,100,30);
		    a.setBorder(bdr1);
		    f2.add(a);
		    
		    A1 = new JLabel("A-");
		    A1.setFont(new Font("Arial", Font.BOLD,17));
		    A1.setForeground(Color.BLACK);
		    A1.setBounds(150,160,100,30);
		    A1.setBorder(bdr1);
		    A1.setForeground(Color.RED);
		    f2.add(A1);
		    
		    a1 = new JLabel();
		    a1.setFont(new Font("Arial", Font.BOLD,17));
		    a1.setForeground(Color.BLACK);
		    a1.setBounds(250,160,100,30);
		    a1.setBorder(bdr1);
		    f2.add(a1);
		    
		    B = new JLabel("B+");
		    B.setFont(new Font("Arial", Font.BOLD,17));
		    B.setForeground(Color.BLACK);
		    B.setBounds(150,190,100,30);
		    B.setBorder(bdr1);
		    B.setForeground(Color.RED);
		    f2.add(B);
		    
		    b = new JLabel();
		    b.setFont(new Font("Arial", Font.BOLD,17));
		    b.setForeground(Color.BLACK);
		    b.setBounds(250,190,100,30);
		    b.setBorder(bdr1);
		    f2.add(b);
		    
		    B1 = new JLabel("B-");
		    B1.setFont(new Font("Arial", Font.BOLD,17));
		    B1.setForeground(Color.BLACK);
		    B1.setBounds(150,220,100,30);
		    B1.setBorder(bdr1);
		    B1.setForeground(Color.RED);
		    f2.add(B1);
		    
		    b1 = new JLabel();
		    b1.setFont(new Font("Arial", Font.BOLD,17));
		    b1.setForeground(Color.BLACK);
		    b1.setBounds(250,220,100,30);
		    b1.setBorder(bdr1);
		    f2.add(b1);
		    
		    AB = new JLabel("AB+");
		    AB.setFont(new Font("Arial", Font.BOLD,17));
		    AB.setForeground(Color.BLACK);
		    AB.setBounds(150,250,100,30);
		    AB.setForeground(Color.RED);
		    AB.setBorder(bdr1);
		    f2.add(AB);
		    
		    ab = new JLabel();
		    ab.setFont(new Font("Arial", Font.BOLD,17));
		    ab.setForeground(Color.BLACK);
		    ab.setBounds(250,250,100,30);
		    ab.setBorder(bdr1);
		    f2.add(ab);
		    
		    
		    AB1 = new JLabel("AB-");
		    AB1.setFont(new Font("Arial", Font.BOLD,17));
		    AB1.setForeground(Color.BLACK);
		    AB1.setBounds(150,280,100,30);
		    AB1.setBorder(bdr1);	  
		    AB1.setForeground(Color.RED);
		    f2.add(AB1);
		    
		    ab1 = new JLabel();
		    ab1.setFont(new Font("Arial", Font.BOLD,17));
		    ab1.setForeground(Color.BLACK);
		    ab1.setBounds(250,280,100,30);
		    ab1.setBorder(bdr1);
		    f2.add(ab1);
		    
		    
		    O = new JLabel("O+");
		    O.setFont(new Font("Arial", Font.BOLD,17));
		    O.setForeground(Color.BLACK);
		    O.setBounds(150,310,100,30);
		    O.setForeground(Color.RED);
		    O.setBorder(bdr1);
		    f2.add(O);
		    
		    o = new JLabel();
		    o.setFont(new Font("Arial", Font.BOLD,17));
		    o.setForeground(Color.BLACK);
		    o.setBounds(250,310,100,30);
		    o.setBorder(bdr1);
		    f2.add(o);
		    
		    O1 = new JLabel("O-");
		    O1.setFont(new Font("Arial", Font.BOLD,17));
		    O1.setForeground(Color.BLACK);
		    O1.setBounds(150,340,100,30);
		    O1.setBorder(bdr1);
		    O1.setForeground(Color.RED);
		    f2.add(O1);
		    
		    o1 = new JLabel();
		    o1.setFont(new Font("Arial", Font.BOLD,17));
		    o1.setForeground(Color.BLACK);
		    o1.setBounds(250,340,100,30);
		    o1.setBorder(bdr1);
		    f2.add(o1);
		    	    
		   
		    DefaultTableModel model = new DefaultTableModel();
		    model.setColumnIdentifiers(columnNames);
		    table = new JTable();
		    table.setModel(model);  
		    JTableHeader th = table.getTableHeader();
		    th.setFont(new Font("Arial", Font.BOLD,17));
		    th.setForeground(Color.RED);
		    table.setFont(new Font("Arial", Font.ITALIC,13));
		    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		    table.setRowHeight(20);
		   
		    table.setIntercellSpacing(new Dimension(10,4));
		    table.setFillsViewportHeight(true);
		    JScrollPane j = new JScrollPane(table);
		    j.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		    //j.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		    j.setBounds(500,130,400,300);
		    f2.add(j);

		    
		    JPanel p =new JPanel();
		    JLabel l1,l2,l3,l4,l5;
		    p.setBounds(930,100,250,350);
		    p.setBackground(Color.RED);
		    l1= new JLabel("      Donate     ");
		    l2= new JLabel("    Blood   ");
		    l3= new JLabel("      Donate   ");
		    l4= new JLabel("    Smile  ");
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
		    f2.add(p);
		    
		    back = new JButton("Close");
		    back.setFont(new Font("Arial", Font.BOLD,20));
		    back.setBackground(Color.RED);
		    back.setForeground(Color.BLACK);
		    back.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/close.png"));
		    back.setBounds(650,460,150,40);
		    back.addActionListener(this);
	        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    back.setBorder(BorderFactory.createCompoundBorder(bdr,bdr1));
		    f2.add(back);
		    
			String id= "";
		    String donor= "";
		    String bloodg = "";
		 
		  
		  try
		  { 
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
	      java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		  String sql = "select * from donor";
		  ResultSet rs = st.executeQuery(sql);
		    
		  
		  while(rs.next())
		  {
		  id = rs.getString("id");
		  donor = rs.getString("donor");
		  bloodg = rs.getString("bloodg");
	 
		  model.addRow(new Object[]{id, donor, bloodg});
		   
		  }
		  }
		  catch(Exception ex)
		  {
		  JOptionPane.showMessageDialog(null,"Error");
		  }
		  
		  
		   
		    JLabel lb1 = new JLabel("Stock Details");
		    lb1.setFont(new Font("Algerian", Font.BOLD, 40));
		    lb1.setForeground(Color.WHITE);
		    lb1.setBounds(450,20 ,700 , 40);
		    f2.add(lb1);
		    
		    
		    JLabel img2 = new JLabel();
		    img2.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/white.jpg"));
		    img2.setBounds(100,60,1000 ,450 );
		    img2.setBorder(bdr);
		    f2.add(img2);
		    
		    JLabel img = new JLabel();
		    img.setIcon(new ImageIcon("C:/Users/sakshi yadav/eclipse-workspace/Blood_Bank_System/Images/9.jpg"));
		    img.setBounds(0, 0,1270 ,650 );
		    f2.add(img);
			
			f2.setUndecorated(true);
			f2.setBounds(50,50,1200,600);
			f2.setLayout(null);
			f2.setResizable(false);
			f2.setVisible(true);

		
	}
	public void actionPerformed(ActionEvent e)
	{
		  if(e.getSource() == back)
		  {
		     new Home_Page();
			  f2.setVisible(false);
		  }
		
	}
}
 class Fetch extends Stock_Details
	{

	public  void gain()
	 {
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			

			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root" , "Sakshi123@");
			java.sql.Statement st1 = con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			
			
			ResultSet rs = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' A+ ' ");
			ResultSet rs_1 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' A+ ' ");	
			while(rs.next())
		    {
				while(rs_1.next())
				{	
		    	 int a_c = rs.getInt(1); 
		    	 int a_c_1 = rs_1.getInt(1);		     	 
		    	 int get_value = a_c - a_c_1;  
		    	 if(get_value <= 0)
		    	 {
		    		 a.setText("0");
		    	 }
		    	 else
		    	 {
		    		 String str3 = String.valueOf(get_value);
		    		 a.setText(str3);
		    	 }
		    	 
		    	 System.out.print(a);
		 		
				}
		    }

			ResultSet rs1 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' A- ' ");
			ResultSet rs1_1 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' A- ' ");

			while(rs1.next())
		    {
				while(rs1_1.next())
				{
					 int a_c = rs1.getInt(1);
					 int a_c_1 = rs1_1.getInt(1);
			    	 int get_value = a_c - a_c_1; 
			    	 if(get_value <= 0)
			    	 {
			    		 Stock_Details.a1.setText("0");
			    	 }
			    	 else
			    	 {
			    	 
			 	 	 String str4 = String.valueOf(get_value);
			 	 	Stock_Details.a1.setText(str4);
			    	 }
			    	
				} 
		    }
			
			
			
			ResultSet rs2 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' B+ ' ");
			ResultSet rs2_2 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' B+ ' ");
			while(rs2.next())
		    {
				while(rs2_2.next())
				{
					 int a_c = rs2.getInt(1);
					 int a_c_1 = rs2_2.getInt(1);
			    	 int get_value = a_c - a_c_1;
			    	 if(get_value <= 0)
			    	 {
			    		 Stock_Details.b.setText("0");
			    	 }
			    	 else
			    	 {
			 		 String str5 = String.valueOf(get_value);
			 		Stock_Details.b.setText(str5);	
			    	 }
				}
		    }
			
			
			ResultSet rs3 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' B- ' ");
			ResultSet rs3_3 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' B- ' ");
			while(rs3.next())
		    {
				while(rs3_3.next())
				{
					 int a_c = rs3.getInt(1);
					 int a_c_1 = rs3_3.getInt(1);
			    	 int get_value = a_c - a_c_1; 
			    	 if(get_value <= 0)
			    	 {
			    		 Stock_Details.b1.setText("0");
			    	 }
			    	 else
			    	 {
			 		 String str6 = String.valueOf(get_value);
			 		Stock_Details.b1.setText(str6);
			    	 }
				}	 
		    }
			
			ResultSet rs4 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' AB+ ' ");
			ResultSet rs4_4 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' AB+ ' ");
			while(rs4.next())
		    {
				while(rs4_4.next())
				{
					 int a_c = rs4.getInt(1);
					 int a_c_1 = rs4_4.getInt(1);
			    	 int get_value = a_c - a_c_1;
			    	 if(get_value <= 0)
			    	 {
			    		 Stock_Details.ab.setText("0");
			    	 }
			    	 else
			    	 {
			 		 String str7 = String.valueOf(get_value);
			 		Stock_Details.ab.setText(str7);
			    	 }
				} 
		    }
			
			
			
			ResultSet rs5 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' AB- ' ");
			ResultSet rs5_5 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' AB- ' ");

			while(rs5.next())
		    {
				while(rs5_5.next())
				{
					 int a_c = rs5.getInt(1);
					 int a_c_1 = rs5_5.getInt(1);
			    	 int get_value = a_c - a_c_1;   
			    	 if(get_value <= 0)
			    	 {
			    		 Stock_Details.ab1.setText("0");
			    	 }
			    	 else
			    	 {
			 		 String str8 = String.valueOf(get_value);
			 		Stock_Details.ab1.setText(str8);
			    	 }
				}
		    	
		    }
			
			ResultSet rs6 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' O+ ' ");
			ResultSet rs6_6 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' O+ ' ");
			while(rs6.next())
		    {
				while(rs6_6.next())
				{
					 int a_c = rs6.getInt(1);
					 int a_c_1 = rs6_6.getInt(1);
			    	 int get_value = a_c - a_c_1;
			    	 if(get_value <= 0)
			    	 {
			    		 o.setText("0");
			    	 }
			    	 else
			    	 {
			 		 String str9 = String.valueOf(get_value);
			 		  o.setText(str9);
			    	 }
				}
		    	 
		 		 
		    }
			
			ResultSet rs7 = st.executeQuery("Select COUNT(bloodg) from donor where bloodg = ' O- ' ");
			ResultSet rs7_7 = st1.executeQuery("Select COUNT(bloodg) from bloodtransfer where bloodg = ' O- ' ");
			while(rs7.next())
		    {
				while(rs7_7.next())
				{
					 int a_c = rs7.getInt(1);
					 int a_c_1 = rs7_7.getInt(1);
			    	 int get_value = a_c - a_c_1;   
			    	 if(get_value <= 0)
			    	 {
			    		 o1.setText("0");
			    	 }
			    	 else
			    	 {
			 		 String str10 = String.valueOf(get_value);
			 		  o1.setText(str10);
			    	 }
			 		 
				}
		    	
		    }
		}
		catch(Exception e)
		{
			
		}
	 }
	}


public class Stock
{
	public static void main(String[] args) 
	{
	  new Stock_Details();
	  
	   Fetch d = new Fetch();
	   d.gain();
	  
	}
}
