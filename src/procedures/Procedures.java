package procedures;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import emp.Dbconnection;

public class Procedures {
	// should give in inout out 
	// should not give delimter
	// give space in begin
	// do not give slash after end
	
	String store=
			"create procedure insertdisplay(in empids int, "
			+ "empnames varchar(50),"
			+ "empsalarys double,"
			+ "empshifttimes varchar(50),"
			+ "emppasswords varchar(50))"
			+ "begin "// need space
			+ "insert into emptable(empid, empname,empsalary, empshifttime,emppassword)"
			+ "values(empids,empnames,empsalarys,empshifttimes,emppasswords);"
			+ "select * from emptable;"
			+ "end"; //  need space
	Connection conn=Dbconnection.dbconnection()	;
	public void createprocedures() {
		try {
			Statement st=conn.createStatement();
			st.executeUpdate(store);
			System.out.println("created procedure");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	String call="{call insertdisplay (?,?,?,?,?)}";
	public void callprocedures() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your empid");
			int empid=sc.nextInt();
			sc.nextLine();
			System.out.println("enter your empname");
			String empname=sc.nextLine();
			System.out.println("enter your empsalary");
			Double empsalary=sc.nextDouble();
			sc.nextLine();
			System.out.println("enter your shifttime");
			String empshifttime=sc.nextLine();
			System.out.println("enter your password");
			String emppassword=sc.nextLine();
			CallableStatement cs=conn.prepareCall(call);
			cs.setInt(1,empid);
			cs.setString(2, empname);
			cs.setDouble(3, empsalary);
			cs.setString(4,empshifttime);
			cs.setString(5, emppassword);
			boolean result=cs.execute();
			if(result) {
				ResultSet rs=cs.getResultSet();		
				while(rs.next()) {
				System.out.println("empid:"+rs.getInt("empid")+" empname: "+rs.getString("empname")+
						" empsalary:"+rs.getDouble("empsalary")+" empshifttime:"+rs.getString("empshifttime")+
						" emppassword:"+rs.getString("emppassword"));
				}
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Procedures procedures=new Procedures();
		procedures.createprocedures();
		procedures.callprocedures();
	}
	

}
