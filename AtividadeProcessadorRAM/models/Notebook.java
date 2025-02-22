package AtividadeProcessadorRAM.models;

public abstract class Notebook
{
    protected String marca;
    protected String modelo;

    public Notebook()
    {

    }

    public Notebook(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    @Override
    public String toString()
    {
        return "Notebook [marca=" + marca + ", modelo=" + modelo + "]";
    }

    
}
