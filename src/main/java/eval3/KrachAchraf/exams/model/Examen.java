package eval3.KrachAchraf.exams.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Examen {

    @Id
    @GeneratedValue
    private int id;
    private Date date;

    @ManyToOne
    private Sujet sujet;

    public Examen() {
    }

    public Examen(int id, Date date, Sujet sujet) {
        this.id = id;
        this.date = date;
        this.sujet = sujet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public void setSujet(Sujet sujet) {
        this.sujet = sujet;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "id=" + id +
                ", date=" + date +
                ", sujet=" + sujet +
                '}';
    }
}
