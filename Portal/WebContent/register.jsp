<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
      <link rel="stylesheet" href="css/registration.css">
      <title>Registration</title>
   </head>
   <body>
      <%
         String userid = (String)request.getSession().getAttribute("userid");
   		 if(userid != null){
   			 response.sendRedirect("welcome.jsp");
        	 return;
   		 }
   %>
      <div class="container-fluid">
         <div class="row">
            <div class="card col-xs-8 col-sm-8 col-md-6 col-lg-5" style="width: 60%;height: 100%;">
               <div class="card-body col-lg-12">
                  <h4 class="card-title col-12 p-0 m-0">Register to Space Portal</h4>
                  <br>
                  <form action="${pageContext.request.contextPath}/register" method="post">
                     <div class="form-group">
                        <div class="row">
                           <span class="col-lg-6 pb-1">
                           <input name="fname" type="input" id="sign_up_input" class="form-control" placeholder="First Name">
                           </span>
                           <span class="col-lg-6 pb-1">
                           <input name="lname" type="input" id="sign_up_input"  class="form-control" placeholder="Last Name">
                           </span>
                        </div>
                     </div>
                     <div class="form-group">
                        <div class="row">
                           <span class="col-lg-6">
                              <div class="form-group">
                                 <input name="email" type="email"  id="sign_up_input"  class="form-control"  placeholder="Email">
                              </div>
                           </span>
                           <span class="col-lg-6">
                              <div class="form-group">
                                 <input name="cemail" type="email"  id="sign_up_input"  class="form-control" placeholder="Confirm Email">
                              </div>
                           </span>
                        </div>
                     </div>
                     <div class="form-group">
                        <div class="row">
                           <span class="col-lg-6">
                              <div class="form-group">
                                 <input name="pwd" type="password"  id="sign_up_input"  class="form-control" placeholder="Password">
                              </div>
                           </span>
                           <span class="col-lg-6">
                              <div class="form-group">
                                 <input name="cpwd" type="password"  id="sign_up_input"  class="form-control" placeholder="Confirm Password">
                              </div>
                           </span>
                        </div>
                     </div>
                     <div class="row">
                        <button name="register_btn" type="submit" id="submit_btn" class="btn btn-primary">CREATE AN ACCOUNT</button>
                     </div>
                     <div class="row">
                        <button name="login_btn" type="submit" id="discard_btn" class="btn btn-link">Have an account already?</button>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>