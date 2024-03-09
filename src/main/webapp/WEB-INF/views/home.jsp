<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
<meta charset="UTF-8">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<title>customer app</title>
</head>
<body>
<section class="vh-100" style="background-color: #808080;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">


      <div class="col-12 col-md-8 col-lg-6 col-xl-5">

        <div class="card shadow-2-strong" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center" style="height:32vh">

            <div class="form-outline mb-4">
             <h1 style="font-size:36px" >Application</h1>
          <a href="maker" style="text-decoration:none"> <button class="btn btn-primary btn-lg btn-block" type="submit">Maker</button></a>
           <a href="checker" style="text-decoration:none"> <button class="btn btn-primary btn-lg btn-block" type="submit">Checker</button></a>
            </div>
            <!--
           <div class="form-outline mb-4">
                   <a href="show" style="text-decoration:none"> <button class="btn btn-info btn-lg btn-block" type="submit">All Books </button></a>
                     </div>
          </div>
          -->
        </div>
      </div>
    </div>
  </div>
</section>

</body>
</html>