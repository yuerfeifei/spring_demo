package test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import test.dao.LoginDao;
import test.entity.User;
import test.service.LoginService;
@Service(value="testService")
public class LoginServiceImpl implements LoginService{
	private LoginDao loginDao;
	public boolean checkLogin(User user) {
		boolean result = loginDao.doLogin(user);
		return result;
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}
	@Resource(name="testDao")
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}
