package fr.it_akademy.fitness.dasha.business;

import java.time.LocalDateTime;

public class Course {
    private Long id;
    private LocalDateTime dateHeureDebut;
    private Integer distanceEnMetres;
    private static Long compteur = 0L;
    private Adherent adherent;
}
