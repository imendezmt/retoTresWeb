package Reto2_Web;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderInterface extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
}
