<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Create New Student</title>
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
		
		#logo {
			position:fixed;
			top:0px;
			left:2px;
			text-transform: none;
			display:inline-block;
			background-color:#001a66;
			color:white;
			z-index:4;
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
			<a href="Enrollment.jsp" class="nav-font-box nav-link">Student Enrollment</a> | 
		</div>

		<div id="main-containter">
				
			<p><h1>Student Enrollment</h1></p>
			<hr>
<p>
<Form method="post" action="StudentWebDB">
<center>
<table border=0>
<tr>
		<td> Student ID: </td>
		<td> <input type ="text" class="longPlease" name ="Student ID"></input> </td>
<tr>
<tr>
<td></td>
<td>
    	<center><input type="submit" value="Go" name="Go"></center>
</td>
</tr>
		<td> Course Description: </td>
		<td> <input type ="text"  class="longPlease" name="Course Description"></input> </td>
</tr>
</table>
</Form>

<table>
<tr>
		<td> First Name:  </td>
		<td> ${firstName} </td>
<tr>
		<td> Last Name:  </td>
		<td> ${lastName} </td>
</tr>
<tr>
		<td> Date of Birth: </td>
		<td> ${dateOfBirth} </td>
</tr>
<tr>
		<td> Address Line: </td>
		<td> ${addressLine} </td>
</tr>
<tr>
		<td> City: </td>
		<td> ${city} </td>
</tr>

 <c:forEach var="cs" items="${courseArr}" varStatus="csIndex">        
        <tr>
           <td> <input type="checkbox" name="" value="cs"> cs.courseName <br>
        </tr> 
</c:forEach>

<tr>
</tr>

</table>
</center>
</p>				
</div>
</body>
</html>
		