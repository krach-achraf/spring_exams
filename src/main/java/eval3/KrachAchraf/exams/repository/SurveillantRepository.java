package eval3.KrachAchraf.exams.repository;

import eval3.KrachAchraf.exams.model.Surveillant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveillantRepository extends JpaRepository<Surveillant, Integer>{
}
