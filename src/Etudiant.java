import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2b30b96f-fd0a-4c2d-874a-5897f2b2b219")
public class Etudiant {
    @objid ("34a5175d-458e-4421-838b-47f0ceb38f12")
    public String prenom;

    @objid ("634bf3d8-95ed-437a-be4d-69729922a6f9")
    public String nom;

    @objid ("92236fba-d15c-401e-92a4-b415ce5d130a")
    public int numEtudiant;

    @objid ("a49f76e3-f6b8-4ff0-8aa7-6a34c88f1941")
    public List<Cours> cours = new ArrayList<Cours> ();

    @objid ("0e0a9cca-b194-42b2-ab67-e7622700ef38")
    public Devoir devoir;

    @objid ("88120d49-24b8-4fc5-9a36-3d93edb0ed60")
    void setPrenom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    @objid ("c44c342f-6178-454c-ba8b-acf26e197856")
    String getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    @objid ("66d34254-6381-49ab-a2eb-22b546f9f1df")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("38be980b-96da-45e9-9f5c-748bc32faf64")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

}
