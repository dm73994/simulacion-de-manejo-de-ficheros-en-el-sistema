import java.util.*;
public class clsDirectorio extends clsElemento {
    private ArrayList<clsElemento> nodos;

    public clsDirectorio() {
        this.nodos = new ArrayList<clsElemento>();
    }

    @Override
    public String toString() {
        return "{" +
            " nodos='" + getNodos() + "'" +
            "}";
    }

    public ArrayList<clsElemento> getNodos() {return this.nodos;}

}
