package ci.models;
public class TypeEnquete {
    private int id;
    private String code;
    private String libelle;

    public TypeEnquete(){
        System.out.println("constructeur sans parametres");
    }
    public  TypeEnquete (int id, String code, String libelle) {
            this.id = id;
            this.code = code;
            this.libelle = libelle;
            System.out.println("constructeur avec 3 parametres");
    }
    public void afficher() {
        System.out.println("vous etes "+ this.id + " "+ this.code+ " , le libelle est " + this.libelle ); 
       
       } 
    }       

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }



