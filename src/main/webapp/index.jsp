<%@ page import="java.util.List" %>
<%@ page import="uz.inha.group_project.entity.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="uz.inha.group_project.repo.UserRepo" %>
<%@ page import="uz.inha.group_project.entity.Student" %>
<%@ page import="uz.inha.group_project.repo.StudentRepo" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <link rel="stylesheet" href="static/bootstrap.min.css">
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>

<body>
<%
    @SuppressWarnings("unchecked")
    Object object = session.getAttribute("students");
    List<Student> students = new ArrayList<>();
    if (object != null) {
        students = (List<Student>) object;
    } else {
        students = StudentRepo.getAll();
    }
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <form action="${pageContext.request.contextPath}/student/filter" class="form-inline my-2 my-lg-0 mr-auto"
              method="get">
            <input name="username" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="login.jsp">Login</a>
            </li>
        </ul>
    </div>
</nav>
<table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Group Name</th>
    </tr>
    </thead>
    <tbody>
    <%for (Student student : students) {%>
    <tr>
        <td><%=student.getFirstName()%></td>
        <td><%=student.getLastName()%></td>
        <td><%=student.getGroup().getName()%></td>
    </tr>
    <%} %>
    </tbody>
</table>
</body>
</html>