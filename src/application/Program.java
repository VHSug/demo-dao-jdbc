package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void Prog(){

        Department obj = new Department(1, "Boks");
        Seller seller = new Seller(obj, 3000.00, new Date(),"bob@gmail.com", "Bob", 21);
        System.out.println(seller);
    }
}
