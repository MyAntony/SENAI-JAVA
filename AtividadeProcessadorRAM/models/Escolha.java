package AtividadeProcessadorRAM.models;

public enum Escolha
{
    MEMORIA(Memoria.class),
    PROCESSADOR(Processador.class);

    private Class<?> classe;

    private Escolha(Class<?> classe)
    {
        this.classe = classe;
    }

    public Class<?> getClasse()
    {
        return classe;
    }

    
}
