import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    public class ConsultaCotacao {

        public Moeda buscaMoeda(String moedaBase) {
            URI endereco = URI.create("https://v6.exchangerate-api.com/v6/cf8c7f3459bc14ce5981264f/latest/" + moedaBase);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();

            try {
                HttpResponse<String> response = HttpClient
                        .newHttpClient()
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Moeda.class);
            } catch (Exception e) {
                throw new ErroConsultaApiException("Não consegui encontrar a moeda [" + moedaBase + "]. Verifique se ela existe.");
            }
        }
    }
