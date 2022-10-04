<html>
<body>
<h1>Registration form</h1>

<form action="reqRegister" >
Full Name: <input type=text name="fname"><br>
Email: <input type=text name="email"><br>
Password: <input type=password name="password"><br>
Mobile : <input type=text name="mobile"><br>

<input type=submit value="Register">


</form>


<h2><a href="reqViewALlStudents">view All Students</a></h2>


<form action="reqDeleteStudent">

 <input type=text placeholder="Enter id" name="id">
 <input type=submit value="Delete">

</form>



<form action="getStudentById">

 <input type=text placeholder="Enter id" name="id">
 <input type=submit value="Get Student">

</form>


<form action="updateStudentById">

 <input type=text placeholder="Enter id" name="id">
 <input type=text placeholder="Enter New Name" name="fname">
 <input type=text placeholder="Enter New Mobile" name="mobile">
 
 
 <input type=submit value="Update Student">

</form>




</body>

</html>
