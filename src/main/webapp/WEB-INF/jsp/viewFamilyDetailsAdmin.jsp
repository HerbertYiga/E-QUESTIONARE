
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
					<b>Family DETAILS</b>
				</h4>
			</div>




			<table border="2" width="70%" cellpadding="2">
				<tr>
					<th>Full Names</th>
					<th>Has Father been Diagnosed With Prostrate Cancer</th>
					<th>Age Of Father Diagnosis</th>
					<th>Brothers With Prostrate Cancer</th>
					<th>Brothers</th>
					<th>Before Age Of Sixty</th>
				
				</tr>
				<c:forEach var="details" items="${list}">
					<tr>
						<td>${details.fullNames}</td>
						<td>${details.hasFatherDiagnosedWithProstrateCancer}</td>
						<td>${details.ageOfFatherDiagnosis}</td>
						<td>${details.brothersWithProstrateCancer}</td>
						<td>${details.brothers}</td>
						<td>${details.beforeAgeOfSixty}</td>
					
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="/E-Questionnaire/viewFamilyDetailsAdmin/1">1</a> <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/2">2</a>
 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/3">3</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/4">4</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/5">5</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/6">6</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/7">7</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/8">8</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/9">9</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/10">10</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/11">11</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/12">12</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/13">13</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/14">14</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/15">15</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/16">16</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/17">17</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/18">18</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/19">19</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/20">20</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/21">21</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/22">22</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/23">23</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/24">24</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/25">25</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/26">26</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/27">27</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/28">28</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/29">29</a>
				 <a
				href="/E-Questionnaire/viewFamilyDetailsAdmin/30">30</a>
				 

 <br> <br>







			<!--  -->



		</div>

	</div>
	<!--/panel-body-->
	</div>
	<!--/panel-->




</body>
</html>