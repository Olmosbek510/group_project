<%@ page import="uz.inha.group_project.repo.GroupRepo" %>
<%@ page import="uz.inha.group_project.entity.Group" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Group</title>
    <link rel="stylesheet" href="static/bootstrap.min.css">
</head>
<body>


<%

    List<Group> groups = GroupRepo.getAll();

%>

<div class="m-3 ">
    <button href="/admin/addGroup.jsp" class="btn btn-primary">Add Group</button>
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

                    <th scope="col">N#</th>
                    <th scope="col">Group name</th>
                    <th scope="col">Actions</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <%for (Group group : groups) { %>
                    <td><%=group.getId()%></td>
                    <td><%=group.getName()%></td>
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
