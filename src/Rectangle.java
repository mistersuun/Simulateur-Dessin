public class Rectangle implements Forme {
    private final String nom;

    public Rectangle(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher(String chemin) {
        System.out.println(chemin + nom);
    }
}
