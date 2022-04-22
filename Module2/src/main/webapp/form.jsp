<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script  src="resourses/js/val.js"></script>


<title>New form</title>
</head>
<body>
 <form>
  First Name : <input type='text' id='fname' placeholder='Enter First Name'><br><br>
  Last Name : <input type='text' id='lname' placeholder='Enter Last Name'><br><br>
  Age : <input type='text' id='age' placeholder='Age'><br><br>
  Sex : <input type='radio' class='sex'> Male <input type='radio' class='sex'> Female
 </form>
 <button id='submit'>Submit</button>
</body>
</html>