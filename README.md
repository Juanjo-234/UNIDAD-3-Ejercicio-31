Este programa está diseñado para modelar una jerarquía de sistemas y tecnologías de almacenamiento de servidores aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización de código mediante la palabra clave super y especialización de comportamiento en las subclases.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base AlmacenamientoServidor: Concentra los atributos protegidos comunes a cualquier infraestructura de datos (capacidadGb, tasaTransferenciaMb y proveedor), provee un constructor centralizado y define métodos generales de diagnóstico y rendimiento.

Desarrolla las clases hijas (UnidadNAS, ArregloSAN y AlmacenamientoNube): Extienden de AlmacenamientoServidor añadiendo atributos propios y especializados (número de bahías físicas y protocolo de red para el NAS; cantidad de controladoras redundantes y tipo de conectividad Fiber Channel para la SAN; costo por giga byte mensual y región de disponibilidad para la Nube).

Utiliza la palabra clave super: Emplea super(...) en los constructores de cada subclase para delegar la inicialización de los atributos heredados directamente a la superclase.

Ejecuta la prueba en el main: Instancia objetos de los distintos tipos de almacenamiento, invoca sus métodos particulares de cálculo de costos y tasas de transferencia, y muestra los detalles completos por consola.
