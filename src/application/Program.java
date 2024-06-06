package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void Prog(){

        Department obj = new Department(1, "Boks");
        Seller seller = new Seller(obj, 3000.00, new Date(),"bob@gmail.com", "Bob", 21);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
