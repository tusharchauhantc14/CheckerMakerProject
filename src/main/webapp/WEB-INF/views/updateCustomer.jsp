<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<title>Update Book</title>
	<style>
.error {
color: #EF1313;
font-style: italic;
}
.center {
  margin: auto;
  width: 60%;
  border: 3px solid black;
  padding: 10px;
  margin-top:20px;
  display:flex;
flex-direction: column;
    align-items: center;
  height:500px;
  box-shadow: 10px 5px 5px black;
}
.submit-button{
display: flex;
    justify-content: center;
    margin-top: 40px;
}
.intfield{
width: 270px;
border-radius: 11px;
height: 38px;
margin-top:5px;
}
.labfield{
font-size: 20px;
  font-weight: bold;

}
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}
.input-field-de{
display:flex;
flex-direction: column;
}
</style>

</head>
<body>
 <button type="button" style="margin-top:10px;margin-left:10px" class="btn btn-info"><a href="maker" style="text-decoration:none; color:white;">Back</a></button>

<div  class="center">
<h1>Customer Registration Form</h1>
<form:form style="margin-top:25px;" action="updateCustomer?id=${customerFormBean.customerId}&T=${tableName}" method="post" modelAttribute="customerFormBean">
<form:hidden path="customerId"/>
<form:hidden path="recordStatus"/>
<form:hidden path="activeInactive"/>
<form:hidden path="createdBy"/>
<form:hidden path="createdDate"/>
<form:hidden path="modifiedBy"/>
<form:hidden path="modifiedDate"/>
<form:hidden path="authorizedBy"/>
<form:hidden path="authorizedDate"/>
<div class="form-div" style="display:flex;flex-direction:row; padding-left: 40px;">
<div class="left" style="width:50%;margin-right:10px">
<div  class="input-field-de" >
<label class="labfield"for=inputEmail4">Customer Code :</label>
 <form:input class="intfield" path="customerCode" readonly="true"/> <form:errors path="customerCode" class="error"/>
</div>
<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Customer Name :</label>
 <form:input class="intfield" path="customerName" readonly="true"/> <form:errors path="customerName" class="error"/>
</div>
<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Customer Address 1 :</label>
 <form:input class="intfield" path="customerAddress1"/> <form:errors path="customerAddress1" class="error"/>
</div>
<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Customer Address 2:</label>
 <form:input class="intfield" path="customerAddress2"/> <form:errors path="customerAddress2" class="error"/>
</div>
</div>
<div class="right">

<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Pin Code :</label>
 <form:input class="intfield" path="customerPinCode" type="number"/> <form:errors path="customerPinCode" class="error"/>
</div>
<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Email Address  :</label>
 <form:input class="intfield" path="emailAddress" /> <form:errors path="emailAddress" class="error"/>
</div>
<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Contact Number :</label>
 <form:input class="intfield" path="contactNumber" type="number"/> <form:errors path="contactNumber" class="error"/>
</div>
<div  class="input-field-de">
<label class="labfield" for=inputEmail4">Primary Contact Person :</label>
 <form:input class="intfield" path="primaryContactPerson"/> <form:errors path="primaryContactPerson" class="error"/>
</div>


</div>
</div>
<div class="submit-button" >
 <input class="btn btn-primary" type="submit">
  <input style="margin-left:10px" class="btn btn-danger" type="Reset">

 </div>

</form:form>
</div>

</body>
</html>

