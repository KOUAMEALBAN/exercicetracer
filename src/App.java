
import java.util.ArrayList;
import java.util.List;

import ci.models.Enquete;
import ci.models.TypeEnquete;
public class App {
    public static void main(String[] args) throws Exception {
      TypeEnquete Tp1 = new TypeEnquete(1, "et0215", "Enquête descriptive");
      TypeEnquete Tp2 = new TypeEnquete(2, "et2150", "Enquête de satisfaction");
      Tp1.afficher();
      Tp2.afficher();
      Enquete e1 = new Enquete(1, "Enqête_1", "Décrire un phénonmène particulier", te1);
      Enquete e2 = new Enquete(2, "Enqête_2", "Evaluer le niveau de satisfaction client", te2);
      e1.afficher();
      e2.afficher();
      List<Enquete> list = new ArrayList<Enquete>();
      list.add(e1);
      list.add(e2);
      for (Enquete enquete : list) {
          Enquete.afficher();
 
    }
}
}