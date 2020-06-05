package model.dao;

import db.Db;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(Db.getConnection());
	}
	
	public static DepartmentDao createDepDao() {
		return new DepartmentDaoJDBC(Db.getConnection());
	}

}
