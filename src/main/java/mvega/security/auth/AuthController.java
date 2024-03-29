package mvega.security.auth;

import lombok.RequiredArgsConstructor;
import mvega.security.auth.service.IAuthService;
import mvega.security.auth.service.mapper.dto.LoginRequest;
import mvega.security.auth.service.mapper.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private IAuthService authService;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest){
        try {
            return ResponseEntity.ok(authService.register(registerRequest));
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}
