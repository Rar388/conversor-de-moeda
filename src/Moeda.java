import java.util.Map;

// O Record é uma classe mais simples para transportar dados
public record Moeda(String base_code, Map<String, Double> conversion_rates) {
    // O Java cria o construtor, getters e toString de forma automática.
}