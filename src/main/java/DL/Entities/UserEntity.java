package DL.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "AppUser")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Setter
    private String userName;

    @Setter
    private String password;

}
