# Requerimientos del Sistema de Parqueadero de Motocicletas

## 1. Introducción

El presente documento define los requerimientos del sistema de gestión para un parqueadero de motocicletas. El sistema tiene como propósito facilitar el registro y control de las motocicletas que ingresan y salen del parqueadero, así como el cálculo del valor a pagar de acuerdo con el tiempo de permanencia.

El sistema permitirá llevar un control organizado de los espacios disponibles, los vehículos registrados, los horarios de ingreso y salida y los pagos realizados.

## 2. Objetivo del sistema

Desarrollar un sistema que permita gestionar de manera sencilla y organizada el ingreso, permanencia y salida de motocicletas de un parqueadero, facilitando el control de los espacios disponibles y el cálculo del valor correspondiente al servicio.

## 3. Alcance

El sistema permitirá:

* Registrar el ingreso de motocicletas.
* Registrar información básica de cada motocicleta.
* Controlar la disponibilidad de los espacios del parqueadero.
* Registrar la hora de ingreso.
* Registrar la hora de salida.
* Calcular el valor que debe pagar el usuario.
* Registrar el método de pago.
* Consultar información de las motocicletas.
* Consultar los pagos realizados.
* Generar información relacionada con el uso del parqueadero.

El parqueadero contará con una capacidad máxima de 23 motocicletas.

## 4. Actores del sistema

### Administrador o encargado

Persona responsable de utilizar el sistema para gestionar el funcionamiento del parqueadero.

Sus principales funciones serán:

* Registrar motocicletas.
* Registrar ingresos y salidas.
* Consultar información.
* Registrar pagos.
* Consultar los espacios disponibles.

### Usuario

Persona que utiliza el servicio de parqueadero.

El usuario proporciona la información necesaria de su motocicleta y realiza el pago correspondiente al tiempo de permanencia.

---

# 5. Requerimientos funcionales

| ID   | Nombre                   | Descripción                                                                                  |
| ---- | ------------------------ | -------------------------------------------------------------------------------------------- |
| RF01 | Registrar motocicleta    | El sistema debe permitir registrar una motocicleta que ingresa al parqueadero.               |
| RF02 | Registrar placa          | El sistema debe permitir registrar la placa de la motocicleta.                               |
| RF03 | Registrar ingreso        | El sistema debe registrar la hora de ingreso de la motocicleta.                              |
| RF04 | Asignar espacio          | El sistema debe asignar un espacio disponible a la motocicleta.                              |
| RF05 | Consultar espacios       | El sistema debe permitir consultar los espacios disponibles y ocupados.                      |
| RF06 | Registrar salida         | El sistema debe permitir registrar la salida de una motocicleta.                             |
| RF07 | Calcular tiempo          | El sistema debe calcular el tiempo de permanencia de la motocicleta.                         |
| RF08 | Calcular valor           | El sistema debe calcular el valor a pagar de acuerdo con el tiempo de permanencia.           |
| RF09 | Registrar pago           | El sistema debe permitir registrar el pago realizado por el usuario.                         |
| RF10 | Registrar método de pago | El sistema debe permitir seleccionar el método utilizado para realizar el pago.              |
| RF11 | Consultar motocicleta    | El sistema debe permitir consultar la información de una motocicleta registrada.             |
| RF12 | Consultar historial      | El sistema debe permitir consultar los registros de ingreso, salida y pago.                  |
| RF13 | Validar capacidad        | El sistema debe impedir nuevos ingresos cuando los 23 espacios estén ocupados.               |
| RF14 | Validar motocicleta      | El sistema debe verificar que la motocicleta que se registra tenga la información requerida. |
| RF15 | Liberar espacio          | Al registrar la salida de una motocicleta, el sistema debe liberar el espacio ocupado.       |

# 6. Requerimientos no funcionales

| ID    | Nombre         | Descripción                                                                                                          |
| ----- | -------------- | -------------------------------------------------------------------------------------------------------------------- |
| RNF01 | Usabilidad     | El sistema debe contar con una interfaz sencilla y fácil de utilizar.                                                |
| RNF02 | Rendimiento    | El sistema debe responder rápidamente a las operaciones realizadas por el usuario.                                   |
| RNF03 | Seguridad      | El sistema debe proteger la información registrada y restringir las operaciones según el tipo de usuario.            |
| RNF04 | Disponibilidad | El sistema debe estar disponible para realizar las operaciones necesarias durante el funcionamiento del parqueadero. |
| RNF05 | Mantenibilidad | El código debe estar organizado para facilitar futuras modificaciones y mejoras.                                     |
| RNF06 | Escalabilidad  | El sistema debe permitir realizar modificaciones para ampliar sus funcionalidades en el futuro.                      |
| RNF07 | Integridad     | El sistema debe evitar registros incompletos o inconsistentes.                                                       |
| RNF08 | Compatibilidad | El sistema debe funcionar correctamente en el entorno definido para el proyecto.                                     |

* El sistema calcule el valor correspondiente al servicio.
* Se pueda registrar el método de pago.
* El espacio quede disponible después de registrar la salida.
* El sistema impida nuevos ingresos cuando los 23 espacios estén ocupados.
