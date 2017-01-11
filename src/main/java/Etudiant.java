import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    public String prenom;

    public String nom;

    public int numEtudiant;

    public List<Cours> cours = new ArrayList<Cours> ();

    public Devoir devoir;

    void setPrenom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    String getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

}
