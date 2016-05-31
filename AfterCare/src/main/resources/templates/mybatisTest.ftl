<!DOCTYPE html>
<html>
	<head>
		<title>mybatis Test</title>
	</head>
	<body>
		<div>
			spring-mybatis-mysql
			<br>
			
			<#list result as user>
			Id : ${user.ID}  Name : ${user.NAME}<br>
			</#list>
			
		</div>
	</body>
</html>