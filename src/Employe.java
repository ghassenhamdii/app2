import java.util.Objects;

public class Employe implements Comparable<Employe> {
    public int id;
    public String nom;
    public String prenom;
    public String nom_dep;
    public int grade;

    public Employe() {}

    public Employe(int id, String nom, String prenom, String nom_dep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_dep = nom_dep;
        this.grade = grade;
    }

    public Employe(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.prenom = "";
        this.nom_dep = "";
        this.grade = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nom_dep;
    }

    public void setNomDepartement(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nom_dep + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe autre) {
        return Integer.compare(this.id, autre.id);
    }
}
