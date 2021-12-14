/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class LoginRepository {

    @Autowired
    private LoginCrudRepository loginCrudRepository;

    public List<Login> getAll() {
        return (List<Login>) loginCrudRepository.findAll();
    }

    public Optional<Login> getLogin(int id) {
        return loginCrudRepository.findById(id);
    }

    public Login save(Login login) {
        return loginCrudRepository.save(login);
    }

    public boolean existeEmail(String email) {
        Optional<Login> usuario = loginCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<Login> autenticarUsuario(String email, String password) {
        return loginCrudRepository.findByEmailAndPassword(email, password);
    }

}
