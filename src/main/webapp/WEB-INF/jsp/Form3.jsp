
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
						<li><a href="<c:url value="/viewUsersForEnable"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-book"></i>
								Views</a></li>


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
	<br>
	<br>
	<br>
	<div class="panel panel-default">



		<div class="panel-body">
			<div class="panel-heading">
				<h4>
					<b></b>
				</h4>
			</div>

			<form:form class="form-horizontal" action="savetest3" method="post"
				commandName="addDetails">
				<fieldset>
					<legend class="text-center">

						<label for="email" id="title"><b>FAMILY HISTORY</b></label>
					</legend>


					<legend class="">

						<label for="email" id="title"><b>Instructions:</b> Please
							check the appropriate box to answer questions about your family
							members. Include half-brothers and relatives who have died. Do
							NOT include relatives who were adopted into the family.</label>
					</legend>
					<!--  <label class= "control-label"  id="title" ><b>PERSONAL INFORMATION</b></label>-->

					<br>

					<!-- Name input-->
					<div class="form-group">


						<label class="col-md-3 control-label" for="name">1.Was
							your father ever diagnosed with prostate cancer?</label>
						<div class="col-md-5">


							<label class="radio"><form:radiobutton
									path="hasFatherDiagnosedWithProstrateCancer" value="1" />Yes</label>
							<label class="radio"><form:radiobutton
									path="hasFatherDiagnosedWithProstrateCancer" value="2" />No</label> <label
								class="radio"><form:radiobutton
									path="hasFatherDiagnosedWithProstrateCancer" value="3" />Dont
								know</label>
							<form:errors path="hasFatherDiagnosedWithProstrateCancer"
								cssStyle="color: #ff0000;" />
						</div>


					</div>



					<!-- if yes -->
					<div class="form-group">


						<label class="col-md-3 control-label" for="name"> If yes,
							was he diagnosed before age 60? </label>
						<div class="col-md-5">


							<label class="radio"><form:radiobutton
									path="ageOfFatherDiagnosis" value="1" />Yes</label> <label
								class="radio"><form:radiobutton
									path="ageOfFatherDiagnosis" value="2" />No</label> <label
								class="radio"><form:radiobutton
									path="ageOfFatherDiagnosis" value="3" />Dont know</label>
							<form:errors path="ageOfFatherDiagnosis"
								cssStyle="color: #ff0000;" />


						</div>


					</div>


					<!-- brothers you have -->
					<div class="form-group">


						<label class="col-md-3 control-label" for="name">How many
							brothers do you have? </label>
						<div class="col-md-5">


							<label class="radio"><form:radiobutton
									path="brothers" value="8" />None</label> <label
								class="radio"><form:radiobutton path="brothers"
									value="1" />1</label> 
											 <label class="radio"><form:radiobutton
									path="brothers" value="2" />2</label>
									 <label class="radio"><form:radiobutton
									path="brothers" value="3" />3</label> <label class="radio"><form:radiobutton
									path="brothers" value="4" />4</label> <label class="radio"><form:radiobutton
									path="brothers" value="5" />5</label> <label class="radio"><form:radiobutton
									path="brothers" value="More" />More</label>
									<label class="radio"><form:radiobutton
									path="brothers" value="Dont know" />Dont know</label>
									
								

							<form:errors path="brothers" cssStyle="color: #ff0000;" />


						</div>



					</div>


					<!-- brothers with prostrate cancer -->
					<div class="form-group">


						<label class="col-md-3 control-label" for="name">How many
							of them have had prostate cancer? </label>
						<div class="col-md-5">


							<label class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="None" />None</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="1" />1</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="2" />2</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="3" />3</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="4" />4</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="5" />5</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="More" />More</label> <label
								class="radio"><form:radiobutton
									path="brothersWithProstrateCancer" value="Dont know" />Dont
								know</label>
							<form:errors path="brothersWithProstrateCancer"
								cssStyle="color: #ff0000;" />

						</div>



					</div>
					<div class="form-group">


						<label class="col-md-3 control-label" for="name">How many
							of them were diagnosed before age 60? </label>
						<div class="col-md-5">


							<label class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="None" />None</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="1" />1</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="2" />2</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="3" />3</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="4" />4</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="5" />5</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="More" />More</label> <label
								class="radio"><form:radiobutton
									path="beforeAgeOfSixty" value="Dont know" />Dont know</label>
							<form:errors path="beforeAgeOfSixty" cssStyle="color: #ff0000;" />


						</div>



					</div>





					<hr>















					<!--if yes on circumsicion-->

















					<!-- Form actions -->
					<div class="form-group">
						<div class="col-md-12 text-right">
							<button type="submit" class="btn btn-primary btn-lg">Submit</button>
						</div>
					</div>
					<hr>

					<legend class="text-center">

						<label for="email" id="title"><b></b></label>
					</legend>
				</fieldset>
			</form:form>


			<form:form action="Form2" method="post" commandName="addDetails">
				<div class="form-group">
					<div class="col-md-12 text-left">



						<button type="submit" class="btn btn-primary btn-lg">BACK</button>

					</div>
				</div>

			</form:form>





			<br> <br>







			<!--  -->



		</div>

	</div>
	<!--/panel-body-->
	</div>
	<!--/panel-->




</body>
</html>