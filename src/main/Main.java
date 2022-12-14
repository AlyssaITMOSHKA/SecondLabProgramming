package main;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {


    public static void main(String[] args) {
        Battle b = new Battle();
        Articuno articuno = new Articuno("", 5);
        Helioptile helioptile = new Helioptile("", 5);
        Bounsweet bounsweet = new Bounsweet("", 4);
        Heliolisk heliolisk = new Heliolisk("", 9);
        Steenee steenee = new Steenee("", 10);
        Tsareena tsareena = new Tsareena("", 12);
        b.addAlly(heliolisk);
        b.addAlly(tsareena);
        b.addAlly(bounsweet);
        b.addFoe(articuno);
        b.addFoe(helioptile);
        b.addFoe(steenee);
        b.go();
    }

}
