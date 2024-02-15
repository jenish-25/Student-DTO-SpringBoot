package studentdto.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studentdto.Model.StudentDTO;
import studentdto.Service.StudentService;

@RestController
@RequestMapping("student")
public class StrudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("save")
    public ResponseEntity<StudentDTO> saveData(@RequestBody StudentDTO studentDTO){
        return studentService.saveData(studentDTO);
    }
}
