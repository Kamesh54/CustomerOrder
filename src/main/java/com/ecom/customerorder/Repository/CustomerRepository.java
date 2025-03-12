package com.ecom.customerorder.Repository;

import com.ecom.customerorder.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
