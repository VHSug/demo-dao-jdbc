package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void Prog(){

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TESTE 1: SELLER findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("==== TESTE 2: SELLER findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("==== TESTE 3: SELLER findAll ====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();


        System.out.println("==== TESTE 4: SELLER INSERT ====");
        Seller newSeller = new Seller(department, 4000.00, new Date(),"greg@gmail.com", "Greg", null);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! Novo Id = " + newSeller.getId());
    }
}
