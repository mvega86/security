package mvega.security.auth.service.mapper.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    String username;
    String password;
    String email;
    String name;
    String lastname;
    String country;
}
