<!DOCTYPE html>
<html>
	<head>
		<title>FreeMarker Test</title>
	</head>
	<body>
		<div>
			<#if name?length == 4>
			HELLO ${name}! Your name's length is 4
			</#if>
			<#if name?length != 4> 
			HELL YEAH ${name}! Your name's length is not 4
			</#if>
		</div>
		<form action="/logout" method="post">
			<input type="submit" value="로그아웃"/>
		</form>
	</body>
</html>