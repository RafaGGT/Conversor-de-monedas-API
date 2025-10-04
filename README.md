# Challenge ONE Java - Conversor de Moneda

![Java](https://img.shields.io/badge/java-17-orange)
![IntelliJ%20IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blueviolet?logo=intellij-idea)
![Gson](https://img.shields.io/badge/lib-Gson%202.10.1-brightgreen)
![Status](https://img.shields.io/badge/status-finalizado-success)

## Descripción
Este proyecto es un conversor de monedas desarrollado en Java como parte del programa **Oracle Next Education (ONE)**.  
Permite al usuario ingresar una moneda base, una moneda destino y un monto, para luego realizar la conversión utilizando la API de ExchangeRate.

- El usuario ingresa:
  1. Moneda base (por ejemplo: USD)
  2. Moneda destino (por ejemplo: CLP)
  3. Monto a convertir

- El programa consulta la API de ExchangeRate y obtiene las tasas de cambio en formato JSON.
- Se utiliza la librería **Gson** para transformar la respuesta JSON en un objeto Java.
- Se calcula y muestra en consola el valor convertido.

---

## Requisitos

- Java 17 (o superior)
- Librería externa: gson-2.10.1.jar
- Conexión a Internet para consultar la API

---

## Instalación y ejecución

1. Clonar este repositorio.
2. Asegurarse de tener `gson-2.10.1.jar` en la carpeta del proyecto.
3. Ejecutar el codigo desde la clase (`Principal.java`)


