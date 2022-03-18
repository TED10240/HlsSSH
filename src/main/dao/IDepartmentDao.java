package main.dao;

import main.domain.Department;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface IDepartmentDao {

    /**
     * 查询部门列表
     * @return
     */
    List<Department> findAll();
    /**
     *
     * 查询部门列表
     * @param dCriteria		查询的条件
     * @return
     */

    public List<Department> findAll(DetachedCriteria dCriteria);
    /**
     * 保存部门
     * @param department
     */

    public void save(Department department);
    /**
     * 根据id删除部门
     * @param depID
     */

    public void delete(String depID);
    /**
     * 根据id查找部门
     * @param depID
     * @return
     */
    public Department findById(String depID) ;

    /**
     * 更新部门
     * @param department
     */
    public void update(Department department);
}
