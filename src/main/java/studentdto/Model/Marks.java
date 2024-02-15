package studentdto.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "marks")
@AllArgsConstructor
@NoArgsConstructor
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sId;
    private String subject;
    private int marks;

    public Marks(int id, String subject, int marks) {
        this.id = id;
        this.subject = subject;
        this.marks = marks;
    }
}
