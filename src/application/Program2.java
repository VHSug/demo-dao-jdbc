package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void P2(){
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== ENCONTRAR DEPARTAMENTO POR ID ====");
        Department department = departmentDao.findById(1);
        System.out.println(department);

    }
}
