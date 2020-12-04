public class DepartamentoAtencionAlCliente extends Departamento {

    @Override
    public void procesar(Reclamo reclamo) {
        if (reclamo.getReclamo().equals("atcliente")){                         // El reclamo lo puede atender atencion al cliente
            System.out.println("Reclamo atendido por atencion al cliente");
        } else if(siguiente == null) {
            System.out.println("Reclamo atendido por atencion al cliente");
        } else {
            siguiente.procesar(reclamo);                                 // No puede atender, deriva responsabilidad
        }                                 
    }

}
