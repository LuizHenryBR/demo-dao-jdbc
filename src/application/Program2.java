package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST1: Department insert ===");
		Department newDep = new Department(null, "Marketing");
		depDao.insert(newDep);
		System.out.println("NEW:" + newDep.getName() + " department inserted! ID: " + newDep.getId());
	}

}
