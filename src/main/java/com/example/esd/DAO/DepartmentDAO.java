package com.example.esd.DAO;

import com.example.esd.Bean.Department;

import java.util.List;

public interface DepartmentDAO {
    boolean addDepartment(Department deptObj);
    List<Department> getDepartmentList();
}
