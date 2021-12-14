/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web;

import Reto2_Web.CleaningProductService;
import Reto2_Web.CleaningProduct;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/cleaningprod")
@CrossOrigin("*")
public class CleaningProductController {
       @Autowired
    private CleaningProductService accessoryService;
       
     @GetMapping("/all")
    public List<CleaningProduct> getAll() {
        return accessoryService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<CleaningProduct> getClothe(@PathVariable("id") int id) {
        return accessoryService.getClothe(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public CleaningProduct create(@RequestBody CleaningProduct gadget) {
        return accessoryService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public CleaningProduct update(@RequestBody CleaningProduct gadget) {
        return accessoryService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return accessoryService.delete(id);
    } 
    
}
