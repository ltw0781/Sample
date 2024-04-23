<!-- 로그인 처리 -->
<%@page import="java.util.UUID"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="shop.dto.User"%>
<%@page import="shop.dao.UserRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");

UserRepository userDAO = new UserRepository();
User loginUser = userDAO.login(id, pw);

// 로그인 실패
	if( loginUser == null ) {
		response.sendRedirect("login.jsp?msg=0");
		return;
	}
// 로그인 성공
// - 세션에 아이디 등록

// 아이디 저장
	String rememberId = request.getParameter("remember-Id");
	Cookie cookieRememberId = new Cookie("remember-Id", "");
	Cookie cookieUserId = new Cookie("userId", "");
// 자동 로그인
String rememberMe = request.getParameter("rememberMe");
	Cookie cookieRemeberMe = new Cookie("rememberMe", "");
	Cookie cookieToken = new Cookie("token", "");
	
	// 자동 로그인 체크 여부, 토큰 쿠키에 대한 경로 설정
	cookieRemeberMe.setPath("/");
	cookieToken.setPath("/");
	// 쿠키 유효기간 설정
	cookieRemeberMe.setMaxAge(7*60*60*24);		// 초단위 --> 7일
	cookieToken.setMaxAge(7*60*60*24);
	
	// 체크 여부에 따라 쿠키 생성 또는 삭제
	if( rememberMe != null && rememberMe.equals("on") ) {
		// 자동 로그인 체크
		// - 토큰 발행
		String tokenValue = userDAO.refreshToken(id);
		// - 쿠키 생성
		cookieRemeberMe.setValue( URLEncoder.encode( rememberMe, "UTF-8") );
		cookieToken.setValue( URLEncoder.encode( tokenValue, "UTF-8") );
	} else {
		// 자동 로그인 미체크
		// 쿠키 삭제
		cookieRemeberMe.setMaxAge(0);
		cookieToken.setMaxAge(0);
	}
	
	// 응답에 쿠키 등록
	response.addCookie(cookieRemeberMe);
	response.addCookie(cookieToken);
	// 자동 로그인(끝)
// 쿠키 전달

// 로그인 성공 페이지로 이동
if (loginUser != null) {
	// 로그인 성공
	// 세션에 아이디 등록 후, 메인 페이지로 이동
	session.setAttribute("loginId", loginUser.getId());
	response.sendRedirect("complete.jsp");
}
%>



