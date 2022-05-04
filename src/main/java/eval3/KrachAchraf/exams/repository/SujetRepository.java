package eval3.KrachAchraf.exams.repository;

import eval3.KrachAchraf.exams.model.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SujetRepository extends JpaRepository<Sujet, Integer> {
}
