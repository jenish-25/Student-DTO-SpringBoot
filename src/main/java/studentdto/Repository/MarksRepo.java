package studentdto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentdto.Model.Marks;

@Repository
public interface MarksRepo extends JpaRepository<Marks,Integer> {
}
