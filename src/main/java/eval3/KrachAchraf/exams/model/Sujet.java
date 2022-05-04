package eval3.KrachAchraf.exams.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sujet {

    @Id
    @GeneratedValue
    private int num;
    private String libelle;

    public Sujet() {
    }

    public Sujet(int num, String libelle) {
        this.num = num;
        this.libelle = libelle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Sujet{" +
                "num=" + num +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
