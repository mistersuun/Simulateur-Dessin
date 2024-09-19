public class Triangle implements Forme {
    private final String nom;

    public Triangle(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher(String chemin) {
        System.out.println(chemin + nom);
    }
}
