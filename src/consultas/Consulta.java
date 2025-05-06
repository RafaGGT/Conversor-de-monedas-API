package consultas;
import com.google.gson.Gson;
import modelo.Moneda;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    public Moneda monedaCambio(String name1){
        //Direccion modificable
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/96389d92b25d456075a09efd/latest/" + name1);
        //Se crea un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        //Se crea la solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        //Se declara una variable para guardar la respuesta
        HttpResponse<String> response = null;
        try {
            // Se envía la solicitud HTTP, obteniendo la respuesta como texto (String) desde la API
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // Se convierte la respuesta JSON en un objeto Moneda
            return new Gson().fromJson(response.body(), Moneda.class);
            // catch para error entrada/salida y error de interrupcion
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al consultar los datos de la API.");
            throw new RuntimeException(e);
        }
    }
}
