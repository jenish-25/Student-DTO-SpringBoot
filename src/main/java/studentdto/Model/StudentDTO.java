package studentdto.Model;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private int id;
    private String name;
    List<MarksDTO> marksDTOS;
}
