package model;

public class Currency {
    private String code; // Código de la moneda (e.g., USD, EUR)
    private String name; // Nombre de la moneda (e.g., Dólar, Euro)

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getters y Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + code + ")";
    }
}
