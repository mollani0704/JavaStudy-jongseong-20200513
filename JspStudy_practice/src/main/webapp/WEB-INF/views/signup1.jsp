<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	<div id="container">
		<h1>회원가입</h1>
		<!-- action: 요청 메세지를 입력하는 곳 -->
		<form action="/main/signup1" method="post">
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input class="username-input" type="text" name="username" ></td>
				</tr>
				<tr class="username-check-msg">
				
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<button class="submit-button" type="button">SignUp</button>
			<button class="reset" type="reset">Reset</button>
		</form>
	</div>
	<script type="text/javascript" src="/main/static/js/signup1.js"></script>
</body>
</html>