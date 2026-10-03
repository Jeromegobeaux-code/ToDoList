package DL.Entities;

import DL.Enums.TaskImportanceEnum;
import DL.Enums.TaskStatutEnum;
import DL.Enums.TaskUrgencyEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Entity
@Table(name = "Tasks")
@Getter
@Setter
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;

    @Setter
    private String content;

    @Setter
    @EnumeratedValue
    private TaskStatutEnum statut;

    @Setter
    @EnumeratedValue
    private TaskImportanceEnum importance;

    @Setter
    @EnumeratedValue
    private TaskUrgencyEnum urgency;

    @ManyToOne
    private UserEntity user;
}
