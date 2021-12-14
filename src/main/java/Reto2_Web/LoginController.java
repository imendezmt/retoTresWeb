package Reto2_Web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ivan
 */
@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class LoginController {
    
    /**
     * Servicio usuario
     */
    @Autowired
    private LoginService loginService;
    
    /**
     * Muestra todos los usario
     * @return 
     */
    @GetMapping("/all")
    public List<Login> getAll() {
        return loginService.getAll();
    }
    
    /**
     * Status
     * @param login
     * @return 
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Login registrar(@RequestBody Login login) {
        return loginService.registrar(login);
    }
    
    /**
     * Autentica al email y contraseña
     * @param email
     * @param password
     * @return 
     */
    @GetMapping("/{email}/{password}")
    public Login autenticarSesion(@PathVariable("email") String email, @PathVariable("password") String password) {
        return loginService.autenticarSesion(email, password);
    }
    
    /**
     * Retorna si existe o no el email
     * @param email
     * @return 
     */
    /*@GetMapping("/existeEmail/{email}")
    public boolean existeEmail(@PathVariable("email") String email) {  
        return loginService.existeEmail(email);
    }*/
}
