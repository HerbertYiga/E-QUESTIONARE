
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EQuestiannaire</title>
<!-- booot strap,css and java script files -->

<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<link href="<c:url value="/resources/css/admin.css"/>" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>





<!-- Script for validating that an image is captured -->

</head>
<body>

	<div class="navbar-wrapper">
		<div class="container-fluid">
			<nav class="navbar navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>

				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">

						<li class="active"><a href="<c:url value="/AdminPanel"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-home"></i>
								Home</a></li>
						<li><a href="<c:url value="/viewPersonDetailsAdmin/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> PERSONAL DETAILS</a></li>
						<li><a href="<c:url value="/viewBehavioralDetailsAdmin/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> BEHAVIOUR DETAILS</a></li>
						<li><a href="<c:url value="/viewMedicalDetailsAdmin/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> MEDICAL DETAILS</a></li>
						<li><a href="<c:url value="/viewFamilyDetailsAdmin/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> FAMILY DETAILS</a></li>

						<!--  <li><a href="<c:url value="/addStudent"/>"><i class="glyphicon glyphicon-comment"></i>  Verify Students</a></li>
                <li><a href="#"><i class="glyphicon glyphicon-user"></i> Register Student</a></li>
             -->



					</ul>
					<ul class="nav navbar-nav pull-right">
						<li><a href="<c:url value="/Logout"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-off"></i>
								Logout</a></li>
					</ul>
				</div>
			</div>
			</nav>
		</div>
	</div>

	<div class="panel panel-default">



		<div class="panel-body">
			<div class="panel-heading">
				<br> <br>
				<h4>
					<b>PERSON DETAILS</b>
				</h4>
			</div>




			<table border="2" width="70%" cellpadding="2">
				<tr>
					<th>Full Names</th>
					<th>Level of Educ</th>
					<th>Occupation Held</th>
					<th>Your Tribe</th>
					<th>Father's Tribe</th>
					<th>Mother's Tribe</th>
					<th>Date of birth</th>
				</tr>
				<c:forEach var="details" items="${list}">
					<tr>
						<td>${details.fullNames}</td>
						<td>${details.levelOfEduc}</td>
						<td>${details.occupationHeld}</td>
						<td>${details.yourTribe}</td>
						<td>${details.fathersTribe}</td>
						<td>${details.mothersTribe}</td>
						<td>${details.dob}</td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="/E-Questionnaire/viewPersonDetailsAdmin/1">1</a> <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/2">2</a>
 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/3">3</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/4">4</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/5">5</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/6">6</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmmin/7">7</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/8">8</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/9">9</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/10">10</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/11">11</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/12">12</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/13">13</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/14">14</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/15">15</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/16">16</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/17">17</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/18">18</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/19">19</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/20">20</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/21">21</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/22">22</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/23">23</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/24">24</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/25">25</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/26">26</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/27">27</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/28">28</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/29">29</a>
				 <a
				href="/E-Questionnaire/viewPersonDetailsAdmin/30">30</a>
				 

 <br> <br>







			<!--  -->



		</div>

	</div>
	<!--/panel-body-->
	</div>
	<!--/panel-->




</body>
</html>