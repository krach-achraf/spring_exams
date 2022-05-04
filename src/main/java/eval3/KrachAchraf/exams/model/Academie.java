package eval3.KrachAchraf.exams.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Academie {
    @Id
    @GeneratedValue
    private int num;
    private String ville;

    @OneToMany
    private List<Examen> examens;

    public Academie() {
    }

    public Academie(int num, String ville, List<Examen> examens) {
        this.num = num;
        this.ville = ville;
        this.examens = examens;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Examen> getExamens() {
        return examens;
    }

    public void setExamens(List<Examen> examens) {
        this.examens = examens;
    }

    @Override
    public String toString() {
        return "Academie{" +
                "num=" + num +
                ", ville='" + ville + '\'' +
                ", examens=" + examens +
                '}';
    }
}
