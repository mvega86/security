package mvega.security.auth.service.implementation;

import lombok.RequiredArgsConstructor;
import mvega.security.auth.persistence.repository.UserRepository;
import mvega.security.auth.service.mapper.RegisterRequestToUser;
import mvega.security.auth.service.mapper.dto.AuthResponse;
import mvega.security.auth.service.mapper.dto.LoginRequest;
import mvega.security.auth.service.mapper.dto.RegisterRequest;
import mvega.security.auth.persistence.entity.User;
import mvega.security.auth.service.IAuthService;
import mvega.security.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements IAuthService {
    @Autowired
    private RegisterRequestToUser registerRequestToUser;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtService jwtService;
    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public AuthResponse register(RegisterRequest registerRequest) {
        System.out.println(registerRequest.getUsername());
        User user = registerRequestToUser.map(registerRequest);
        userRepository.save(user);
        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
