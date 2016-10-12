<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>个人简历</title>
<link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.css.map" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-theme.min.css.map" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css.map" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css.map" rel="stylesheet" type="text/css" />
<link href="img/favicon.ico" rel="shortcut icon" type="image/x-icon" />
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/npm.js"></script>
</head>
<body>

<div class="container" style="width: 100%; height: 200px; background-color: #72C0CD;">
	<div class="row clearfix">
		<div class="col-md-12 column" style="text-align: center;">
			<img src="img/head.jpg" class="img-circle" style="width: 100px; height: 100px; margin-top: 20px;" />	
			<div class="caption" style="font-family: 黑体; margin-top: 5px;">
				${basicInfo.name }（${basicInfo.gender }，${basicInfo.age }）<br/>
				手机：${basicInfo.tel }<br/>
			 	邮箱：${basicInfo.email }
			</div>
		</div>
	</div>
</div>
<div class="container" style="margin-top: 20px;">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								教育经验
							</h3>
							<p>
								<c:forEach items="${educations }" var="edu">
									${edu.starttime }至${edu.endtime }&nbsp;&nbsp;
									${edu.university }&nbsp;&nbsp;
									${edu.major }&nbsp;&nbsp;
									${edu.degree }<br/>
								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								校内奖励
							</h3>
							<p>
								<c:forEach items="${rewards }" var="reward">
									${reward.time }&nbsp;&nbsp;
									${reward.name }&nbsp;&nbsp;
									${reward.university }<br/>
								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								语言能力
							</h3>
							<p>
								<c:forEach items="${languages }" var="language">
									${language.name }&nbsp;&nbsp;
									听说：${language.listen }&nbsp;&nbsp;
									读写：${language.write }&nbsp;&nbsp;
									${language.examination }：${language.score }<br/>
								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								证书
							</h3>
							<p>
								<c:forEach items="${certificates }" var="certificate">
									${certificate.name }<br/>
								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								IT技能
							</h3>
							<p>
								精通的技能&nbsp;&nbsp;
								${skill.proficient }<br/>
								熟悉的技能&nbsp;&nbsp;
								${skill.conversant }<br/>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								关于我
							</h3>
							<p>
								${basicInfo.introduction }
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								项目经验
							</h3>
							<p>
								<c:forEach items="${projects }" var="pro" varStatus="vs">
									项目名称：${pro.name }<br/>
									项目时间：${pro.starttime }至${pro.endtime }<br/>
									角色：${pro.role }<br/>
									简介：${pro.introduction }<br/>
									责任：${pro.task }<br/>
									<c:if test="${not vs.last }">
										<br/>
									</c:if>
								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6 column">
			<div class="row">
				<div class="col-md-12">
					<div class="thumbnail">
						<div class="caption">
							<h3>
								实习经历
							</h3>
							<p>
								<c:forEach items="${internships }" var="internship" varStatus="vs">
									公司：${internship.company }<br/>
									时间：${internship.starttime }至${internship.endtime }<br/>
									职位：${internship.position }<br/>
									所属行业：${internship.industry }<br/>
									所在部门：${internship.department }<br/>
									责任：${internship.task }<br/>
									<c:if test="${not vs.last }">
										<br/>
									</c:if>
								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>