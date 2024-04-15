package shop.service;

import shop.dto.PersistentLogin;
import shop.dto.User;

public interface UserRepositoryService{
	
	// 회원가입
	public int insert(User user);
	
	// 로그인
	public User login(String id, String pw);
	
	// 로그인을 위한 사용자 조회
	public User getUserById(String id);
	
	// 회원 수정
	public int update(User user);
	
	// 회원 삭제
	public int delete(String id);
	
	// 토큰 리프레쉬
	public String refreshToken(String userId);
	
	// 토큰 정보 조회
	public PersistentLogin selectToken(String userId);
	
	// 토큰 정보 조회 - 토큰으로
	public PersistentLogin selectTokenByToken(String token);
	
	// 자동 로그인 토큰 생성
	public String insertToken(String userId);
	
	// 자동 로그인 토큰 갱신
	public String updateToken(String userId);
	
	// 토큰 삭제 - 로그아웃 시, 자동 로그인 풀림
	public int deleteToken(String userId);
	
}
