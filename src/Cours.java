import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a4b159f7-3537-4b44-81f8-902729adedf5")
public class Cours {
    @objid ("c063869e-7d87-43ea-88d1-17ba8ac214c5")
    public String nomC;

    @objid ("3fa2a282-8b53-49c7-a0f4-180eb835fd95")
    public List<Devoir> ListDevoir = new ArrayList<Devoir> ();

    @objid ("c4edf7ca-caa1-4fc2-b2bf-4df15c43f4d7")
    public List<Etudiant> ListEtudiant = new ArrayList<Etudiant> ();

}
