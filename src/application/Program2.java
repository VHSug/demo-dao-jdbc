package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void P2(){
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== ENCONTRAR DEPARTAMENTO POR ID ====");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println();

        System.out.println("==== ENCONTRAR TODOS ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("==== INSERIR DADOS NO DEPARTAMENTO ====");
        Department department1 = new Department(null, "Cellphone");
        departmentDao.insert(department1);
        System.out.println("Inserido.\nNovo id: " + department1.getId());

        System.out.println();

        System.out.println("==== ATUALIZAR DADOS ====");
        Department department2 = departmentDao.findById(7);
        department2.setName("Cinema");
        departmentDao.update(department2);
        System.out.println("ATUALIZAÇÃO FEITA COM SUCESSO");

        System.out.println();

        System.out.println("==== DELETAR DADOS ====");
        System.out.println("Digite o ID que queira deletar : ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Id: "+ id+ " deletado com sucesso.");
    }
}
