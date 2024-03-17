package net.hta2024.customerservices.repositories;

import net.hta2024.customerservices.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer, Long> {

}
