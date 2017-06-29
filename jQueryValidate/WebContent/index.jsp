<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:red;
	}
</style>
<script type="text/javascript" src="js/jquery-validation-1.14.0/lib/jquery.js"></script>
<script type="text/javascript" src="js/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#form").validate({
			rules: {
				username: {
			    	required: true,
			        minlength: 2,
			        remote: {
			            url: "/jQueryValidate/BServlet",//后台处理程序
			            type: "post",//数据发送方式
			            dataType: "json",//接受数据格式   
			            data: {//要传递的数据
			                username: function() {
			                    return $("#username").val();
			                }
			            }
			        }
		      	},
		      	password: {
			        required: true,
			        minlength: 5
			    },
			    confirm_password: {
			        required: true,
			        minlength: 5,
			        equalTo: "#password"
			    }
			},
		    messages: {
		    	username: {
		            required: "请输入用户名",
		            minlength: "用户名必需由两个字母组成",
		            remote: "用户名已经被注册"
		        },
		        password: {
		            required: "请输入密码",
		            minlength: "密码长度不能小于 5 个字母"
		        },
		        confirm_password: {
		            required: "请输入密码",
		            minlength: "密码长度不能小于 5 个字母",
		            equalTo: "两次密码输入不一致"
		        }
		    },
		    errorPlacement: function(error, element) {  
		        error.appendTo(element.parent());
		    },
		    debug: false,
		    submitHandler: function(form) {
	            form.submit();
	        }
		});
	});
</script>
</head>
<body>
	<form id="form" action="/jQueryValidate/AServlet" method="post">
		<p>
	      	<label for="username">用户名</label>
			<input type="text" id="username" name="username" />
		</p>
		<p>
	      	<label for="password">密码</label>
			<input type="password" id="password" name="password" />
		</p>
		<p>
	      	<label for="confirm_password">确认密码</label>
			<input type="password" id="confirm_password" name="confirm_password" />
		</p>
		<p>
	      	<input type="submit" value="提交" />
		</p>
	</form>
</body>
</html>