package eval3.KrachAchraf.exams.repository;

import eval3.KrachAchraf.exams.model.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
}
