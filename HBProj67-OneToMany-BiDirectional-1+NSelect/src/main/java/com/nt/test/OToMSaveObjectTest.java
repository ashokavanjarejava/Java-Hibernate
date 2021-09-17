//OToMSaveObjectTest.java
package com.nt.test;

import com.nt.dao.BankDAOImpl;
import com.nt.dao.IBankDAO;
import com.nt.utility.HibernateUtil;

public class OToMSaveObjectTest {

	public static void main(String[] args) {
		//create DAO class obj
		IBankDAO dao=new BankDAOImpl();
		//dao.loadDataUsingParentAndJoins();
		//dao.loadDataUsingParent();
		//dao.loadDataUsingParentAndUsingHBQBC();
		//dao.loadDataUsingParentAndUsingJPAQBC();
		dao.loadDataUsingParentAndHQLFetchJoin();
		HibernateUtil.closeSessionFactory();
	}//main
}//class
