import java.sql.Date;

public class clsElemento{
    //#region ATRIBUTOS
    private String Nombre;
    private String Tipo;
    private String Ruta;
    private Byte Tamaño;
    private Date Creado;
    private Date UltimoAcceso;
    private Date UltimaModificacion;
    //#endregion

    //#region BUILDERS
    public clsElemento() {
    }

    public clsElemento(String Nombre, String Tipo, String Ruta, Byte Tamaño, Date Creado, Date UltimoAcceso, Date UltimaModificacion) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Ruta = Ruta;
        this.Tamaño = Tamaño;
        this.Creado = Creado;
        this.UltimoAcceso = UltimoAcceso;
        this.UltimaModificacion = UltimaModificacion;
    }
    //#endregion

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Tipo='" + getTipo() + "'" +
            ", Ruta='" + getRuta() + "'" +
            ", Tamaño='" + getTamaño() + "'" +
            ", Creado='" + getCreado() + "'" +
            ", UltimoAcceso='" + getUltimoAcceso() + "'" +
            ", UltimaModificacion='" + getUltimaModificacion() + "'" +
            "}";
    }

    //#region GETTERS && SETTERS
    public String getNombre() {return this.Nombre;}

    public void setNombre(String Nombre) {this.Nombre = Nombre;}

    public String getTipo() {return this.Tipo;}

    public void setTipo(String Tipo) {this.Tipo = Tipo;}

    public String getRuta() {return this.Ruta;}

    public void setRuta(String Ruta) {this.Ruta = Ruta;}

    public Byte getTamaño() {return this.Tamaño;}

    public void setTamaño(Byte Tamaño) {this.Tamaño = Tamaño;}

    public Date getCreado() {return this.Creado;}

    public void setCreado(Date Creado) {this.Creado = Creado;}

    public Date getUltimoAcceso() {return this.UltimoAcceso;}

    public void setUltimoAcceso(Date UltimoAcceso) {this.UltimoAcceso = UltimoAcceso;}

    public Date getUltimaModificacion() {return this.UltimaModificacion;}

    public void setUltimaModificacion(Date UltimaModificacion) {this.UltimaModificacion = UltimaModificacion;}
    //#endregion

}