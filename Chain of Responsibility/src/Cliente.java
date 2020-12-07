public class Cliente {
    public static void main(String[] args) {
        Departamento dep1 = new DepartamentoAtencionAlCliente();
        Departamento dep2 = new DepartamentoSoporteTecnico();
        Departamento dep3 = new DepartamentoInfraestructura();

        Reclamo reclamo = new Reclamo("atcliente");
        dep1.conectar(dep2);
        dep2.conectar(dep3);
        dep1.procesar(reclamo);

        reclamo = new Reclamo("sptecnico");
        dep1.procesar(reclamo);

        reclamo = new Reclamo("infraestructura");
        dep1.procesar(reclamo);

        reclamo = new Reclamo("otro reclamo"); // Reclamo no contemplado por ningun departamento
        dep1.procesar(reclamo);

        System.out.println("-------------------------------------");

        // Podemos eliminar al departamento de infraestructura de la cadena de
        // responsabilidades, ahora el dep de soporte tecnico es el ultimo

        dep1 = new DepartamentoAtencionAlCliente();
        dep2 = new DepartamentoSoporteTecnico();
        dep3 = new DepartamentoInfraestructura();

        reclamo = new Reclamo("infraestructura");
        dep1.conectar(dep2);
        dep1.procesar(reclamo);

    }
}
