package fr.it_akademy.fitness.dasha.business;

public class Adherent {
    private Long id;
    private String nom;
    private String prenom;
    private static Long compteur = 0L;
    private Course course;

    public Adherent() {
        // incrementer des id
        id = ++compteur;
    }

    public Adherent(String prenom, String nom) {
        this();
        this.prenom = prenom;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getCompteur() {
        return compteur;
    }

    public void setCompteur(Long compteur) {
        this.compteur = compteur;
    }

}
