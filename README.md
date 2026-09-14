#  Sistema de Gestión de Parqueadero de Motos (`PROYECTOMOTORCICLE`)

Sistema de control y registro para la administración eficiente de un parqueadero de motocicletas. Permite gestionar la capacidad disponible, el registro de salida de vehículos, el cálculo automático de tarifas y la liquidación mediante distintos medios de pago.

---

##  Características Principales

* **Capacidad Limitada:** Control en tiempo real para un cupo máximo de **23 motocicletas**.
* **Gestión de Salidas:** Registro y búsqueda de vehículos mediante el número de placa.
* **Cálculo de Tarifa:** Cobro estandarizado a **$40 pesos por hora**.
* **Registro de Pagos:** Soporte para múltiples métodos de pago:
  * Efectivo
  * Nequi
  * Otros medios digitales
* **Módulo de Reportes:** Generación de recibo e impresión del valor cobrado por motocicleta.

---

##  Reglas de Negocio

| Parámetro | Valor / Regla |
| :--- | :--- |
| **Capacidad Máxima** | 23 espacios |
| **Tarifa por Hora** | $40 COP / hora |
| **Identificador Principal** | Placa de la moto |
| **Medios de Pago** | Efectivo, Nequi, etc. |

---

##  Tecnologías y Requisitos

* **Lenguaje de Programación:** C / Python (según la implementación).
* **Entorno:** Ejecución desde consola / terminal.

---

##  Uso del Sistema

1. **Ingreso:** Se asigna un espacio dentro de los 23 disponibles.
2. **Salida:** Se digita la placa del vehículo para liquidar.
3. **Pago:** Se selecciona la forma de pago (Efectivo / Nequi) y el sistema imprime el valor total a pagar.

---

##  Autores y Créditos



## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.
