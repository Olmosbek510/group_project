<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 19.04.2024
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add group</title>
    <link rel="stylesheet" href="../static/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <form>
                <div class="form-group">
                    <label for="name">Name</label>
                    <input name="groupNamge" type="text" class="form-control" id="name" placeholder="Enter group name">
                </div>
                <button href="/admin/group/add" type="submit" class="btn btn-primary">Save</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
