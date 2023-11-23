package fr.it_akademy.fitness.dasha;

import java.util.Scanner;

//L’application, au démarrage, doit ajouter trois tapis de course.
public class App {
    public static void main(String[] args) throws Exception {

        // base de données des adherents

        // ajouter un adhérent (doit avoir une liste)

        afficherMenuPrincipal();

    }

    // Affiche le menu au demarrage d'application,``
    // prend en compte le choix d'utilisteur
    // appel une methode correspondante
    private static void afficherMenuPrincipal() {

        System.out.println("MENU PRINCIPAL");
        System.out.println("1 : ajouter un adhérent");
        System.out.println("2 : voir les adhérents triés sur leur distance totale parcourue\n"
                + "(de la plus grande distance à la plus petite distance)");
        System.out.println("3 : ajouter une course effectuée aujourd'hui");
        System.out.println("4 : voir toutes les courses");
        System.out.println("5 : quitter");

        System.out.println("Votre choix : ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        scanner.close();

        if (response == 1) {
            // Appel de la methode ajouter un adhérent
        } else if (response == 2) {
            // appel de la methode adhérents triés
        } else if (response == 3) {
            // appel de la methode ajouter une course effectuée
        } else if (response == 4) {
            // appel de la methode voir toutes les courses
        } else {
            // appel de la methode "quitter"
        }
    }
}
