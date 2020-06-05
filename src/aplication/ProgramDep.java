package aplication;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepDao();
		Scanner sc = new Scanner(System.in);

		System.out.println("=== TEST 1 :: Department Insert ===");
		/*
		 * Department dep = new Department(9, "Farmácia");
		depDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		*/
		
		System.out.println();
		System.out.println("=== TEST 2 :: Department FindById ===");
		System.out.println(depDao.findById(3));
		
		System.out.println();
		System.out.println("=== TEST 3 :: Department Update ===");
		/*Department department = depDao.findById(3);
		department.setName("Festas");
		depDao.update(department);
		System.out.println("Update Completed!");
		*/
		
		System.out.println();
		System.out.println("=== TEST 4 :: Department FindAll ===");
		List<Department> lista = depDao.findAll();
		lista.forEach(System.out::println);
		
		System.out.println();
		System.out.println("=== TEST 5 :: Department DeleteById ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete Completed!");
		
		sc.close();
		
	}

}
