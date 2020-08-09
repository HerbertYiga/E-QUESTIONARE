
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
						<li><a href="<c:url value="/viewPersonDetails/1"/>"
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



	<div class="panel-body">
		<div class="panel-heading">
			<h4>
				<b></b>
			</h4>
		</div>

		<form:form class="form-horizontal" action="gototest2" method="post"
			commandName="addDetails">
			<fieldset>
				<legend class="text-center">

					<label for="email" id="title"><b>Form 3a<br>
							Mulago Hospital Department of Surgery (Urology Unit) <br>Genetic
							Susceptibility to Prostate Cancer in African Men study

							QUESTIONNAIRE
					</b></label>
				</legend>
				<!--  <label class= "control-label"  id="title" ><b>PERSONAL INFORMATION</b></label>-->
				<!-- Name input-->

				<!-- sexaul partners -->


				<div class="lastdiv"
					style="background-color: !important; height: 150px; width: 600px; margin-left: 700px;">
					<br>
					<div class="col-md-3">
						<form:input id="name" name="psaTest" type="text" path="psaTest"
							placeholder="PSA Test result " class="form-control" />
						<form:errors path="psaTest" cssStyle="color: #ff0000;" />


					</div>
					<div class="col-md-3">
						<form:input id="name" name="gleasonScore" type="text"
							path="gleasonScore" placeholder="Gleason Score "
							class="form-control" />
						<form:errors path="gleasonScore" cssStyle="color: #ff0000;" />


					</div>

					<div class="col-md-3">
						<form:input id="name" name="labNo" type="text" path="labNo"
							placeholder="Lab No " class="form-control" />
						<form:errors path="labNo" cssStyle="color: #ff0000;" />


					</div>

					<div class="col-md-3">
						<form:input id="name" name="particpantIdNo" type="text"
							path="particpantIdNo" placeholder="Particpant Id  "
							class="form-control" />
						<form:errors path="particpantIdNo" cssStyle="color: #ff0000;" />


					</div>
					<br> <br>
					<div class="col-md-3">
						<form:input id="name" name="patientNo" type="text" path="patientNo"
							placeholder="Patient No  " class="form-control" />
						<form:errors path="patientNo" cssStyle="color: #ff0000;" />


					</div>
					<div class="col-md-3">
						<form:input id="name" name="specimenNo" type="text" path="specimenNo"
							placeholder="Specimen No" class="form-control" />
						<form:errors path="specimenNo" cssStyle="color: #ff0000;" />


					</div>
					<div class="col-md-3">
						<form:input id="name"  type="text" path="dov"
							placeholder="Date of visit" class="form-control" />
						<form:errors path="dov" cssStyle="color: #ff0000;" />


					</div>

					<div class="col-md-3">
						<form:input id="name" name="interviewNo" type="text"
							path="interviewNo" placeholder="InterviewersNo"
							class="form-control" />
						<form:errors path="interviewNo" cssStyle="color: #ff0000;" />


					</div>
					<br> <br>
					<div class="col-md-3">
						<form:input id="name" name="de" type="text" path="de"
							placeholder="Date entered" class="form-control" />
						<form:errors path="de" cssStyle="color: #ff0000;" />


					</div>
					<div class="col-md-9">
						<form:input id="name" name="priDRName" type="text"
							path="priDRName" placeholder="PRI DR.'s name."
							class="form-control" />
						<form:errors path="priDRName" cssStyle="color: #ff0000;" />


					</div>
				</div>
				<br>

				<div class="form-group">


					<label class="col-md-3 control-label" for="name">1.Full names</label>
					<div class="col-md-5">
						<form:input id="name" name="fullNames" type="text"
							path="fullNames" placeholder="Your full Names"
							class="form-control" />
						<form:errors path="fullNames" cssStyle="color: #ff0000;" />
					</div>
				</div>



				<div class="form-group">


					<label class="col-md-3 control-label" for="name">2.Date of birth </label>
					<div class="col-md-5">




						<form:input path="dob" type="date" class="form-control"
							data-placeholder="Response Date" required="true" />
						<form:errors path="dob" cssStyle="color: #ff0000;" />









					</div>



				</div>



				<!--furthest level of educ-->

				<div class="form-group">

					<label class="col-md-3 control-label no3 " for="name" id=" ">
						3.Highest level of education you have completed.</label>
					<div class="col-md-5">


						<div class="radio">
							<label><form:radiobutton path="levelOfEduc"
									value=" Primary School 1 to 4" />Primary School 1 to 4</label>
							<form:errors path="levelOfEduc" cssStyle="color: #ff0000;" />

						</div>

						<div class="radio">
							<label><form:radiobutton path="levelOfEduc"
									value="Primary School 5 to 7" />Primary School 5 to 7</label>
						</div>

						<div class="radio">
							<label><form:radiobutton path="levelOfEduc"
									value="O level without a profession" />First cycle of
								Secondary School S1 to 4 (O level without a profession)</label>
						</div>
						<div class="radio">
							<label><form:radiobutton path="levelOfEduc"
									value="O level professional" />O level professional</label>
						</div>
						<div class="radio">
							<label><form:radiobutton path="levelOfEduc"
									value="Second cycle of Secondary School S5 to 6" />Second
								cycle of Secondary School S5 to 6</label>
						</div>
						<div class="radio">
							<label><form:radiobutton path="levelOfEduc"
									value="University/Professional School" />University/Professional
								School</label>
						</div>
						<div class="radio">
							<label><form:radiobutton path="levelOfEduc" value="Other" />Other</label>
						</div>

					</div>
				</div>




				<!--highest occupation-->

				<div class="form-group">


					<label class="col-md-3 control-label" for="name">4. Occupation  held for the majority of your life</label>
					<div class="col-md-5">

						<form:input id="name" name="" type="text" path="occupationHeld"
							placeholder="occupation that you have held for the majority of your life"
							class="form-control" />
						<form:errors path="occupationHeld" cssStyle="color: #ff0000;" />

					</div>


				</div>

				<!--highest occupation-->

				<div class="form-group">


					<label class="col-md-3 control-label" for="name">5.
						Your tribe </label>
					<div class="col-md-5">


						<form:input id="name" name="fullNames" type="text"
							path="yourTribe" placeholder="your tribe" class="form-control" />
						<form:errors path="yourTribe" cssStyle="color: #ff0000;" />

					</div>


				</div>

				<div class="form-group">


					<label class="col-md-3 control-label" for="name">6.
						 Fathers tribe </label>
					<div class="col-md-5">


						<form:input id="name" name="fullNames" type="text"
							path="fathersTribe" placeholder="fathers tribe"
							class="form-control" />
						<form:errors path="fathersTribe" cssStyle="color: #ff0000;" />

					</div>


				</div>
				<div class="form-group">


					<label class="col-md-3 control-label" for="name">7. Mothers tribe </label>
					<div class="col-md-5">


						<form:input id="name" name="fullNames" type="text"
							path="mothersTribe" placeholder="mothers tribe"
							class="form-control" />
						<form:errors path="mothersTribe" cssStyle="color: #ff0000;" />

					</div>


				</div>
					<div class="form-group">


					<label class="col-md-3 control-label" for="name">8.Age </label>
					<div class="col-md-5">


						<form:input id="name" name="fullNames" type="text"
							path="age" placeholder="Age"
							class="form-control" />
						<form:errors path="age" cssStyle="color: #ff0000;" />

					</div>


				</div>
				<div class="form-group">

					<label class="col-md-3 control-label no3 " for="name" id=" ">
						9.Sex</label>
					<div class="col-md-5">


						<div class="radio">
							<label><form:radiobutton path="sex"
									value=" Male" />Male</label>
							<form:errors path="sex" cssStyle="color: #ff0000;" />

						</div>

						<div class="radio">
							<label><form:radiobutton path="sex"
									value="female" />Female</label>
						</div>

					
						

					</div>
				</div>

				<!-- Form actions -->
				<div class="form-group">
					<div class="col-md-12 text-right">


						<button type="submit" class="btn btn-primary btn-lg">Next</button>
					</div>
				</div>
			</fieldset>
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