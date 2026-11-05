public class Main {
    public static void main(String[] args) {

        RegistroPropiedad registro = new RegistroPropiedad();

        GestorInmobiliario gestor =
                new GestorInmobiliario(registro);

        Propietario propietarioActual =
                new Propietario("30111222", "Juan Perez");

        Propietario nuevoTitular1 =
                new Propietario("40123456", "Maria Gomez");

        Propietario nuevoTitular2 =
                new Propietario("40987654", "Pedro Lopez");

        // Caso 1: transferencia exitosa
        Propiedad propiedad1 = new Propiedad(
                "San Martin 123",
                50000000,
                "Libre",
                propietarioActual
        );

        gestor.ejecutarTransferencia(propiedad1, nuevoTitular1);

        // Caso 2: transferencia bloqueada
        Propiedad propiedad2 = new Propiedad(
                "Belgrano 456",
                75000000,
                "Embargada",
                propietarioActual
        );

        gestor.ejecutarTransferencia(propiedad2, nuevoTitular2);
    }
}
