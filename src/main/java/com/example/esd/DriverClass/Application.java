package com.example.esd.DriverClass;

import com.example.esd.Bean.Department;
import com.example.esd.DAO.DAOImplement.DepartmentDAOImpl;
import com.example.esd.DAO.DepartmentDAO;

public class Application {
    public static void main(String args[]){
        System.out.println("Application Started");
        runApplication();
        System.out.println("End");
    }

    private static void runApplication() {
        Department dept1= new Department("Development","Mumbai");
        Department dept2= new Department();
        dept2.setDepartmentName("DataScience");
        dept2.setDeptAddress("Bangalore");

        DepartmentDAO deptDAO= new DepartmentDAOImpl();
        if(deptDAO.addDepartment(dept1)){
            System.out.println("department 1 added Successfully");
        }
        if(deptDAO.addDepartment(dept2)){
            System.out.println("department 2 added Successfully");
        }
    }
}
