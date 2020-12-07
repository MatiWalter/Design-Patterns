public abstract class Departamento {

    public Departamento siguiente;

    public void procesar(Reclamo reclamo) {
        if (siguiente != null) { // Si tiene siguientes en la cadena
            siguiente.procesar(reclamo);
        }
    }

    public Departamento conectar(Departamento siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

}
