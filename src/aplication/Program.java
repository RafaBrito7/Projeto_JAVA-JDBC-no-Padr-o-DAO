package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.println("=== TEST 1 :: Seller Find By Id ===");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("=== TEST 2 :: Seller Find By Department ===");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=== TEST 3 :: Seller Find All ===");
		list = sellerDao.findAll();
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("=== TEST 4 :: Seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println();
		System.out.println("=== TEST 5 :: Seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
	}

}
