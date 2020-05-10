package fr.uvsq21504875;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Personnel implements Personne{
  private final String nom;
  private final String prenom;
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

    public Personnel build(){
      return new Personnel(this);
    }
  }

  private Personnel(Builder builder){
    nom = builder.nom;
    prenom = builder.prenom;

    date=builder.date;
    numeros=builder.numeros;
    fonctions=builder.fonctions;
  }

  @Override
  public void informations(){
    System.out.println("[Nom : " +  this.nom);
    System.out.println(" Prenom : " +  this.prenom);
    System.out.println(" Date : " +  this.date);
    System.out.println(" Fonctions : " +  this.fonctions);
    for (Map.Entry<String,String> e : numeros.entrySet()){
      System.out.println("Numero "+ e.getKey() + " : " + e.getValue());
    }


  }
}
