package com.sist.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.*;


public class EmpDAO extends SqlSessionDaoSupport{
	public List<EmpVO> empAllData() {
		//openSession
		//generics�� �̿��� return���� ���� �ڵ����� ����ȯ ���־���.
		return getSqlSession().selectList("empAllData");//getSqlSession�� open�� close�� �� ���ԵǾ� �ִ�.
		//close()
	}
}
