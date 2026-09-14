# 🔴 Pokédex CLI (Java)

A terminal-based Pokédex application built in Java that fetches real-time Pokémon data from PokéAPI and parses complex nested JSON payloads.

## 🚀 Features
- **Real-Time PokéAPI Integration:** Queries live Pokémon data by name or pokedex ID number.
- **Input Sanitization:** Handles case-insensitive user inputs automatically using `.toLowerCase().trim()`.
- **Nested JSON Parsing:** Uses Google's `Gson` library to parse nested arrays and objects (types, dimensions, IDs).
- **OOP Structure:** Clean separation between network requests (`PokemonService`), model representation (`Pokemon`), and console UI (`Pokedex`).

## 🛠️ Tech Stack & Dependencies
- **Language:** Java 17+
- **IDE:** IntelliJ IDEA
- **Library:** Google Gson (JSON parser)
- **API:** PokéAPI (REST API)

## 📁 Project Structure
```text
src/
├── Pokedex.java         # Main entry point & CLI interaction
├── Pokemon.java         # Data model mapping API response fields
└── PokemonService.java  # HTTP client & API connection logic

How to Run
Open the project in IntelliJ IDEA.

Ensure the Gson library (com.google.code.gson:gson:2.10.1) is added to dependencies.

Run Pokedex.java.

===============================
        🔴 POKÉDEX JAVA        
===============================
Enter Pokémon name or number: charizard

Searching PokéAPI for: charizard...

===============================
🆔 ID: #6
🏷️  Name: Charizard
⚡ Type: Fire, Flying
📏 Height: 1.7 m
⚖️  Weight: 90.5 kg
===============================
