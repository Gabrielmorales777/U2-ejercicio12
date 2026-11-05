# U2-ejercicio12
### La Gestoría y el Registro de Propiedades

Este ejercicio consiste en desarrollar un sistema de transferencia de titularidad de inmuebles en Java mediante la colaboración entre objetos.

La clase `Propiedad` almacena la dirección, tasación, estado legal y propietario actual. La clase `Propietario` representa a los titulares mediante su DNI y nombre completo. `GestorInmobiliario` actúa como intermediario y envía las solicitudes de transferencia a `RegistroPropiedad`, que valida que el inmueble no tenga embargos antes de modificar su titularidad.

Se simulan dos situaciones: una transferencia exitosa y otra rechazada por una validación legal.

El objetivo es practicar la **comunicación entre objetos**, el uso de referencias, la encapsulación, los métodos y la aplicación de reglas de negocio mediante validaciones.

![Ejercicio 12](U2%20ejercicio12.png)
