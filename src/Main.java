public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Ahmed", "IT", 5);
        Employe e2 = new Employe(2, "Sami", "Mohamed", "HR", 3);
        Employe e3 = new Employe(3, "Nour", "Fatma", "IT", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        System.out.println("Recherche par nom (Ali) : " + societe.rechercherEmploye("Ali"));

        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();
    }
}
