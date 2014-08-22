
<%@page import="lv.battlejam.generationjam.Generation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="lv.battlejam.usermanagment.*"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/menu.css" rel="stylesheet">
<link href="css/teamView.css" rel="stylesheet">


<title>BattleJam</title>
</head>
<body>

<img src="http://mfbbva.org/a/uploads/2008/03/5_accenture1.jpg" style="width: 100%;height:20%;">
    <div id='topmenu'>
        <ul>
            <li class='active'><a href='#'><span>Home</span></a></li>
            <li><a href='#'><span>Teams</span></a></li>
            <li><a href='#'><span>Past Jams</span></a></li>
            <li class='last'><a href='#'><span>Logout</span></a></li>
        </ul>
    </div>
    <div id='memberList'>
        <%
     //       ArrayList<Team> teamList = Generation.generateTeams();    
        %>
        
        
    </div>


    <%
       out.print("<p>Welcome "
           + ((Member) session.getAttribute("user")).getName()
               .toUpperCase() + "</p>");
    %>


</body>
</html>