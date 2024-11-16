package Ci.models;

 public class Enquete {
 private int id;
 private String titre;
 private String description;
 private String TypeEnquete;

 public class Enquete(int ,String titre, String description, String TypeEnquete) {
    this.id = id;
    this.titre = titre;
    this.description = description;
    this.TypeEnquete = TypeEnquete;
    
    
    public void afficher() {
        System.out.println("Enquete -> (" + this.id + ", " + this.titre + ", " + this.description + ")");
        this.typeEnquete.afficher();
    }      


 public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getTitre() {
    return titre;
}
public void setTitre(String titre) {
    this.titre = titre;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public String getTypeEnquete() {
    return TypeEnquete;
}
public void setTypeEnquete(String typeEnquete) {
    TypeEnquete = typeEnquete;
} 

}

    
}
