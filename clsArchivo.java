public class clsArchivo extends clsElemento{
    private String Extension;

    public clsArchivo()
    {
        Extension = "";
    }
    public clsArchivo(String Extension)
    {
        this.Extension = Extension;
    }
    public void setExtension(String Extension)
    {
        this.Extension = Extension;
    }
    public String getExtension()
    {
        return Extension;
    }

    @Override
    public String toString()
    {
        return "Extension: " + Extension;
    }
}
