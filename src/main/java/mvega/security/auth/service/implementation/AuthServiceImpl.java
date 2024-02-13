package mvega.security.auth.service.implementation;

import lombok.RequiredArgsConstructor;
import mvega.security.auth.AuthResponse;
import mvega.security.auth.LoginRequest;
import mvega.security.auth.RegisterRequest;
import mvega.security.auth.service.IAuthService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements IAuthService {
    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public AuthResponse register(RegisterRequest registerRequest) {
        return null;
    }
}
