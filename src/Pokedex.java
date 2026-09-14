import java.util.Scanner;

public class Pokedex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonService pokemonService = new PokemonService();

        System.out.println("===============================");
        System.out.println("        🔴 POKÉDEX JAVA        ");
        System.out.println("===============================");

        System.out.print("Pokémon name or number: ");
        String pokemonInput = scanner.nextLine();

        System.out.println("\nSearching on PokéAPI for: " + pokemonInput + "...\n");

        Pokemon pokemon = pokemonService.getPokemon(pokemonInput);

        if (pokemon != null) {
            System.out.println("===============================");
            System.out.println("🆔 ID: #" + pokemon.getId());
            System.out.println("🏷️  Name: " + pokemon.getName());
            System.out.println("⚡ Type: " + pokemon.getFormattedTypes());
            System.out.println("📏 Height: " + pokemon.getHeightInMeters() + " m");
            System.out.println("⚖️  Weight: " + pokemon.getWeightInKg() + " kg");
            System.out.println("===============================");
        } else {
            System.out.println("Pokémon not found! Check the name or ID.");
        }
    }
}

