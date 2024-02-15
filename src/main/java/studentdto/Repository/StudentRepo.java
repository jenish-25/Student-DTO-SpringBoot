package studentdto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import studentdto.Model.StudentData;

@Repository
public interface StudentRepo extends JpaRepository<StudentData,Integer> {
}
