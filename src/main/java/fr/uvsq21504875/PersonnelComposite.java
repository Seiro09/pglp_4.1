package fr.uvsq21504875;

import java.util.ArrayList;
import java.util.List;

public class PersonnelComposite implements Personne {
  private List<Personne> children = new ArrayList<>();

  @Override
  public void informations(){
    for (Personne p : children){
      p.informations();
    }
  }

  public void add(Personne p){
    children.add(p);
  }

  public void remove(Personne p){
    children.remove(p);
  }
}
