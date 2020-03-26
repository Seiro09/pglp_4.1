package fr.uvsq21504875;

import java.time.LocalDateTime;

public enum Application {
  ENVIRONNEMENT;

  public void run(String [] args){
    Personnel P = new Personnel
        .Builder("Damien","Damien",
            LocalDateTime.of(1997,03,16,3,14),
            "Directeur chez XXX")
        .numeros("Perso","+33668168768")
        .build();

    //Ajouter informations pour le test du
  }

  public static void main(String [] args){
    ENVIRONNEMENT.run(args);
  }
}
