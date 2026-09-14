import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokemonService {

    public String fetchPokemonData(String pokemonName) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + pokemonName.toLowerCase().trim();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                return null;
            }

            return response.body();
        } catch (Exception e) {
            System.out.println("Error connecting to PokéAPI: " + e.getMessage());
            return null;
        }
    }

    public Pokemon getPokemon(String pokemonName) {
        String json = fetchPokemonData(pokemonName);

        if (json == null) {
            return null;
        }

        Gson gson = new Gson();
        return gson.fromJson(json, Pokemon.class);
    }
}
