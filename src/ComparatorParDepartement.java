import java.util.Comparator;

public class ComparatorParDepartement implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNomDepartement().compareTo(e2.getNomDepartement());
    }
}


