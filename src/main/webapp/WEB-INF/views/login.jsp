<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
<form method="get" action="loginOK">
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="text" name="pw"><br>
	이름 : <input type="text" name="name"><br>
	폰번호: <input type="text" name="phone"><br>
	주소: <input type="text" name="address"><br>
	성별:  <input type="radio" name="gender" value="남자" > 남자
<input type="radio" name="gender" value="여자"> 여자 <br><br>
	이메일: <input type="text" name="email"><br>
	<input type="submit" value="회원가입">
</form>
</body>
</html>