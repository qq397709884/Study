<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#get1").click(function(){
			$.get("/jQueryAjax/AServlet?id=10000", function(data, status){
		    	alert("数据: " + data + "\n状态: " + status);
		  	});
		});
		$("#post1").click(function(){
			$.post("/jQueryAjax/AServlet", {
		        name: "Tom",
		        password: "123"
		    }, function(data, status){
		        alert("数据: " + data + "\n状态: " + status);
		    });
		});
		$("#ajax1").click(function(){
		  	$("#div1").load("/jQueryAjax/AServlet", {
		  		name: "Jerry",
		        password: "456"
		  	}, function(responseTxt, statusTxt, xhr){
			    if(statusTxt == "success") {
			    	alert("外部内容加载成功!");
			    }
			    if(statusTxt == "error") {
			    	alert("状态: " + xhr.status + "\n含义: " + xhr.statusText);
			    }
		  	});
		});
	});
</script>
</head>
<body>
	<input type="button" id="get1" value="get" />
	<input type="button" id="post1" value="post" />
	<input type="button" id="ajax1" value="ajax" />
	<div id="div1"></div>
</body>
</html>