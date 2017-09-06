package test.util;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;

public class GetSqlSessionFactory {
	private  SqlSessionFactory sqlSessionFactory;
	public  SqlSessionFactory getSqlSessionFactory() {
		
		return sqlSessionFactory;
	}
	@Resource(name="sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	
}
