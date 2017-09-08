package sample.mybatis.service;

import sample.mybatis.domain.User;
import sample.mybatis.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * User的Service
 *
 * @author 小翼
 * @version 1.0.0
 */
@Service
public class UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	
	
	public User readUserByUsername(String username){
		return userMapper.selectUser(username);
	}
}
