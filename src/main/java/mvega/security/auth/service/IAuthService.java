package mvega.security.auth.service;

import mvega.security.auth.service.mapper.dto.AuthResponse;
import mvega.security.auth.service.mapper.dto.LoginRequest;
import mvega.security.auth.service.mapper.dto.RegisterRequest;

public interface IAuthService {
    AuthResponse login(LoginRequest loginRequest);

    AuthResponse register(RegisterRequest registerRequest) throws Exception;
}
