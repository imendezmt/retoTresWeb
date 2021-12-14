/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service 
public class LoginService {
   @Autowired
   private LoginRepository loginRepository;
   
   public List<Login> getAll(){
       return loginRepository.getAll();
   }
     public Optional<Login> getLogin(int id) {
        return loginRepository.getLogin(id);
    }
     
    
     public Login registrar(Login login) {
        if (login.getId() == null) {
            return login;            
        }else {
            Optional<Login> e = loginRepository.getLogin(login.getId());
            if (e.isEmpty()) {
                if (existeEmail(login.getEmail())==false){
                    return loginRepository.save(login);
                }else{
                    return login;
                }
            }else{
                return login;
            }           
        }
    }
    
    public boolean existeEmail(String email) {
        return loginRepository.existeEmail(email);
    }
    
       public Login autenticarSesion(String email, String password) {
        Optional<Login> usuario = loginRepository.autenticarUsuario(email, password);

        if (usuario.isEmpty()) {
            return new Login();
        } else {
            return usuario.get();
        }
    }
    
}
