package com.example.esd.Bean;
import javax.persistence.*;

@Entity
@Table(name ="department")  //  you can specify MySQL table name it is optional; by-default it takes class name as table name
public class Department {
    @Id
    @Column(name ="dept_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentID;

    @Column(name="dept_name")
    private String departmentName;

    @Column(name="dept_address")
    private String deptAddress;

    public Department(String departmentName, String deptAddress) {
        this.departmentName = departmentName;
        this.deptAddress = deptAddress;
    }

    public Department() {
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
}
