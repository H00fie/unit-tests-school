package bm.app.pokemonBattleKata;

import java.util.*;

public enum Type {
    NORMAL("Normal", List.of("Ghost"), List.of("Fighting")),
    WATER("Water", List.of("Fire", "Earth", "Rock"), List.of("Grass", "Electric")),
    FIRE("Fire", List.of("Grass", "Bug", "Metal"), List.of("Water", "Rock")),
    GRASS("Grass", List.of("Water", "Earth", "Rock"), List.of("Fire", "Bug", "Poison")),
    ELECTRIC("Electric", List.of("Water"), List.of("Rock")),
    BUG("Bug", List.of("Grass"), List.of("Fire", "Rock")),
    EARTH("Earth", List.of("Rock", "Fire"), List.of("Water", "Grass")),
    GHOST("Ghost", List.of("Dark", "Psychic"), List.of("Psychic", "Normal")),
    PSYCHIC("Psychic", List.of("Ghost", "Fighting"), List.of("Ghost")),
    ROCK("Rock", List.of("Fire"), List.of("Water", "Grass")),
    METAL("Metal", List.of("Electric"), List.of("Fire")),
    FIGHTING("Fighting", List.of("Normal"), List.of("Psychic")),
    FAIRY("Fairy", List.of("Dragon"), List.of("Fairy")),
    DRAGON("Dragon", List.of("Dragon"), List.of("Fairy")),
    DARK("Dark", List.of("Psychic"), List.of("Ghost")),
    POISON("Poison", List.of("Grass"), List.of("Bug"));

    private String name;
    private List<String> strengths;
    private List<String> weaknesses;

    Type(String name, List<String> strengths, List<String> weaknesses) {
        this.name = name;
        this.strengths = strengths;
        this.weaknesses = weaknesses;
    }

    public String getName() {
        return name;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }
}


