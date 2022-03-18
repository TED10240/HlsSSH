package main.dao.impl;

import main.dao.IDepartmentDao;
import main.domain.Department;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

public class DepartmentDaoImpl implements IDepartmentDao {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }
    @Override
    public List<Department> findAll() {
        return (List<Department>) hibernateTemplate.loadAll(Department.class);
    }

    @Override
    public List<Department> findAll(DetachedCriteria dCriteria) {
        return (List<Department>)hibernateTemplate.loadAll(Department.class);
    }

    @Override
    public void save(Department department) {
        hibernateTemplate.save(department);
    }

    @Override
    public void delete(String depID) {
        hibernateTemplate.delete(depID);
    }

    @Override
    public Department findById(String depID) {
        return hibernateTemplate.get(Department.class,depID);
    }

    @Override
    public void update(Department department) {
        hibernateTemplate.update(department);
    }
}
