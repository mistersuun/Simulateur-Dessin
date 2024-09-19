public class AffichageIndentation implements AffichageStrategie {
    @Override
    public void afficher(Forme forme) {
        afficherAvecIndentation(forme, 0);
    }

    private void afficherAvecIndentation(Forme forme, int niveau) {
        String indentation = "    ".repeat(niveau);
        if (forme instanceof Dessin dessin) {
            System.out.println(indentation + dessin.getNom());
            for (Forme enfant : dessin) {
                afficherAvecIndentation(enfant, niveau + 1);
            }
        } else {
            forme.afficher(indentation);
        }
    }
}
