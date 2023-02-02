package bwg.tutorials.resttutorial;

import bwg.tutorials.resttutorial.repository.EmployeeRepository;
import bwg.tutorials.resttutorial.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("brownies", Status.COMPLETED));
            orderRepository.save(new Order("ice cream", Status.IN_PROGRESS));
            orderRepository.save(new Order("nap time", Status.CANCELED));
            orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
        };
    }
}
