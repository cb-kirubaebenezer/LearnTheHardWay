<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
      <script src="js/app-ajax.js" type="text/javascript"></script> 
      <link rel="stylesheet" href="css/home.css">
      <title>Home</title>
   </head>
   <body>
      <%@ page import="welcome.Welcome" %>
      <%@ page import="model.User" %>
      <%
         String userid = (String)request.getSession().getAttribute("userid");
         System.out.println(userid);
         if(userid==null){
        	 response.sendRedirect("login.jsp");
        	 return;
         }
         Welcome welcome = new Welcome();
         User user = welcome.getUser(userid);
         String name = user.getUsername();
         String email =user.getEmail();
         %>
      <div class="container-fluid">
         <div class="row">
            <div class="card col-xs-8 col-sm-8 col-md-6 col-lg-5" style="width: 60%;height: 100%;">
               <div class="card-body col-lg-12">
                  <h4 class="card-title col-12 p-0 m-0">WELCOME TO SPACE PORTAL</h4>
                  <br>
                  <form action="${pageContext.request.contextPath}/logout" method="post">
                     <div class="form-group">
                        <div class="row">
                           <span class="col-xs-3 col-sm-3 col-md-3 col-lg-3 pb-0">
                              <p>NAME</p>
                           </span>
                           <span class="col-xs-3 col-sm-4 col-md-4 col-lg-6 pb-0">
                           <%=name%>
                           </span>
                        </div>
                     </div>
                     <div class="form-group">
                        <div class="row">
                           <span class="col-xs-3 col-sm-3 col-md-3 col-lg-3 pb-0">
                              <p>EMAIL</p>
                           </span>
                           <span class="col-xs-3 col-sm-4 col-md-4 col-lg-6 pb-0">
                           <%=email%>
                           </span>
                        </div>
                     </div>
                     <div class="form-group">
                        <div class="row">
                           <span class="col-lg-3">
                              <p>ADDRESS</p>
                           </span>
                           <span class="col-xs-3 col-sm-3 col-md-3 col-lg-6 pb-0">
                              <p>A/140 P, AASDFG ROAD</p>
                           </span>
                        </div>
                        <div class="row">
                           <span class="col-lg-3">
                              <p></p>
                           </span>
                           <span class="col-xs-3 col-sm-3 col-md-3 col-lg-6 pb-0">
                              <p>--NA--</p>
                           </span>
                        </div>
                        <div class="row">
                           <span class="col-lg-3">
                              <p></p>
                           </span>
                           <span class="col-xs-3 col-sm-3 col-md-3 col-lg-6 pb-0">
                              <p>CHENNAI</p>
                           </span>
                        </div>
                        <div class="row">
                           <span class="col-lg-3">
                              <p></p>
                           </span>
                           <span class="col-xs-1 col-sm-2 col-md-3 col-lg-6 pb-0">
                              <p>TAMIL NADU</p>
                           </span>
                        </div>
                        <div class="row">
                           <span class="col-lg-3">
                              <p></p>
                           </span>
                           <span class="col-xs-1 col-sm-2 col-md-3 col-lg-6 pb-0">
                              <p>600100</p>
                           </span>
                        </div>
                        <div class="row">
                           <span class="col-lg-3">
                              <p></p>
                           </span>
                           <span class="col-xs-1 col-sm-2 col-md-3 col-lg-6 pb-0">
                              <p>INDIA</p>
                           </span>
                        </div>
                     </div>
                     <div class="form-group">
                        <span>
                        <button name="edit_btn" type="submit" id="submit_btn" class="btn btn-primary">EDIT</button>
                        <button name="logout_btn" type="submit" id="logout_btn" class="btn btn-primary">LOGOUT</button>
                        </span>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>