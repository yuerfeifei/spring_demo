package test.dao.impl;


import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import test.dao.LoginDao;
import test.entity.User;
import test.util.GetSqlSessionFactory;

@Repository(value="testDao")
public class LoginDaoImpl extends GetSqlSessionFactory implements LoginDao{

public boolean doLogin(User user) {
		SqlSession session = getSqlSessionFactory().openSession();
		List<String> result = session.selectList("login",user);
		if(result.isEmpty()) {
		return false;
		}
		else
			return true;
		
	}


}
