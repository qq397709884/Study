<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="js/zTree_v3-master/css/demo.css" type="text/css">
<link rel="stylesheet" href="js/zTree_v3-master/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="js/zTree_v3-master/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="js/zTree_v3-master/js/jquery.ztree.core.js"></script>
<script type="text/javascript">
	//setting：配置信息说明，普通使用，无必须设置的参数
	var setting = {};
	//zNodes：节点数据说明，标准的JSON数据需要嵌套表示节点的父子包含关系
	var zNodes = [
		{ 
			name: "中国", 
			open: true,
			children: [
				{ 
					name: "江西省",
					children: [
						{ 
							name: "南昌市" 
						},
						{ 
							name: "九江市" 
						}
					]
				},
				{ 
					name: "广东省",
					children: [
						{ 
							name: "广州市" 
						}
					]
				},
				{ 
					name:"上海市"
				}
			]
		},
		{ 
			name: "其他", 
			isParent: true
		}
	
	];
	$(document).ready(function(){
		$.fn.zTree.init($("#treeDemo"), setting, zNodes);
	});
</script>
</head>
<body>
	<ul id="treeDemo" class="ztree"></ul>
</body>
</html>