<!DOCTYPE html> 
<html> 
<head> 
    <title>User details</title> 
</head> 
<body> 
    <h2>User Form</h2> 
    <form action="/adduserdata" method="post"> 
        <label for="id">ID:</label> 
        <input type="text" id="id" name="id" required><br><br> 
           <label for="name">Name:</label> 
        <input type="text" id="name" name="name" required><br><br> 
        <label for="pass">password:</label> 
        <input type="password" id="pass" name="pass" required><br><br> 
        <label for="number">number:</label> 
        <input type="number" id="number" name="number" required><br><br> 
        <input type="submit" value="Submit"> 
    </form> 
</body> 
</html>