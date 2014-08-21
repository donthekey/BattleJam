<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="lv.battlejam.usermanagment.Member"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="css/menu.css" rel="stylesheet" >
<title>BattleJam</title>
</head>
<body>
    <%
        out.print("<p>Welcome "
            + ((Member) session.getAttribute("user")).getName() + "</p>");
    %>
    <div id='topmenu'>
        <ul>
            <li class='active'><a href='#'><span>Home</span></a></li>
            <li><a href='#'><span>Teams</span></a></li>
            <li><a href='#'><span>Past Jams</span></a></li>
            <li class='last'><a href='#'><span>Logout</span></a></li>
        </ul>
    </div>



</body>
</html>