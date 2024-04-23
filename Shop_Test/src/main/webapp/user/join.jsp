<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Shop</title>
	<jsp:include page="/layout/meta.jsp" /> <jsp:include page="/layout/link.jsp" />
</head>



<body>   
	
	<jsp:include page="/layout/header.jsp" />
	<div class="px-4 py-5 mt-5 text-center">
		<h1 class="display-5 fw-bold text-body-emphasis">회원 가입</h1>
	</div>
	
	<!-- 회원 가입 영역 -->
	<div class="container shop p-5 mb-5" >
		<form action="join_pro.jsp" name="joinForm" method="post"  onsubmit="return validateForm();" >
		
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" id="id">아이디</label>
				<input type="text" class="form-control col-md-8" 
					   name="id" placeholder="아이디" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" >비밀번호</label>
				<input type="password" class="form-control col-md-8" 
					   name="pw" placeholder="비밀번호" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" >비밀번호 확인</label>
				<input type="password" class="form-control col-md-8" 
					   name="pw_confirm" placeholder="비밀번호 확인" required>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" id="name">이름</label>
				<input type="text" class="form-control col-md-8" 
					   name="name" placeholder="이름" required>
			</div>
			
			<div class="input-group mb-3 row">
				<div class="col-md-4 p-0">
					<label class="input-group-text" id="gender">성별</label>
				</div>
				<div class="col-md-8 d-flex align-items-center">
					<div class="radio-box d-flex">
						<div class="radio-item mx-3">
							<input type="radio" class="form-check-input" name="gender" value="여" id="gender-female"> 
							<label for="gender-female">여자</label>
						</div>
						
						<div class="radio-item mx-3">
							<input type="radio" class="form-check-input " name="gender" value="남" id="gender-male"> 
							<label for="gender-male">남자</label>
						</div>
						
					</div>
				</div>
			</div>
			
			
			<div class="input-group mb-3 row">
				<div class="col-md-4 p-0">
					<label class="input-group-text" id="Bir">생일</label>
				</div>
				<div class="col-md-8 p-0">
					<div class="row d-flex justify-content-between w-100 m-0">
						<div class="col-4 col-md-4 px-0">
							<input type="text" class="form-control" name="year" placeholder="출생년도 " size="6" />
						</div>
						
						<div class="col-4 col-md-4 pr-0">
							<select name="month" class="h-100 form-select" >
								<option value="01">1월</option>
								<option value="02">2월</option>
								<option value="03">3월</option>
								<option value="04">4월</option>
								<option value="05">5월</option>
								<option value="06">6월</option>
								<option value="07">7월</option>
								<option value="08">8월</option>
								<option value="09">9월</option>
								<option value="10">10월</option>
								<option value="11">11월</option>
								<option value="12">12월</option>
							</select>
						</div>
						
						<div class="col-4 col-md-4 px-0">
							<input type="text" class="form-control" name="day" placeholder="일자" size="4" />
						</div>
					</div>
				</div>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" id="eMail">이메일</label>
				
				<div class="row justify-content-between col-md-8 align-items-center p-0">
					<div class="col-sm-5 col-md-5 px-0">
						<input type="text" class="form-control" 
							   name="email1" placeholder="이메일">
					</div>
					<div class="d-none d-sm-block col-sm-auto col-auto px-0 text-center">
						@
					</div>
					<div class="col-sm-6 col-md-6 px-0">
						<select name="email2" class="form-select">
							<option value="naver.com">naver.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="kakao.com">kakao.com</option>
						</select>
					</div>
				</div>
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" id="pNo">전화번호</label>
				<input type="text" class="form-control col-md-8" 
					   name="phone" placeholder="전화번호">
			</div>
			
			<div class="input-group mb-3 row">
				<label class="input-group-text col-md-4" id="address">주소</label>
				<input type="text" class="form-control col-md-8" 
					   name="address" placeholder="주소">
			</div>
			
			
			<div class="d-grid gap-2 mt-5 mb-5 d-md-flex justify-content-md-between">
				<a href="javascript: history.back()" class="btn btn-lg btn-secondary">취소</a>
				<input type="submit" class="btn btn-lg btn-primary" value="가입" />
			</div>	
			
			
		</form>
	
	</div>
	
	
	<jsp:include page="/layout/footer.jsp" />
	<jsp:include page="/layout/script.jsp" />
</body>

<script>

    function validateForm() {
    	
        var pw = document.getElementById("pw").value;
        var pw_confirm = document.getElementById("pw_confirm").value;
        
        alert('sadfasd');
        console.log(pw);
        return;
        
        // 비밀번호와 비밀번호 확인이 일치하는지 확인
        if (pw !== pw_confirm) {
            alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
            return false;
        }
        
        
        // 비밀번호의 정규식 검사
        var passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
        if (!passwordRegex.test(pw)) {
            alert("비밀번호는 8자 이상의 영문과 숫자 조합이어야 합니다.");
            return false;
        }
        
        // 이름 유효성 검사 (숫자가 포함되어 있지 않은지)
        var name = document.getElementById("user_name").value;
        var nameRegex = /^[가-힣]+$/;
        if (!nameRegex.test(name) || !name) {
            alert("이름은 한글로만 입력해야 합니다.");
            return false;
        }

        // 주민등록번호 유효성 검사
        var age1 = document.getElementById("user_age1").value; // 주민등록번호 앞자리
        var age2 = document.getElementById("user_age2").value; // 주민등록번호 뒷자리
        
        // 주민등록번호 앞자리 정규표현식
        var age1Regex = /^\d{6}$/;
        if (!age1Regex.test(age1)) {
            alert("주민등록번호 앞자리는 6자리의 숫자로 입력해야 합니다.");
            return false;
        }
        
        // 주민등록번호 뒷자리 정규표현식 
        var age2Regex = /^\d{7}$/;
        if (!age2Regex.test(age2)) {
            alert("주민등록번호 뒷자리는 7자리의 숫자로 입력해야 합니다.");
            return false;
        }
        
        // 주민등록번호 전체
        var age = age1.toString() + '-' + age2.toString();
        
        // 전화번호 유효성 검사 (숫자만 포함되어 있는지)
        var phone = document.getElementById("user_pno").value;
        var phoneRegex = /^[0-9]+$/;
        if (!phoneRegex.test(phone)) {
            alert("전화번호는 숫자로만 입력해야 합니다.");
            return false;
        }
        
        // 주소 유효성 검사(아무 값도 들어오지 않으면 경고창)
        var address = document.getElementById("user_address").value;
        if (address.trim() === "") {
        	// trim() : 문자열의 양 끝에서 공백을 제거한 새로운 문자열을 반환하는 함수
            alert('주소를 입력해주세요.');
            return false;
        }
        
        // 아이디 중복 확인 여부 체크
        var idChecked = document.getElementById("idChecked").value;
        if (idChecked !== "true") {
            alert("아이디 중복 확인을 해주세요.");
            return false;
        }
        return true; 
    }
    
    </script>

</html>







