package mvega.security.auth.service;

import mvega.security.auth.AuthResponse;
import mvega.security.auth.LoginRequest;
import mvega.security.auth.RegisterRequest;

public interface IAuthService {
    AuthResponse login(LoginRequest loginRequest);

    AuthResponse register(RegisterRequest registerRequest);
}
