<%--
  Created by IntelliJ IDEA.
  User: vlad_kodzhebash
  Date: 09.09.2021
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit user</title>
</head>
<body>
<h3>Edit user</h3>
<form method="post">
    <input type="hidden" id="id" value="${requestScope.user.userId}" name="user_id"/>
    <label>
        <input type="text" id="f_name" value="${requestScope.user.firstName}" name="first_name"/>
    </label><br><br>
    <label>Last Name</label><br>
    <label>
        <input type="text" id="l_name" value="${requestScope.user.lastName}" name="last_name"/>
    </label><br><br>
    <label>Age</label><br>
    <label>
        <input type="number" id="age" value="${requestScope.user.userAge}" name="user_age"/>
    </label><br><br>
    <input type="submit" value="Send"/>
</form>
</body>
</html>

