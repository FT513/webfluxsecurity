package Entity;

import jdk.jfr.DataAmount;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "users")
public class UserEntity {

    @Id
    private Long id;


    private String username;

    private String password;
    private UserRole role;
    private String firstName;
    private String lastNAme;

    private boolean enabled;
    private LocalDateTime created;
    private LocalDateTime updated;

    @ToString.Include(name = "password")
    private String maskPassword(){
        return "********";
    }




}
