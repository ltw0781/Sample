package shop.service;

import shop.dto.PersistentLogin;
import shop.dto.User;

public class UserRepositoryServiceImpl implements UserRepositoryService{

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User login(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String refreshToken(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersistentLogin selectToken(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersistentLogin selectTokenByToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertToken(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateToken(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteToken(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
}
