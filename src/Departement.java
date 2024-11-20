import java.util.Objects;
public class Departement {
    int id;
    String nom_dep;
    int nb_emp;

    public Departement(){};
    public Departement(int id,String nom_dep,int nb_emp){
        this.id=id;
        this.nom_dep=nom_dep;
        this.nb_emp=nb_emp;
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
        this.nom_dep = nom_dep;
    }

    public int getNombreEmployes() {
        return nb_emp;
    }

    public void setNombreEmployes(int nb_emp) {
        this.nb_emp = nb_emp;
    }

    // Override equals method (based on id and nom)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == this.id && Objects.equals(nom_dep, that.nom_dep);
    }


    // Override toString method
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom_dep + '\'' +
                ", nombreEmployes=" + nb_emp +
                '}';
    }
    public int hashCode() {
        return Objects.hash(id, nom_dep);}
    public int compareTo(Departement d) {
        return id - d.id;
    }
}

