<%@ page language="java" import="java.util.*" import="BOOK.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Show Details!</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h3><s:property value="name"/></h3>
    <form action = "QueryAction">
<!--     <%String bbk = "Harry Potter and the Chamber of Secrets"; %> -->
<!--     <a href="QueryAction?name=<%=bbk %>">Harry Potter and the Chamber of Secrets</a> -->
    <%
    	Vector<String> v;
    	v = (Vector<String>)request.getAttribute("list");
    	if(v.size() == 0) out.println("No Book!</br>");
    	for(int i=0; i<v.size(); i++){
    		String bk = v.elementAt(i);
    		out.println("<a href=\"QueryAction?name=" + bk + "\" >" + bk + "</a>");
    		out.println("<a href=\"DeleteAction?name="+bk+"\" >"+"Delete the Book"+"</a></br>");
    	}
     %>
     <a href="index.jsp">back to home</a>
	</form>
  </body>
</html>
