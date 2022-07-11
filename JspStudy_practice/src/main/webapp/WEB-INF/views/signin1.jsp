<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	<div id="container">
		<h1>로그인</h1>
		<form action="/main/signin1" method="post">
			<table>
				<tr>
					<th>사용자이름</th>
					<td><input type="text" class="username-input" name="username"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<button type="button" class="submit-button">로그인</button>
			<button type="reset" class="signup-button">회원가입</button>
		</form>
	</div>
	<script type="text/javascript" src="/main/static/js/signin1.js"></script>
</body>
</html>