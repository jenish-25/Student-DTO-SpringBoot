package studentdto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import studentdto.Model.Marks;
import studentdto.Model.MarksDTO;
import studentdto.Model.StudentDTO;
import studentdto.Model.StudentData;
import studentdto.Repository.MarksRepo;
import studentdto.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    MarksRepo marksRepo;
    public ResponseEntity<StudentDTO> saveData(StudentDTO studentDTO) {
        StudentData studentData=new StudentData(studentDTO.getId() ,studentDTO.getName());
        studentRepo.save(studentData);

        for (MarksDTO marksDTO: studentDTO.getMarksDTOS()){
            Marks marks=new Marks(studentDTO.getId(),marksDTO.getSubject(),marksDTO.getMarks());
            marksRepo.save(marks);
        }
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }
}
