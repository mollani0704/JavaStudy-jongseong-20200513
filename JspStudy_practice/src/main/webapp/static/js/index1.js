const signupBtn = document.querySelectorAll("nav ul li");
load();

signupBtn[0].onclick = () => {
	location.href = "/main/signup1";
}

signupBtn[1].onclick = () => {
	location.href = "/main/signin1";
}

function load() {
	$.ajax({
		type: "get",
		url: "/main/api/v1/principal",
		dataType: "json",
		success: (response) => {
			console.log(JSON.stringify(response));
			if(response != null) {
				loadUserInfo(response);
			}
		}, 
		
		error: () => {
			alert("요청 실패");
		}
	})
}

function loadUserInfo(principal) {
	const userInfo = document.querySelector(".user-info");
	userInfo.innerHTML = `
		<li>${principal.name}</li>
		<li>${principal.username}</li>
		<li>${principal.email}</li>
	`;
}
