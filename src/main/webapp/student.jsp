<%@ page import="uz.inha.group_project.repo.StudentRepo" %>
<%@ page import="uz.inha.group_project.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 19.04.2024
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="static/bootstrap.min.css">
</head>
<body>

<%
    List<Student> students = StudentRepo.getAll();

%>

<div class="m-3 ">
    <button href="/admin/addStudent.jsp" class="btn btn-primary">Add Student</button>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-3">
            <div class=" list-group" >
                <a href="/group.jsp " type="button" class="text-dark list-group-item btn btn-primary">Group</a>
                <a href="/student.jsp" type="button" class="text-dark list-group-item btn btn-primary">Student</a>
            </div>
        </div>
        <div class="col-md-9">
            <table class="table table-striped table-bordered">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">First name</th>
                    <th scope="col">Last name</th>
                    <th scope="col">Group</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <%for (Student student : students) { %>

                    <td><%=student.getFirstName()%></td>
                    <td><%=student.getLastName()%></td>
                    <td><%=student.getGroup().getName()%></td>
                    <td>

                        <button class="btn-info">Edit</button>
                        <button class="btn-danger">Delete</button>

                    </td>


                      <%}%>

                </tr>


                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
