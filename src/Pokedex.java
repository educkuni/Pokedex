import java.util.Scanner;

public class Pokedex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonService pokemonService = new PokemonService();

        System.out.println("===============================");
        System.out.println("        🔴 POKÉDEX JAVA        ");
        System.out.println("===============================");

        while (true) {
            System.out.print("\nEnter Pokémon name/ID (or 'exit' to quit): ");
            String pokemonInput = scanner.nextLine().trim();

            if (pokemonInput.equalsIgnoreCase("exit")) {
                System.out.println("\nClosing Pokédex... Goodbye! 👋");
                break;
            }

            if (pokemonInput.isEmpty()) {
                System.out.println("⚠️ Please type a Pokémon name or number.");
                continue;
            }

            System.out.println("\nSearching on PokéAPI for: " + pokemonInput + "...\n");

            Pokemon pokemon = pokemonService.getPokemon(pokemonInput);

            if (pokemon != null) {
                System.out.println("===============================");
                System.out.println("🆔 ID: #" + pokemon.getId());
                System.out.println("🏷️  Name: " + pokemon.getName());
                System.out.println("⚡ Type: " + pokemon.getFormattedTypes());
                System.out.println("📏 Height: " + pokemon.getHeightInMeters() + " m");
                System.out.println("⚖️  Weight: " + pokemon.getWeightInKg() + " kg");
                System.out.println("-------------------------------");
                System.out.println("📊 BASE STATS:");
                System.out.println("❤️  HP: " + pokemon.getStatValue("hp"));
                System.out.println("⚔️  Attack: " + pokemon.getStatValue("attack"));
                System.out.println("🛡️  Defense: " + pokemon.getStatValue("defense"));
                System.out.println("💨 Speed: " + pokemon.getStatValue("speed"));
                System.out.println("===============================");
            } else {
                System.out.println("Pokémon not found! Check the name or ID.");
            }
        }
    }
}

