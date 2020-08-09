
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

						<li class="active"><a href="<c:url value="/UserPanel"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-home"></i>
								Home</a></li>
						<li><a href="<c:url value="//viewPersonDetails/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> PERSONAL DETAILS</a></li>
						<li><a href="<c:url value="/viewBehavioralDetails/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> BEHAVIOUR DETAILS</a></li>
						<li><a href="<c:url value="/viewMedicalDetails/1"/>"
							style="color: #ffffff;"><i
								class="glyphicon glyphicon-envelope"></i> MEDICAL DETAILS</a></li>
						<li><a href="<c:url value="/viewFamilyDetails/1"/>"
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
					<b>Medical  DETAILS</b>
				</h4>
			</div>




			<table border="2" width="70%" cellpadding="2">
				<tr>
					<th>Full Names</th>
					<th>Weight</th>
					<th>Feet</th>
					<th>Inches</th>
					<th>Circumsised</th>
					<th>Had Vasectomy</th>
					
					<th>Age of vesectomy</th>
					<th>Diagnosed Of Hiv</th>
					<th>AboutCancer From Doctr</th>
					<th>Cancer Type And Age</th>
					<th>Age Of Circumsion</th>
					<th>Diagnosed Of Std</th>

				</tr>
				<c:forEach var="details" items="${list}">
					<tr>
						<td>${details.fullNames}</td>
						<td>${details.weight}</td>
						<td>${details.feet}</td>
						<td>${details.inches}</td>
						<td>${details.circumsised}</td>
						<td>${details.hadVasectomy}</td>
						<td>${details.ageofvesectomy}</td>
						<td>${details.diagnosedOfHiv}</td>
						<td>${details.aboutCancerFromDoctr}</td>
						<td>${details.cancerTypeAndAge}</td>
						<td>${details.ageOfCircumsion}</td>
						<td>${details.diagnosedOfStd}</td>
				

					</tr>
				</c:forEach>
			</table>
			<br /> 
			<a href="/E-Questionnaire/viewMedicalDetails/1">1</a> 
			<a href="/E-Questionnaire/viewMedicalDetails/2">2</a> 
			<a href="/E-Questionnaire/viewMedicalDetails/3">3</a> 
			
			<a href="/E-Questionnaire/viewMedicalDetails/4">4</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/5">5</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/6">6</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/7">7</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/8">8</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/9">9</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/10">11</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/12">12</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/13">13</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/14">14</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/15">15</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/16">16</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/17">17</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/18">18</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/19">19</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/20">20</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/21">21</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/22">22</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/23">23</a> 
			
		<a href="/E-Questionnaire/viewMedicalDetails/24">24</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/25">25</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/26">26</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/27">27</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/28">28</a> 
			
		<a href="/E-Questionnaire/viewMedicalDetails/29">29</a> 
			
		
		<a href="/E-Questionnaire/viewMedicalDetails/30">30</a> 
			
		
			





			<!--  -->



		</div>

	</div>
	<!--/panel-body-->
	</div>
	<!--/panel-->




</body>
</html>