<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
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


<title>BattleJam</title>
</head>
<body>
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
        ArrayList<Team> teamList = Generation.generateTeams();
        for (int i = 0; i < teamList.size(); i++) {
            out.println("<p>Team " + (i + 1) + " ["+ teamList.get(i).getMembers().size() + "]  </p>");
            for (Member m : teamList.get(i).getMembers()) {
               out.println("<li style=\\\"padding-left: 100px\\\">"+m.getName()+" " +m.getSurname()+"</li>");
            }
        }
    %>
    </div>



    <%
        out.print("<p>Welcome "
            + ((Member) session.getAttribute("user")).getName()
                .toUpperCase() + "</p>");
    %>


</body>
</html>