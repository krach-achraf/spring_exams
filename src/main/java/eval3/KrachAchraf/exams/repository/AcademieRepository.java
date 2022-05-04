package eval3.KrachAchraf.exams.repository;

import eval3.KrachAchraf.exams.model.Academie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademieRepository extends JpaRepository<Academie, Integer> {
}
