<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
	<style type="text/css">
		
		body {
			font-family:arial;
			margin: 0px;
			padding:0px;
		}
		
		#navigation-bar {
		
			/***********  Fixed position at top, 100% */
			position:fixed;
			top: 0;
			left:0;
			margin:0;
			width:100%;
			height:41px;
			z-index:1;
			
			/*********** alignment of items within bar */
			display: flex;
			align-items: center;
			justify-content: center;
			/**padding-left:130px;*/
			overflow:hidden;
			
			/***********  styling */
			background-color:#eaf0fa;
					
		}
		
		.nav-link:hover {
			background-color:#001a66;
			box-shadow: 2px 2px 2px 2px grey;
			color: white;
		}
				
		.nav-font-box {	
			border-radius: 5px;
			margin: 5px 5px 5px 5px;
			padding: 5px 10px 5px 10px;
			text-transform: uppercase;
			font-size:15;
			color: black;
			font-family: arial;
			letter-spacing: 1px;
			text-decoration:none;
			background-color:#eaf0fa;
			float:left;
		}
	
		#main-containter{
			margin-left:auto;
			margin-right:auto;
			padding:30px 50px 200px 50px;
			top:0px;
			width:1190px;
			background-color:#f9f9f9;
		}
		.error{
			color:red;
		}
		
		hr {
			border-top: 1px #0f213e solid;
		}
		h1 {
			color: #0f213e;
			font-size:200%;
			text-align: center;
			letter-spacing: 1px;
		}
		
		.longPlease {
			width: 300px;
		}
		
		td {
		width : 100px
		}
		tr{
			height:40px;
		}
		
	</style>
	
	<body>

</body>
</html>
		<div id="navigation-bar">
			
			<a href="index.jsp" class="nav-font-box nav-link">Home</a> | 
			<a href="AddStudent.jsp" class="nav-font-box nav-link">Add New Student</a> | 
			<a href="Search.jsp" class="nav-font-box nav-link">Edit Student</a> 
		</div>

		<div id="main-containter">
				
			<p><h1> Edit Student</h1></p>
			<hr>
<p>
<Form method="post" action="StudentWebDB">
<center>
<table border=0>
<tr>
		<td>Student ID: </td>
		<td> <input type="text" readonly="readonly" STYLE="background-color: #CCCCCC" class="longPlease" name="StudentID" value = ${StudentID}></input> </td>
</tr>
<tr>
		<td> First Name: </td>
		<td> <input type ="text" class="longPlease" name ="FirstName" value = ${FirstName}></input> </td>
<tr>
		<td> Last Name: </td>
		<td> <input type ="text"  class="longPlease" name="LastName" value = ${LastName}></input> </td>
</tr>
<tr>
		<td> Date of Birth: </td>
		<td> <input type ="text"  name="DateOfBirth" value = ${DateOfBirth}></input> </td>
</tr>
<tr>
		<td> Address Line: </td>
		<td> <input type ="text"  class="longPlease" name="AddressLine1" value = ${AddressLine1}></input> </td>
</tr>
<tr>
		<td> City: </td>
		<td> <input type ="text"  class="longPlease" name = "City" value = ${City}></input> </td>
</tr>
<tr>
		<td> UserName: </td>
		<td> <input type ="text" class="longPlease"  name = "Username" value = ${Username}></input> </td>
</tr>
<tr>
		<td> Password: </td>
		<td> <input type ="text"  class="longPlease" name = "Password" value = "*********************"></input> </td>
</tr>
<tr>
<td></td>
<td>
		 <center><input type="submit" value="Add Student" name="AddStudent"></center>
</td>
</tr>
</table>
</Form>
</center>
</p>				
		</div>
		
		
	</body>
	
</html>
		