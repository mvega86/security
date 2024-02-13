package mvega.security.auth.service.mapper;

import lombok.RequiredArgsConstructor;
import mvega.security.auth.persistence.entity.User;
import mvega.security.auth.service.mapper.dto.RegisterRequest;
import mvega.security.mapper.IMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class RegisterRequestToUser implements IMapper<RegisterRequest, User> {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User map(RegisterRequest in) {
        User user = new User();
        user.setUuid(UUID.randomUUID());
        user.setUsername(in.getUsername());
        user.setPassword(passwordEncoder.encode(in.getPassword()));
        user.setEmail(in.getEmail());
        user.setName(in.getName());
        user.setLastname(in.getLastname());
        user.setCountry(in.getCountry());
        return user;
    }
}
