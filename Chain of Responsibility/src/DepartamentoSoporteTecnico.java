public class DepartamentoSoporteTecnico extends Departamento {

    @Override
    public void procesar(Reclamo reclamo) {
        if (reclamo.getReclamo().equals("sptecnico")){                         // El reclamo lo puede atender soporte tecnico
            System.out.println("Reclamo atendido por Soporte tecnico");
        } else if(siguiente == null) {
            System.out.println("Reclamo atendido por Soporte tecnico");
        } else {
            siguiente.procesar(reclamo);                                 // No puede atender, deriva responsabilidad
        } 
    }
    
}
