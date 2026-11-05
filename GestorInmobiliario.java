public class GestorInmobiliario {
    private RegistroPropiedad registro;

    public GestorInmobiliario(RegistroPropiedad registro) {
        this.registro = registro;
    }

    public void ejecutarTransferencia(Propiedad propiedad,
                                      Propietario nuevoTitular) {

        System.out.println("Gestor inmobiliario: "
                + "solicitando transferencia...");

        registro.transferirInmueble(propiedad, nuevoTitular);

        System.out.println();
    }
}