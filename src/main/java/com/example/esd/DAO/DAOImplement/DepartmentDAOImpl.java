package com.example.esd.DAO.DAOImplement;

import com.example.esd.Bean.Department;
import com.example.esd.DAO.DepartmentDAO;
import com.example.esd.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDAOImpl implements DepartmentDAO {
    @Override
    public boolean addDepartment(Department deptObj) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(deptObj);
            transaction.commit();
            return true;
        }
        catch (HibernateException exception) {
            System.out.println("Hibernate Exception");
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}

