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
      <link rel="stylesheet" href="css/login.css">
      <title>Login</title>
   </head>
   <body>
      <div class="container-fluid">
         <div class="row">
            <div class="card col-xs-8 col-sm-8 col-md-8 col-lg-4" style="width: 30%;height: 100%;">
               <div class="card-body">
                  <h3 class="card-title col-12 p-0 m-0">SPACE PORTAL</h3>
                  <br>
                  <h6 class="card-title pb-2">Login </h6>
                  <form action="${pageContext.request.contextPath}/login" method="post">
                     <div class="form-group">
                        <input  name="usr" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Username">
                     </div>
                     <div class="form-group">
                        <input name="pwd" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                     </div>
                     <div class="form-group">
                        <span>
                        <button name="login_btn" type="submit" id="login_btn" class="btn btn-primary">LOGIN</button>
                        <button name="forgot_password_btn" type="button" id="forgot_password_btn" class="btn btn-link">Don't remember
                        <br>your password?</button>
                        </span>
                     </div>
                     <div class="form-group col-xs-12">
                        <button name="register_btn" type="submit" id="sign_up_btn" class="btn btn-primary">NEW AROUND HERE?</button>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>