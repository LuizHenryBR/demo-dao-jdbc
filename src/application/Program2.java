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

		System.out.println("\n=== TEST4: Department delete ===");
		int idToDelete = 9;
		depDao.deleteById(idToDelete);
		System.out.println("CAUTION! The department with id=" + idToDelete + " was deleted");

		System.out.println("\n=== TEST5: Department update ===");
		Department depUp = depDao.findById(12);
		depUp.setName("Cleaning");
		depDao.update(depUp);
		System.out.println("UPDATE! The department with id=" + depUp.getId() + " was updated");
	}
}
