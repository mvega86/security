package mvega.security.auth.service.mapper;

import mvega.security.auth.persistence.entity.User;
import mvega.security.auth.service.mapper.dto.RegisterRequest;
import mvega.security.mapper.IMapper;

import java.util.UUID;

public class RegisterRequestToUser implements IMapper<RegisterRequest, User> {
    @Override
    public User map(RegisterRequest in) {
        User user = new User();
        user.setUuid(UUID.randomUUID());
        user.setUsername(in.getUsername());
        user.setPassword(in.getPassword());
        user.setEmail(in.getEmail());
        user.setName(in.getName());
        user.setLastname(in.getLastname());
        user.setCountry(in.getCountry());
        return user;
    }
}
