public class Cercle implements Forme {
    private final String nom;

    public Cercle(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher(String chemin) {
        System.out.println(chemin + nom);
    }
}
