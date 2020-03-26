package fr.uvsq21504875;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Personnel {
  private final String nom;
  private final String prenom;;
  private final LocalDateTime date;
  private final HashMap<String,String> numeros;
  private final String fonctions;

  public static class Builder{
    private final String nom;
    private final String prenom;
    private final LocalDateTime date;
    private final String fonctions;

    private HashMap<String,String> numeros = new HashMap<>();

    public Builder(String nom, String prenom, LocalDateTime date, String fonctions){
      this.nom=nom;
      this.prenom=prenom;
      this.date=date;
      this.fonctions=fonctions;
    }

    public Builder numeros(String key,String numero){
      this.numeros.put(key,numero);
      return this;
    }
  }

  private Personnel(Builder builder){
    nom = builder.nom;
    prenom = builder.prenom;

    date=builder.date;
    numeros=builder.numeros;
    fonctions=builder.fonctions;
  }

}
