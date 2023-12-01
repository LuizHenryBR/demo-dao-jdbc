package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST1: Department insert ===");
		Department newDep = new Department(null, "Marketing");
		depDao.insert(newDep);
		System.out.println("NEW:" + newDep.getName() + " department inserted! ID: " + newDep.getId());

		System.out.println("\n=== TEST2: Department findByID ===");
		Department fDep = depDao.findById(6);
		System.out.println(fDep);

		System.out.println("\n=== TEST3: Department findAll ===");
		List<Department> listAll = depDao.findAll(); 
		System.out.println();
		
		for (Department d : listAll){
			System.out.println(d);
		}

		System.out.println("\n=== TEST4: Department findByID ===");
		int idToDelete = 9;
		depDao.deleteById(7);
		depDao.deleteById(8);
		depDao.deleteById(10);
		depDao.deleteById(11);
		System.out.println("CAUTION! The departmente with id=" + idToDelete + " was deleted");
		
	}
}
