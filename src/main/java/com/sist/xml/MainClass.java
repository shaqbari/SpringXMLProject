package com.sist.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

import java.util.*;

//@Component("mc")
/*
* <bean id="dao" class="com.sist.dao.EmpDAO"
		p:sqlSessionTemplate-ref="sst"
	/>
* */
public class MainClass {
	/*@Autowired
	 * p:dao-ref="dao"
	 * */
	private EmpDAO dao;
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		
		MainClass mc=(MainClass) app.getBean("mc");
		List<EmpVO> list=mc.dao.empAllData();
		
		for (EmpVO vo : list) {
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()+" "
					+vo.getSal());
			
		}
		
	}

}
