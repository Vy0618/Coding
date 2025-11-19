package sistemalogin;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authlogin")
public class sistemaloginController {
    private String emailpadrao = "vyzxc@gmail.com"; /* Aqui, são estabelecidos o email e senha padrão. */
    private String passwordpadrao = "32134921";

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> dados) {
        String email = dados.get("email");
        String password = dados.get("password");

        if (email.equals(emailpadrao) && password.equals(passwordpadrao)) {
            return ResponseEntity.ok("Sucess");
        }
        return ResponseEntity.status(401).body("failed");

    }

}
