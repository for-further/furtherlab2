package BOOK;
import java.io.IOException;
import java.util.*;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import sun.misc.Request;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction {
	/**
	 * Delete a Book!!
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String del() {//throws ServletException, IOException {
		//HttpServletRequest request = ServletActionContext.getRequest();
		//HttpServletResponse response = ServletActionContext.getResponse();
		DBConnection db = new DBConnection();
		//System.out.println(name);
		db.Del(name);
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		return "success";
	}
}
