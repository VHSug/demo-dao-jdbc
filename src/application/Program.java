package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void Prog(){

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== TESTE 1: ENCONTRAR POR ID ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("==== TESTE 2: ENCONTRAR POR DEPARTAMENTO ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("==== TESTE 3: ENCONTRAR TODOS/IMPRIMIR TODOS ====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();


        System.out.println("==== TESTE 4: INSERIR ====");
        Seller newSeller = new Seller(department, 20000.00, new Date(),"vitorHid@gmail.com", "Vitor", null);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! Novo Id = " + newSeller.getId());
        System.out.println();

        System.out.println("==== TESTE 5: UPDATE ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha wayne");
        seller.setEmail("marthaW@gmail.com");
        seller.setBaseSalary(5000.0);
        sellerDao.update(seller);
        System.out.println("Update feito com sucesso.");
        System.out.println();

        System.out.println("==== TESTE 6: DELETAR ====");
        System.out.println("DIGITE O ID QUE DESEJA DELETAR");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("ID "+ id+ " DELETADO COM SUCESSO.");

    }
}
