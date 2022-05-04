package eval3.KrachAchraf.exams.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Surveillant {

    @Id
    @GeneratedValue
    private int matricule;
    private String nom;

    @ManyToMany
    @JoinTable(name="exams_surveillants",
            joinColumns = @JoinColumn(name="surveillant_id"),
            inverseJoinColumns = @JoinColumn(name="exam_id"))
    private List<Examen> examens;

    public Surveillant() {
    }

    public Surveillant(int matricule, String nom, List<Examen> examens) {
        this.matricule = matricule;
        this.nom = nom;
        this.examens = examens;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Examen> getExamens() {
        return examens;
    }

    public void setExamens(List<Examen> examens) {
        this.examens = examens;
    }

    @Override
    public String toString() {
        return "Surveillant{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", examens=" + examens +
                '}';
    }
}
