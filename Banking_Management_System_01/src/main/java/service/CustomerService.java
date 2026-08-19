package service;

import dao.CustomerDAO;
import entity.Customer;

import java.util.List;

public class CustomerService {

    private CustomerDAO dao =
            new CustomerDAO();

    public void saveCustomer(
            Customer customer){

        dao.save(customer);
    }

    public List<Customer>
    getAllCustomers(){

        return dao.getAllCustomers();
    }

    public Customer
    getCustomerById(int id){

        return dao.getCustomerById(id);
    }

    public void updateCustomer(
            Customer customer){

        dao.update(customer);
    }

    public void deleteCustomer(
            int id){

        dao.delete(id);
    }
}