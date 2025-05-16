package it.raffo;

import java.util.ArrayList;
import java.util.List;

import it.raffo.dao.DaoInterface;
import it.raffo.dao.VideogamesDaoImpl;
import it.raffo.dao.CharacterDaoImpl;
import it.raffo.model.Videogioco;
import it.raffo.model.Personaggio;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        DaoInterface<Videogioco> games = new VideogamesDaoImpl();
        DaoInterface<Personaggio> character = new CharacterDaoImpl();
        List<Videogioco> gamesList = new ArrayList<>();
        List<Personaggio> charactersList = new ArrayList<>();

        System.out.println("\nINSERISCI GIOCHI\n");
        gamesList.add(new Videogioco(null, "PES21", 49.99, "Sport", "Footnell game", 8));

        games.insertMany(gamesList);

        System.out.println("\nSTAMPA GIOCHI\n");
        System.out.println(games.findAll());

        System.out.println("\nINSERISCI PERSONAGGI\n");
        charactersList.add(new Personaggio(null, "Ronaldo", 48, "fenomeno", "Inter", "Brasiliana"));

        character.insertMany(charactersList);

        System.out.println("\nSTAMPA PERSONAGGI\n");
        System.out.println(character.findAll());
    }

}
