# Currency Converter App

## Descripción

Currency Converter App es una aplicación Java que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real obtenidas
de [ExchangeRate API](https://www.exchangerate-api.com/). 

## Características

- Conversión entre las siguientes monedas:
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Real Brasileño (BRL)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Tasas de cambio actualizadas en tiempo real.
- Interfaz basada en consola fácil de usar.
- Formato amigable para las tasas y montos convertidos.
- Manejo básico de errores para asegurar robustez.

---

## Estructura del Proyecto


---

## Requisitos Previos

- Java 17 o superior.
- Conexión a Internet para consultar las tasas de cambio.
- Cuenta gratuita en [ExchangeRate API](https://www.exchangerate-api.com/) para obtener tu API key.

---

## Ejemplo de Uso-Menú de Opciones
******************************************
   Bienvenido/a al Conversor de Moneda    
******************************************

Ingrese la conversión que deseas realizar:
1) Dólar (USD) a Peso Argentino (ARS)
2) Peso Argentino (ARS) a Dólar (USD)
3) Dólar (USD) a Real Brasileño (BRL)
4) Real Brasileño (BRL) a Dólar (USD)
5) Dólar (USD) a Peso Colombiano (COP)
6) Peso Colombiano (COP) a Dólar (USD)
7) Salir
Elija una opción válida: 

## Ejemplo de Conversión
La tasa de conversión para hoy:
1 USD = 1,007.75 ARS
Ingrese la cantidad de USD que desea convertir: 100

El monto convertido es: 100,775.00 ARS

## Tecnologías Utilizadas
Java 17: Desarrollo principal.
ExchangeRate API: Servicio para obtener tasas de cambio en tiempo real.
Gson: Parsing de datos JSON
