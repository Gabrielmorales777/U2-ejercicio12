public class Propiedad {
    private String direccion;
    private double tasacion;
    private String estadolegal;
    private Propietario propietario;

        public Propiedad(String direccion, double tasacion,
                         String estadolegal, Propietario propietario) {
            this.direccion = direccion;
            this.tasacion = tasacion;
            this.estadolegal = estadolegal;
            this.propietario = propietario;
        }

        public String getDireccion() {
            return direccion;
        }

        public double getTasacion() {
            return tasacion;
        }

        public String getEstadolegal() {
            return estadolegal;
        }

        public Propietario getPropietario() {
            return propietario;
        }

        public void cambiarPropietario(Propietario nuevoTitular) {
            propietario = nuevoTitular;
        }

        public boolean tieneEmbargo() {
            return estadolegal.equalsIgnoreCase("Embargada");
        }
    }

