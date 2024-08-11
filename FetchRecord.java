package connect_java_with_my_sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class FetchRecord {

	
	public static <BufferedReder> void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/elephant","root","KUNJ@$#@!");

	//int result=stmt.executeUpdate("delete from emp where id=3");  
	//System.out.println(result+" records affected");  
//stmt.executeUpdate("insert into  emp values(1,'kunj',224)");
//stmt.executeUpdate("insert into  emp values(2,'kun',234)");
//stmt.executeUpdate("insert into  emp values(3,'kunbj',244)");
//stmt.executeUpdate("insert into  emp values(4,'kunvj',254)");
//stmt.executeUpdate("insert into  emp values(5,'kuncj',254)");
//stmt.executeUpdate("insert into  emp values(6,'kuncj',254)");
//int result =stmt.executeUpdate("update emp set name='mukund',age=29");
//		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ResultSet rs=stmt.executeQuery("select * from emp");
//			// geting the record of forth row 
//			rs.absolute(3);
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		System.out.println("records afected");
//PreparedStatement stmt = con.prepareStatement("insert into empp values(?,?)");
		
//stmt.setInt(1, 101);
//stmt.setString(2, "kunjbihari");
//
//int i = stmt . executeUpdate();
//System.out.println(i+"records inserted");
//		
//		PreparedStatement stmt = con.prepareStatement("update  empp set name=? where id = ?");
//		stmt.setString(1, "Son");
//		stmt.setInt(2, 101);
//		int i = stmt.executeUpdate();
//		System.out.println(i+"records updtated");
//PreparedStatement stmt = con .prepareStatement("delete from empp where id =?");
//stmt.setInt(1, 101);
//int i = stmt.executeUpdate();
//System.out.println(i+"records deleted");
//		PreparedStatement stmt = con.prepareStatement("select*from emp");
//		ResultSet rs = stmt.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2));
//		}
//		con.close();
//		
//	PreparedStatement ps = con.prepareStatement("insert into empp values(?,?)");
//	
//	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
//		do{  
//			System.out.println("enter id:");  
//			int id=Integer.parseInt(br.readLine());  
//			System.out.println("enter name:");  
//			String name=br.readLine();  
//		
//			ps.setInt(1,id);  
//			ps.setString(2,name);  
//			
//			int i=ps.executeUpdate();  
//			System.out.println(i+" records affected");  
//			  
//			System.out.println("Do you want to continue: y/n");  
//			String s=br.readLine();  
//			if(s.startsWith("n")){  
//			break;  
//			}  
//			}while(true);  
//			  
//			con.close();  
//			 
//PreparedStatement ps = con.prepareStatement("select * from emp");
//ResultSet rs = ps.executeQuery();
//ResultSetMetaData rsmd = rs.getMetaData();
//System.out.println("Total columns:"+ rsmd.getColumnCount());
//System.out.println("Column name of 1st column "+ rsmd.getColumnTypeName(1));
//	System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  

//		DatabaseMetaData dbmd = con.getMetaData();
//		System.out.println("Driver Name:" + dbmd.getDriverName());
//		System.out.println("Driver Verson:" + dbmd.getDriverVersion());
//		System.out.println("UserName:"+dbmd.getUserName());
//		System.out.println("Databse product name" +dbmd.getDatabaseProductName());
//		System.out.println("Databse Product version"+dbmd.getDatabaseProductVersion());

		//		@@@@@@@@@@2DATABASEMETADATA INTERFACE THAT PRINTS TOTALNUMBER OF TABLES
//		DatabaseMetaData dbmd = con.getMetaData();
//		String table[]= {"TABLE"};
//		ResultSet rs = dbmd.getTables(null, null, null,table);
//		while(rs.next()) {
//			System.out.println(rs.getString(3));
//			
//		}
		
		//@@@@@@2222DATABSEMETADATA INTERFASE THAT PRINTS TOTAL NUMBER OF VIEWS
		
//		DatabaseMetaData dbmd = con.getMetaData();
//		String table[]= {"VIEW"};
//		ResultSet rs = dbmd.getTables(null, null, null, table);
//		while(rs.next()) {
//			System.out.println(rs.getString(3));
//		}
//		@@@@@@@@@@@@22JAVA  EXAMPLE TO STORE IMAGE IN THE DATABASE
//		PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
//		ps.setString(1, "kunj");
//		FileInputStream fin=new FileInputStream("C:\\download.jpeg");
//		ps.setBinaryStream(2,fin,fin.available());
//		int i=ps.executeUpdate();
//		System.out.println(i+"records affected");
//		@@@@@@@@@@@@@@@@@@2EXAMPLE TO RETRIVE IMAGE FROM FROM DATABASE
//		PreparedStatement ps = con.prepareStatement("select*from imgtable");
//		ResultSet rs=ps.executeQuery();
//		if(rs.next()) {
//			Blob b = rs.getBlob(2);
//			byte barr[]=b.getBytes(1, (int)b.length());
//			FileOutputStream fout = new FileOutputStream("C:\\download.jpeg");
//			fout.write(barr);
//			fout.close();
//		}
//		System.out.println("ok");
		
		//@@@@@@@@@@@@@@@2JAVA EXAMPLE  TO STORE FILE IN DATABSE USING JDBC 
		PreparedStatement ps = con.prepareStatement("insert into filetable values(?,?)");
		File f = new File("C:\\Users\\user\\Desktop\\Resume kunj sri 8 (4).pdf");
		FileReader fr = new FileReader(f);
		  ps.setInt(1, 101);
		  ps.setCharacterStream(2, fr,(int)f.length());
		int i = ps.executeUpdate();
		  System.out.println(i+"records afected");

	System.out.println("success");
	
		
	}
	}

	


