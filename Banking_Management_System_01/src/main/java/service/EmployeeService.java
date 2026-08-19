package service;

import dao.EmployeeDAO;
import entity.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO dao =
            new EmployeeDAO();

    public void addEmployee(
            Employee employee){

        employee.setStatus(
                "ACTIVE");

        employee.setEmployeeCode(
                generateEmployeeCode());

        dao.save(employee);
    }

    public void updateEmployee(
            Employee employee){

        dao.update(employee);
    }

    public void deleteEmployee(
            int employeeId){

        dao.delete(employeeId);
    }

    public Employee getEmployee(
            int employeeId){

        return dao.getById(employeeId);
    }

    public List<Employee> getAllEmployees(){

        return dao.getAll();
    }

    private String generateEmployeeCode(){

        return "EMP" +
                System.currentTimeMillis();
    }
}