public interface IDepartamento {

    public abstract void procesar(Reclamo reclamo);
    public IDepartamento conectar(IDepartamento siguiente);
    
}
