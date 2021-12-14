/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web;


import Reto2_Web.CleaningProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceCleaningProduct extends MongoRepository<CleaningProduct, Integer> {
    
}
