package Day4Training.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CustomerData {
	public static void main(String[] args)  {
		
	      System.out.println("Example of java database connnectivity::");
	      Connection con=null;
		  Scanner sc=new Scanner(System.in);
		  
		  try 
		  {
			  Class.forName("com.mysql.jdbc.Driver"); //load the driver
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CustomerDatabase","root","Arun@123Arun@123");
			
			  
			  System.out.println("ENter to do the operation:: \n press 1 for insert \n press 2 for delete \n press 3 for update \n press 4 display customer details \n press 5 to exit \n");
			  int choice=sc.nextInt();
			  
			  switch (choice) {
			  //insert
			case 1:String str="insert into CustomerTable(cust_id,cust_fname,cust_lname,address,email) values(?,?,?,?,?)";
				  
		         //input from keyboard
			
			      System.out.println("ENter customer id:: ");
			      String s1=sc.next();
			
			      System.out.println("ENter custoemr first name:: ");
			      String s2=sc.next();
			
			      System.out.println("ENter custoemr last name:: ");
			      String s3=sc.next();
			
		          System.out.println("ENter custoemr address:: ");
			      String s4=sc.next();
			
			      System.out.println("ENter custoemr email:: ");
			      String s5=sc.next();
			
			      PreparedStatement ps=con.prepareStatement(str);
			      ps.setString(1, s1);
			      ps.setString(2, s2);
			      ps.setString(3, s3);
			      ps.setString(4, s4);
			      ps.setString(5, s5);
			      int i=ps.executeUpdate();
			      System.out.println(i+" record inserted!!");
				  ps.close();
				  break;
				  //delete
			case 2:String query1="delete from CustomerTable where cust_id=?";
			       System.out.println("ENter Customer id whose record you want to delete::\n");
	               int id=sc.nextInt();
	        
	               PreparedStatement ps1=con.prepareStatement(query1);
	               ps1.setInt(1, id);
	               int i1=ps1.executeUpdate();
	        
	               System.out.println(i1+" record deleted !!");
	               ps1.close();
				   break;
			case 3://update
				String query2="update CustomerTable set cust_fname=?,cust_lname=?,address=?,email=? where cust_id=?";
			        
			        String CustomerId=JOptionPane.showInputDialog("Enter Customer id");
			        String CustomerfName=JOptionPane.showInputDialog("Enter Customer FIrst name");
			        String CustomerlName=JOptionPane.showInputDialog("Enter Customer last name");
			        String CustomerAddress=JOptionPane.showInputDialog("Enter Customer address");
			        String CustomerEmail=JOptionPane.showInputDialog("Enter Customer email");
			        
			        PreparedStatement ps2=con.prepareStatement(query2);
			        ps2.setString(1, CustomerId);
			        ps2.setString(2, CustomerfName);
			        ps2.setString(3, CustomerlName);
			        ps2.setString(4, CustomerAddress);
			        ps2.setString(5, CustomerEmail);
			        
			        int y=ps2.executeUpdate();
			        ps2.close();
			        break;
			case 4: // Displaying the details of all the customers
				   String query3="select * from CustomerTable";
				   PreparedStatement ps3=con.prepareStatement(query3);
				   ResultSet res=ps3.executeQuery();
				   
				   while(res.next())
				   {
					   System.out.println("CUstomer id is :: "+res.getString(1)+" , Customer first name is :: "+res.getString(2)+" , CUstomer last name is ::   "+res.getString(3)+" , customer address is ::  "+res.getString(4)+" , email is :: "+res.getString(5)+" ; ");
				   }
				   break;
			case 5: //terminate the application
				System.exit(0);
				break;
			} 
		  }
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
	}

}
