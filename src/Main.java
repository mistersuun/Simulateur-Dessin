import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dessin dessin1 = new Dessin("Dessin1");
        Dessin dessin2 = new Dessin("Dessin2");
        Dessin dessin3 = new Dessin("Dessin3");

        Cercle cercle1 = new Cercle("Cercle1");
        Cercle cercle2 = new Cercle("Cercle2");
        Triangle triangle1 = new Triangle("Triangle1");
        Rectangle rectangle1 = new Rectangle("Rectangle1");

        dessin1.ajouterForme(cercle1);
        dessin2.ajouterForme(dessin3);
        dessin3.ajouterForme(cercle2);
        dessin3.ajouterForme(triangle1);
        dessin1.ajouterForme(dessin2);
        dessin2.ajouterForme(rectangle1);

        Dessin dessinSimple = new Dessin("DessinSimple");
        dessinSimple.ajouterForme(new Cercle("CercleSimple"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sélectionnez un dessin à afficher :");
        System.out.println("1- Dessin avec trois niveaux");
        System.out.println("2- Dessin avec deux niveaux");
        System.out.println("3- Dessin avec une forme seulement");

        int choixDessin = scanner.nextInt();
        Dessin dessinChoisi;

        switch (choixDessin) {
            case 1:
                dessinChoisi = dessin1;
                break;
            case 2:
                dessinChoisi = dessin2;
                break;
            case 3:
                dessinChoisi = dessinSimple;
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        System.out.println("Sélectionnez une stratégie d'affichage :");
        System.out.println("1- Affichage par indentation");
        System.out.println("2- Affichage par chemin complet");

        int choixStrategie = scanner.nextInt();
        AffichageStrategie strategie;

        switch (choixStrategie) {
            case 1:
                strategie = new AffichageIndentation();
                break;
            case 2:
                strategie = new AffichageCheminComplet();
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        strategie.afficher(dessinChoisi);
    }
}
