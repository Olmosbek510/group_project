
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="static/bootstrap.min.css">
</head>
<body>


<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h2 class="text-center mb-4">Login</h2>
                    <form method="post" action="/auth/login">
                        <div class="form-group">
                            <label for="phone">Phone</label>
                            <input name="phone" type="text" class="form-control" id="phone" placeholder="Enter phone number">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input name="password" type="password" class="form-control" id="password" placeholder="Enter password">
                        </div>

                        <div>
                            <label for="remember">Remember me
                                <input name="remember_me" type="checkbox" id="remember">
                            </label>
                        </div>

                        <button type="submit" class="btn btn-primary btn-block">Login</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
