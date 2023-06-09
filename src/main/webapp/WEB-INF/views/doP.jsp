<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script >
	let msg = '${msg}';	// '${msg}'가 ok(문자)가 된다. 그래서 ''을 사용한다. 숫자였을 시 '' 사용 안함.
	alert(msg);
</script>
</head>
<body>
<h3>doP.jsp</h3>
</body>
</html>