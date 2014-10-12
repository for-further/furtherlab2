package BOOK;
import java.sql.*;
import java.util.*;

import info.SaeUserInfo;

public class DBConnection {
	public Vector<String> getBOOK(String author){
		Vector<String> vec = new Vector<String>();
		String dri = "com.mysql.jdbc.Driver";
		//String url = "jdbc:mysql://localhost:3306/blist";
		String url = "jdbc:mysql://r.rdc.sae.sina.com.cn:3307/app_furtherlab2";
		String user = SaeUserInfo.getAccessKey();
		String passwd = SaeUserInfo.getSecretKey();
		//String user = "root";
		//String passwd = "fridy1994";
		String sql = "select * from author";
		Connection con = null;
		Statement book = null;
		ResultSet res = null;
		int id = 0;
		try{
			Class.forName(dri);
			con = DriverManager.getConnection(url, user, passwd);
			book = con.createStatement();
			res = book.executeQuery(sql);
			while(res.next()){
				String k = res.getString("Name");
				if(k.equals(author)) {
					id = res.getInt("AuthorID");
					//System.out.println("YES");
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("driver error.");
		}catch(SQLException se){
			se.printStackTrace();
			System.out.println("here");
			System.out.println("connection error.");
		}finally{
			try{
				res.close();
				book.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("close error.");
			}
		}
		//System.out.println(id);
		sql = "select * from book";
		try{
			Class.forName(dri);
			con = DriverManager.getConnection(url, user, passwd);
			book = con.createStatement();
			res = book.executeQuery(sql);
			while(res.next()){
				int k = res.getInt("AuthorID");
				if(k != id) continue;
				String tmp = "";
				tmp = res.getString("Title");
				vec.addElement(tmp);
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("driver error.");
		}catch(SQLException se){
			se.printStackTrace();
			System.out.println("connection error.");
		}finally{
			try{
				res.close();
				book.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("close error.");
			}
		}
		return vec;
	}
	public Vector<String> getDetail(String bname){
		//System.out.println("S " + bname);
		Vector<String> vec = new Vector<String>();
		vec.addElement(bname);
		String dri = "com.mysql.jdbc.Driver";
		//String url = "jdbc:mysql://localhost:3306/blist";
		String url = "jdbc:mysql://r.rdc.sae.sina.com.cn:3307/app_furtherlab2";
		String user = SaeUserInfo.getAccessKey();
		String passwd = SaeUserInfo.getSecretKey();
		//String user = "root";
		//String passwd = "fridy1994";
		String sql = "select * from book";
		Connection con = null;
		Statement book = null;
		ResultSet res = null;
		int id = 0;
		try{
			Class.forName(dri);
			con = DriverManager.getConnection(url, user, passwd);
			book = con.createStatement();
			res = book.executeQuery(sql);
			while(res.next()){
				String tmp = "";
				tmp = res.getString("Title");
				//System.out.println(tmp);
				if(tmp.equals(bname)){
					tmp = res.getString("ISBN");
					vec.addElement("ISBN: " + tmp);
					tmp = res.getString("Publisher");
					vec.addElement("Publisher: " + tmp);
					tmp = res.getString("PublishDate");
					vec.addElement("PublishDate: " + tmp);
					tmp = res.getString("Price");
					vec.addElement("Price: " + tmp);
					id = res.getInt("AuthorID");
					vec.addElement("AuthorID: " + Integer.toString(id));
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("driver error.");
		}catch(SQLException se){
			se.printStackTrace();
			System.out.println("connection error.");
		}finally{
			try{
				res.close();
				book.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("close error.");
			}
		}
		sql = "select * from author";
		try{
			Class.forName(dri);
			con = DriverManager.getConnection(url, user, passwd);
			book = con.createStatement();
			res = book.executeQuery(sql);
			while(res.next()){
				int k = res.getInt("AuthorID");
				if(k != id) continue;
				String tmp = "";
				tmp = res.getString("Name");
				vec.addElement("Author's name: " + tmp);
				tmp = res.getString("Age");
				vec.addElement("Author's age: " + tmp);
				tmp = res.getString("Country");
				vec.addElement("Author's Country: " + tmp);
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("driver error.");
		}catch(SQLException se){
			se.printStackTrace();
			System.out.println("connection error.");
		}finally{
			try{
				res.close();
				book.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("close error.");
			}
		}
		return vec;
	}
	public void Del(String bname){
		String dri = "com.mysql.jdbc.Driver";
		//String url = "jdbc:mysql://localhost:3306/blist";
		String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_furtherlab2";
		String user = SaeUserInfo.getAccessKey();
		String passwd = SaeUserInfo.getSecretKey();
		//String user = "root";
		//String passwd = "fridy1994";
		Connection con = null;
		Statement book = null;
		try{
			Class.forName(dri);
			con = DriverManager.getConnection(url, user, passwd);
			book = con.createStatement();
			String sql = "delete from book where Title = '" + bname + "'";
			//System.out.println(sql);
			int cnt = book.executeUpdate(sql);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("driver error.");
		}catch(SQLException se){
			se.printStackTrace();
			System.out.println("connection error.");
		}finally{
			try{
				book.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("close error.");
			}
		}
		
	}
}
