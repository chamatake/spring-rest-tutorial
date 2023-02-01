package bwg.tutorials.resttutorial.repository;

import bwg.tutorials.resttutorial.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
