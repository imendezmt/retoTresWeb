/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author USUARIO
 */
public interface LoginCrudRepository extends MongoRepository<Login, Integer> {
    Optional<Login> findByEmail(String email);
    Optional<Login> findByEmailAndPassword(String email,String password);
    
    Optional<User> findByNameOrEmail(String name, String email);
    
}
