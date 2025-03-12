package com.ecom.customerorder.Service;

import com.ecom.customerorder.Exception.ResourceNotFoundExceptin;
import com.ecom.customerorder.Model.Customer;
import com.ecom.customerorder.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public List<Customer>getAllCustomers()
    {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id)
    {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExceptin("Customer Not found"));
    }

    public void deleteCustomer(Long id)
    {
        customerRepository.deleteById(id);
}

}
