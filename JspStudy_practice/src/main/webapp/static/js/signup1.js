const submitBtn = document.querySelector('.submit-button');
const inputItems = document.querySelectorAll("table input");
const usernameInput = document.querySelector(".username-input");
const usernameCheckMsg = document.querySelector('.username-check-msg');

let signupFlag = [false, false, false, false, false];

submitBtn.onclick = () => {
	console.log("버튼확인");
	for(let i = 0; i < inputItems.length; i++) {
		if(isEmpty(inputItems[i].value)) {
			alert((i == 0 ? "이름을"
				: i == 1 ? "이메일을"
				: i == 2 ? "사용자 이름을"
				: "비밀번호를") 
				+ "입력해 주세요.")
	
			return
		}
		signupFlag[i] = true;
	}
	
	if(signupFlag[4] == false) {
		alert("사용자이름 중복확인이 필요합니다.");
		return
	}
	
	if(!signupFlag.includes(false)) {	
		submit();
	}
}


function isEmpty(str) {
	return str == "" || str == null || typeof str == undefined;
}

function submit() {
	$.ajax({
		type:"post",
		url:"/main/signup1",
		data: {
			name: inputItems[0].value,
			email: inputItems[1].value,
			username: inputItems[2].value,
			password: inputItems[3].value
		}, 
		dataType: "text",
		success: (response) => {
			if(response == "true") {
				alert("축하합니다!\n회원가입에 성공하였습니다.");
				location.replace("/main/index");
			} else {
				alert("회원가입에 실패하였습니다.\n다시 시도해 주세요.");
				document.querySelector("form").reset();
			}
		},
		error: errorMessage
	})
}

usernameInput.onblur = () => {
	console.log("기능 확인")
	
	let username = usernameInput.value;
	
	$.ajax({
		type: "get",
		url: `/main/check/username?username=${username}`,
		dataType: "text",
		success: (response) => {
			if(response == "true") {
				signupFlag[4] = false;
				usernameCheckMsg.innerHTML = `<td colspan="2">${username}은(는) 이미 사용하는 사용자이름 입니다.</td>`;
			} else {
				signupFlag[4] = true;
				usernameCheckMsg.innerHTML = `<td colspan="2">${username}은(는) 가입 할 수 있는 사용자이름 입니다.</td>`;
			}
		},
		error: errorMessage
	})
	
	
}

function errorMessage(request, status, error) {
	alert("요청 실패");
	console.log(request.status);
	console.log(request.responseText);
	console.log(error);
}

