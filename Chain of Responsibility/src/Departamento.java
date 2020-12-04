public class Departamento implements IDepartamento{

    public IDepartamento siguiente;

    public void procesar(Reclamo reclamo) {     
        if (siguiente != null){             // Si tiene siguientes en la cadena
            siguiente.procesar(reclamo);
        }
    }

    public void atenderReclamo(Reclamo reclamo){
        procesar(reclamo);
    };

    public IDepartamento conectar(IDepartamento siguiente){
        this.siguiente = siguiente;
        return siguiente;
    }
    
}
