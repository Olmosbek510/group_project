
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
            <form action="/admin/group/add" method="post">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input name="groupName" type="text" class="form-control" id="name" placeholder="Enter group name">
                </div>
                <button  type="submit" class="btn btn-primary text-dark">Save</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
