package BOOK;
import java.io.IOException;
import java.util.*;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import sun.misc.Request;

import com.opensymphony.xwork2.ActionSupport;

public class QueryAction {
	/**
	 * Show Details!!
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void show() throws ServletException, IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		DBConnection db = new DBConnection();
		Vector<String> lst =  db.getDetail(name);
		request.setAttribute("list2", lst);
		request.getRequestDispatcher("/showresult.jsp").forward(request, response);
	}
}
