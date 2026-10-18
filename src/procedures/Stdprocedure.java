package procedures;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import studentmanagement.Databaseconnect;




public class Stdprocedure {
	Scanner sc=new Scanner(System.in);
	
	String store="create procedure insertstd("
			+ "ids int, "
			+ "names varchar(50), "
			+ "ages int) "
			+ "begin "
			+ "insert into studentinfo(id,name,age) values"
			+ "(ids,names,ages); "
			+ "select * from studentinfo; "
			+ "end";
	Connection con=Databaseconnect.getConnection();
	public void createprocedure() {
		try {
			Statement st=con.createStatement();
			st.executeUpdate(store);
			System.out.println("procedure stored successfully");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	String call="{call insertstd (?,?,?)}";
	public void insertprocedure() {
		try {
			System.out.println("enter your id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter your name");
			String name=sc.nextLine();
			System.out.println("enter your age");
			int age=sc.nextInt();
			CallableStatement cs=con.prepareCall(call);
			cs.setInt(1, id);
			cs.setString(2, name);
			cs.setInt(3, age);
			boolean result=cs.execute();
			if(result) {
				ResultSet rs=cs.getResultSet();
				while(rs.next()) {
					System.out.println("std id:"+rs.getInt("id")+" std name: "+rs.getString("name")+" std age: "+rs.getInt("age"));
				}
				
			}
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void  main(String[] args) {
		Stdprocedure std=new Stdprocedure();
		std.createprocedure();
		std.insertprocedure();
		
	}

}
