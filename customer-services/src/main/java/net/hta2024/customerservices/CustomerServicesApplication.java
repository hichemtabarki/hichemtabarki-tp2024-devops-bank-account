package net.hta2024.customerservices;

import net.hta2024.customerservices.config.GlobalConfig;
import net.hta2024.customerservices.entites.Customer;
import net.hta2024.customerservices.repositories.CustomerRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRespository customerRespository){
        return args->{
            Customer customer1 = Customer.builder()
                    .firstName("Hichem")
                    .lastName("Tabarki")
                    .email("hichem.tabarki@gmail.com")
                    .build();
           customerRespository.save(customer1);
            Customer customer2 = Customer.builder()
                    .firstName("Mohamed")
                    .lastName("Tabarki")
                    .email("mohamed.tabarki@gmail.com")
                    .build();
            customerRespository.save(customer2);
        };
    }

}
