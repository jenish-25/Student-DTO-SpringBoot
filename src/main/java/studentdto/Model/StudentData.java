package studentdto.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student_dto")
@AllArgsConstructor
@NoArgsConstructor
public class StudentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
    private String name;

}
