/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**




/**
 *
 * @author USUARIO
 */
@Document(collection = "sesion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login{
    @Id
    private Integer id;
    private String email;
    private String password;
    private String name; 
        
}
