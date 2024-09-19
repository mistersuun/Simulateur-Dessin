import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dessin implements Forme, Iterable<Forme> {
    private final String nom;
    private final List<Forme> formes;

    public Dessin(String nom) {
        this.nom = nom;
        this.formes = new ArrayList<>();
    }

    public void ajouterForme(Forme forme) {
        formes.add(forme);
    }

    @Override
    public void afficher(String chemin) {
        System.out.println(chemin + nom);
        for (Forme forme : formes) {
            forme.afficher(chemin + nom + ".");
        }
    }

    @Override
    public Iterator<Forme> iterator() {
        return formes.iterator();
    }

    public String getNom(){
        return nom;
    }
}
