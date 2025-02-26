package AtividadeVeiculoLivro.models;

public class Livro2
{
    private String titulo;
    private String autor;
    private int isbn;
    private int numeroPaginas;
    private double valorCompra;
    
    public Livro2(String titulo, String autor, int isbn, int numeroPaginas, double valorCompra)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.valorCompra = valorCompra;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public int getIsbn()
    {
        return isbn;
    }

    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas)
    {
        this.numeroPaginas = numeroPaginas;
    }

    public double getValorCompra()
    {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra)
    {
        this.valorCompra = valorCompra;
    }

    
    
}
