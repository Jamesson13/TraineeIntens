<%--
  Created by IntelliJ IDEA.
  User: vlad_kodzhebash
  Date: 09.09.2021
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create user</title>
</head>
<body>
<h3>New user</h3>
<form method="post">
    <label>First Name</label><br>
    <label>
        <input type="text" id="f_name" name="first_name"/>
    </label><br><br>
    <label>Last Name</label><br>
    <label>
        <input type="text" id="l_name" name="last_name"/>
    </label><br><br>
    <label>Age</label><br>
    <label>
        <input type="number" id="age" name="user_age"/>
    </label><br><br>
    <input type="submit" value="Save"/>
</form>
</body>
</html>
