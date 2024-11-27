public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Employés dans SocieteArrayList
        Employe e1 = new Employe(1, "Ali", "Ahmed", "IT", 5);
        Employe e2 = new Employe(2, "Sami", "Mohamed", "HR", 3);
        Employe e3 = new Employe(3, "Nour", "Fatma", "IT", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("Recherche par nom (Ali) : " + societe.rechercherEmploye("Ali"));

        System.out.println("Tri des employés par nom, département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("Tri des employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Gestion des départements avec AffectationHashMap
        AffectationHashMap gestion = new AffectationHashMap();

        // Création des objets Employe et Departement
        Employe emp1 = new Employe(1, "Alice");
        Employe emp2 = new Employe(2, "Bob");
        Departement dep1 = new Departement(101, "RH");
        Departement dep2 = new Departement(102, "IT");

        // Ajout
        gestion.ajouterEmployeDepartement(emp1, dep1);
        gestion.ajouterEmployeDepartement(emp2, dep2);

        System.out.println("Affectations employés-départements :");
        gestion.afficherEmployesEtDepartements();

        // Recherche
        System.out.println("Bob est-il employé ? " + gestion.rechercherEmploye(emp2));

        // Suppression
        gestion.supprimerEmploye(emp1);
        System.out.println("Affectations après suppression :");
        gestion.afficherEmployesEtDepartements();
    }
}
