import java.util.Iterator;

public class AffichageCheminComplet implements AffichageStrategie {

    @Override
    public void afficher(Forme forme) {
        afficherAvecCheminComplet(forme, "");
    }

    private void afficherAvecCheminComplet(Forme forme, String chemin) {
        if (forme instanceof Dessin dessin) {
            System.out.println(chemin + dessin.getNom());

            Iterator<Forme> iter = dessin.iterator();
            while (iter.hasNext()) {
                Forme enfant = iter.next();
                if (enfant instanceof Dessin) {
                    afficherAvecCheminComplet(enfant, chemin + dessin.getNom() + ".");
                } else {
                    enfant.afficher(chemin + dessin.getNom() + ".");
                }
            }
        } else {
            forme.afficher(chemin);
        }
    }
}
