public class RegistroPropiedad {

    public boolean transferirInmueble(Propiedad p,
                                      Propietario nuevoTitular) {

        System.out.println("Registro de la Propiedad");
        System.out.println("Validando inmueble: " + p.getDireccion());

        if (p.tieneEmbargo()) {
            System.out.println("Transferencia rechazada: "
                    + "la propiedad tiene un embargo.");
            return false;
        }

        p.cambiarPropietario(nuevoTitular);

        System.out.println("Transferencia realizada correctamente.");
        System.out.println("Nuevo titular: "
                + nuevoTitular.getNombreCompleto());

        return true;
    }
}