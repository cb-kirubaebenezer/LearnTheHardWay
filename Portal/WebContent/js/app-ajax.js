$(document).ready(function() {
        $('#userName').blur(function(event) {
                var name = $('#userName').val();
                $.get('welcome', {
                        userName : name
                }, function(responseText) {
                        $('#ajaxGetUserServletResponse').text("Hello World");
                });
        });
});