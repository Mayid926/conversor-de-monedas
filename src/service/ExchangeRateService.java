package service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateService {
    private final String apiKey = "8e82cbc0a7d6886c4c284d5c"; //  API key

    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        String urlString = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", apiKey, fromCurrency, toCurrency);

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() == 200) {
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();

            return jsonResponse.get("conversion_rate").getAsDouble();
        } else {
            throw new Exception("Error en la API: Código de respuesta " + connection.getResponseCode());
        }
    }
}
