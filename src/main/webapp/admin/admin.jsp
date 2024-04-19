
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
  <link rel="stylesheet" href="../static/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-3">
            <div class="btn-group-vertical btn-block" role="group">
                <button type="button" class="btn btn-primary">User</button>
                <button type="button" class="btn btn-secondary">Group</button>
            </div>
        </div>
        <div class="col-md-9">
            <table class="table table-striped table-bordered">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>John Doe</td>
                    <td>john@example.com</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jane Smith</td>
                    <td>jane@example.com</td>
                </tr>
                <!-- Add more rows as needed -->
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>
