package app;

import service.ExchangeRateService;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService service = new ExchangeRateService();
        DecimalFormat df = new DecimalFormat("#,###.####"); // Formato amigable con más decimales

        System.out.println("******************************************");
        System.out.println("   Bienvenido/a al Conversor de Moneda    ");
        System.out.println("******************************************\n");

        int option = 0;

        do {
            // Menú de opciones
            System.out.println("Ingrese la conversión que deseas realizar:");
            System.out.println("1) Dólar (USD) a Peso Argentino (ARS)");
            System.out.println("2) Peso Argentino (ARS) a Dólar (USD)");
            System.out.println("3) Dólar (USD) a Real Brasileño (BRL)");
            System.out.println("4) Real Brasileño (BRL) a Dólar (USD)");
            System.out.println("5) Dólar (USD) a Peso Colombiano (COP)");
            System.out.println("6) Peso Colombiano (COP) a Dólar (USD)");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (option >= 1 && option <= 6) {
                String fromCurrency = "";
                String toCurrency = "";

                // Configurar las monedas según la opción seleccionada
                switch (option) {
                    case 1 -> {
                        fromCurrency = "USD";
                        toCurrency = "ARS";
                    }
                    case 2 -> {
                        fromCurrency = "ARS";
                        toCurrency = "USD";
                    }
                    case 3 -> {
                        fromCurrency = "USD";
                        toCurrency = "BRL";
                    }
                    case 4 -> {
                        fromCurrency = "BRL";
                        toCurrency = "USD";
                    }
                    case 5 -> {
                        fromCurrency = "USD";
                        toCurrency = "COP";
                    }
                    case 6 -> {
                        fromCurrency = "COP";
                        toCurrency = "USD";
                    }
                }

                try {
                    // Obtener la tasa de cambio
                    double rate = service.getExchangeRate(fromCurrency, toCurrency);

                    // Manejar tasas extremadamente pequeñas
                    String rateDisplay;
                    if (rate < 0.01) {
                        rateDisplay = String.format("%.8f", rate); // Mostrar con más precisión
                    } else {
                        rateDisplay = df.format(rate);
                    }

                    // Mostrar la tasa de conversión
                    System.out.println("\nLa tasa de conversión para hoy:");
                    System.out.println("1 " + fromCurrency + " = " + rateDisplay + " " + toCurrency);

                    // Solicitar el monto a convertir
                    System.out.print("Ingrese la cantidad de " + fromCurrency + " que desea convertir: ");
                    double amount = scanner.nextDouble();

                    // Calcular el monto convertido
                    double convertedAmount = amount * rate;

                    // Mostrar el resultado formateado
                    System.out.println("\nEl monto convertido es: " + df.format(convertedAmount) + " " + toCurrency + "\n");
                } catch (Exception e) {
                    System.err.println("Error al realizar la conversión: " + e.getMessage());
                }
            } else if (option == 7) {
                System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.\n");
            }
        } while (option != 7);

        scanner.close();
    }
}
