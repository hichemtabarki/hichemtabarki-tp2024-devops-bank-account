package net.hta2024.customerservices.web;

import jakarta.ws.rs.PathParam;
import net.hta2024.customerservices.entites.Customer;
import net.hta2024.customerservices.repositories.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    @Autowired
    private CustomerRespository customerRespository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRespository.findAll();
    }
    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id){ return customerRespository.findById(id).get();}
}
