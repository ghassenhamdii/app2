import java.util.Objects;

public class Departement implements Comparable<Departement> {
    int id;
    String nom_dep;
    int nb_emp;

    public Departement() {}

    public Departement(int id, String nom_dep, int nb_emp) {
        this.id = id;
        this.nom_dep = nom_dep;
        this.nb_emp = nb_emp;
    }

    public Departement(int id, String nom_dep) {
        this.id = id;
        this.nom_dep = nom_dep;
        this.nb_emp = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom_dep;
    }

    public void setNom(String nom) {
        this.nom_dep = nom;
    }

    public int getNombreEmployes() {
        return nb_emp;
    }

    public void setNombreEmployes(int nb_emp) {
        this.nb_emp = nb_emp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && Objects.equals(nom_dep, that.nom_dep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom_dep);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom_dep + '\'' +
                ", nombreEmployes=" + nb_emp +
                '}';
    }

    @Override
    public int compareTo(Departement d) {
        return Integer.compare(this.id, d.id);
    }
}
