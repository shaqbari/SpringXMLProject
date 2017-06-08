package com.sist.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.*;


public class EmpDAO extends SqlSessionDaoSupport{
	public List<EmpVO> empAllData() {
		//openSession
		//generics를 이용해 return형에 따라서 자동으로 형변환 해주었다.
		return getSqlSession().selectList("empAllData");//getSqlSession에 open과 close가 다 포함되어 있다.
		//close()
	}
}
