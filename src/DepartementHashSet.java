import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;
public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = departements.iterator();
        while (it.hasNext()) {
            Departement D = it.next();
            if (D.getNom().equals(nom))
                return true;
        }
        for (Departement D : departements) {
            if (D.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        //Comparable
        TreeSet<Departement> tree = new TreeSet<>(departements);
        return tree;

        //Comparator
        //TreeSet<Departement> tree = new TreeSet<>(new ComparatorParId());
        //tree.addAll(departements);
        //return tree;
    }
}
