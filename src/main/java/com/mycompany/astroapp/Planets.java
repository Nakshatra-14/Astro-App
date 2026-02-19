/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astroapp;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author naksh
 */
public class Planets {

    private int number;
    private String name;
    private String color;
    private String nature;
    private String element;
    private String gender;
    private String deity;
    private ArrayList<String> friend;
    private ArrayList<String> enemies;
    private ArrayList<String> neutral;
    private String ownSign;
    private String animalAndBird;
    private String disease;
    private String varna;
    private String gemstone;
    private String info;

    String natureContainer[] = {"movable", "fixed", "duel", "movable", "fixed", "duel", "movable", "fixed", "duel", "movable", "fixed", "duel"};
    String elementContainer[] = {"fire", "earth", "air", "water", "fire", "earth", "air", "water", "fire", "earth", "air", "water"};
    String[] planetaryGenders = {
    "Masculine", // Mars (Aries)
    "Feminine",  // Venus (Taurus)
    "Neuter",    // Mercury (Gemini)
    "Feminine",  // Moon (Cancer)
    "Masculine", // Sun (Leo)
    "Neuter",    // Mercury (Virgo)
    "Feminine",  // Venus (Libra)
    "Masculine", // Mars (Scorpio)
    "Masculine", // Jupiter (Sagittarius)
    "Neuter",    // Saturn (Capricorn)
    "Neuter",    // Saturn (Aquarius)
    "Masculine"  // Jupiter (Pisces)
    };

    public Planets(String name, int number) {
        this.name = name;
        this.number = number;
        String clr = switch(this.name)
        {
            case "Sun" -> "Orange";
            case "Moon" -> "White";
            case "Mars" -> "Red";
            case "Mercury" -> "Green";
            case "Jupiter" -> "Yellow";
            case "Venus" -> "Firoji";
            case "Saturn" -> "Black";
            case "Rahu" -> "Grey";
            case "Ketu" -> "Pale Brown";
            default -> "invalid";
        };
        this.color = clr;
        this.nature = natureContainer[number - 1];
        this.element = elementContainer[number - 1];
        this.gender = planetaryGenders[number - 1];

        String str = switch(name)
        {
            case "Sun" -> "orange, father king, slow, \nhonesty, politician,royality, \nfire, doctor, heart, head, acidity, \nright eye";
            case "Moon" -> "white, mother, food, water, \nkindness, nurse, mind and mental, \nbroncrities, pneumonia, insomia, husband";
            case "Mars" -> "general, tough, adament, red,\nmachinary, enginering, fever, \ndiarrhea, brother, land, property";
            case "Mercury" -> "green greenery, talkative, \ndiluted, book, writing, reading, \nschool, baby nature, baby items, \nsister, hand, ear, arm";
            case "Jupiter" -> "yellow, teacher, god, temple, higher \nstudy, growth (cancer), jandice";
            case "Venus" -> "firoji, soild, filter, purify, \nskin disease, kidney, wife";
            case "Saturn" -> "black, aged person, laubour, \nbegger, servent, delay, bone, hair, \nfarmer property, job, teeth, leg";
            case "Rahu" -> "online, gadgets, big thinking, \nfocus anything, dart board, \nwind chimes, camera, hot drinks, \nupper portion of body, dirty";
            case "Ketu" -> "pale brown, small place, narrow, \nsecret, detach, lower portion of body, \nnature, meditation, yoga, cyst, \nback pain, low pressure";
            default -> "Invalid";
        };
        this.info = str;
        
        //friends
        addFriendInArrayList(name, friend);

        //enemies
        addEnemiesInArrayList(name, enemies);

        //neutral
        addNeutralInArrayList(name, neutral);
    }

    // public String getDeity(String name)
    // {
    //     return switch (name) {
    //         case "Sun" -> "Shiva";
    //         case "Moon" -> "White";
    //         case "Mars" -> "Red";
    //         case "Mercury" -> "Green";
    //         case "Jupiter" -> "Yellow";
    //         case "Venus" -> "Firoji";
    //         case "Saturn" -> "Black";
    //         case "Rahu" -> "Grey";
    //         case "Ketu" -> "Pale Brown";
    //         default -> "invalid";
    //     };
    // }

    // public String getOwnSign(String name)
    // {
    //     return switch (name) {
    //         case "Sun" -> "Orange";
    //         case "Moon" -> "White";
    //         case "Mars" -> "Red";
    //         case "Mercury" -> "Green";
    //         case "Jupiter" -> "Yellow";
    //         case "Venus" -> "Firoji";
    //         case "Saturn" -> "Black";
    //         case "Rahu" -> "Grey";
    //         case "Ketu" -> "Pale Brown";
    //         default -> "invalid";
    //     };
    // }

    // public String getAnimalAndBirds(String name)
    // {
    //     return switch (name) {
    //         case "Sun" -> "Orange";
    //         case "Moon" -> "White";
    //         case "Mars" -> "Red";
    //         case "Mercury" -> "Green";
    //         case "Jupiter" -> "Yellow";
    //         case "Venus" -> "Firoji";
    //         case "Saturn" -> "Black";
    //         case "Rahu" -> "Grey";
    //         case "Ketu" -> "Pale Brown";
    //         default -> "invalid";
    //     };
    // }

    // public String getDisease(String name)
    // {
    //     return switch (name) {
    //         case "Sun" -> "Orange";
    //         case "Moon" -> "White";
    //         case "Mars" -> "Red";
    //         case "Mercury" -> "Green";
    //         case "Jupiter" -> "Yellow";
    //         case "Venus" -> "Firoji";
    //         case "Saturn" -> "Black";
    //         case "Rahu" -> "Grey";
    //         case "Ketu" -> "Pale Brown";
    //         default -> "invalid";
    //     };
    // }

    // public String getVarna(String name)
    // {
    //     return switch (name) {
    //         case "Sun" -> "Orange";
    //         case "Moon" -> "White";
    //         case "Mars" -> "Red";
    //         case "Mercury" -> "Green";
    //         case "Jupiter" -> "Yellow";
    //         case "Venus" -> "Firoji";
    //         case "Saturn" -> "Black";
    //         case "Rahu" -> "Grey";
    //         case "Ketu" -> "Pale Brown";
    //         default -> "invalid";
    //     };
    // }

    // public String getGemstone(String name)
    // {
    //     return switch (name) {
    //         case "Sun" -> "Orange";
    //         case "Moon" -> "White";
    //         case "Mars" -> "Red";
    //         case "Mercury" -> "Green";
    //         case "Jupiter" -> "Yellow";
    //         case "Venus" -> "Firoji";
    //         case "Saturn" -> "Black";
    //         case "Rahu" -> "Grey";
    //         case "Ketu" -> "Pale Brown";
    //         default -> "invalid";
    //     };
    // }


    public void addFriendInArrayList(String name, ArrayList<String> al)
    {
            switch (name) {
            case "Sun" -> al.addAll(Arrays.asList("Moon", "Mars", "Jupiter"));
            case "Moon" -> al.addAll(Arrays.asList("Sun", "Mercury"));
            case "Mars" -> al.addAll(Arrays.asList("Sun", "Moon", "Jupiter"));
            case "Mercury" -> al.addAll(Arrays.asList("Sun", "Venus"));
            case "Jupiter" -> al.addAll(Arrays.asList("Sun", "Moon", "Mars"));
            case "Venus" -> al.addAll(Arrays.asList("Mercury", "Saturn"));
            case "Saturn" -> al.addAll(Arrays.asList("Mercury", "Venus"));
            case "Rahu" -> al.addAll(Arrays.asList("Venus", "Saturn"));
            case "Ketu" -> al.addAll(Arrays.asList("Mars", "Venus"));
            }
    }

    public void addEnemiesInArrayList(String name, ArrayList<String> al)
    {
            switch (name) {
            case "Sun" -> al.addAll(Arrays.asList("Venus", "Saturn"));
            case "Moon" -> al.addAll(Arrays.asList("None"));
            case "Mars" -> al.addAll(Arrays.asList("Mercury"));
            case "Mercury" -> al.addAll(Arrays.asList("Moon"));
            case "Jupiter" -> al.addAll(Arrays.asList("Mercury", "Venus"));
            case "Venus" -> al.addAll(Arrays.asList("Sun", "Moon"));
            case "Saturn" -> al.addAll(Arrays.asList("Sun", "Moon", "Mars"));
            case "Rahu" -> al.addAll(Arrays.asList("Sun", "Moon", "Mars"));
            case "Ketu" -> al.addAll(Arrays.asList("Sun", "Moon"));
            }
    }

    public void addNeutralInArrayList(String name, ArrayList<String> al)
    {
            switch (name) {
            case "Sun" -> al.addAll(Arrays.asList("Mercury"));
            case "Moon" -> al.addAll(Arrays.asList("Mars", "Jupiter", "Venus", "Saturn"));
            case "Mars" -> al.addAll(Arrays.asList("Venus", "Saturn"));
            case "Mercury" -> al.addAll(Arrays.asList("Mars", "Jupiter", "Saturn"));
            case "Jupiter" -> al.addAll(Arrays.asList("Saturn"));
            case "Venus" -> al.addAll(Arrays.asList("Mars", "Jupiter"));
            case "Saturn" -> al.addAll(Arrays.asList("Jupiter"));
            case "Rahu" -> al.addAll(Arrays.asList("Mercury", "Jupiter"));
            case "Ketu" -> al.addAll(Arrays.asList("Mercury", "Jupiter", "Saturn"));
            }
    }

    public static String getPlanetName(int n) {
        return switch (n) {
            case 1 -> "Sun";
            case 2 -> "Moon";
            case 3 -> "Mars";
            case 4 -> "Mercury";
            case 5 -> "Jupiter";
            case 6 -> "Venus";
            case 7 -> "Saturn";
            case 8 -> "Rahu";
            case 9 -> "Ketu";
            default -> "invalid";
        };
    }

    public static String getPlanetColorString(String name) {
        return switch (name) {
            case "Sun" -> "Orange";
            case "Moon" -> "White";
            case "Mars" -> "Red";
            case "Mercury" -> "Green";
            case "Jupiter" -> "Yellow";
            case "Venus" -> "Firoji";
            case "Saturn" -> "Black";
            case "Rahu" -> "Grey";
            case "Ketu" -> "Pale Brown";
            default -> "invalid";
        };
    }

    public static Color getPlanetColour(String name) {
        return switch (name) {
            case "Sun" -> Color.ORANGE;
            case "Moon" -> Color.WHITE;
            case "Mars" -> Color.RED;
            case "Mercury" -> Color.GREEN;
            case "Jupiter" -> Color.YELLOW;
            case "Venus" -> new Color(0, 168, 173);
            case "Saturn" -> Color.BLACK;
            case "Rahu" -> Color.GRAY;
            case "Ketu" -> new Color(152, 118, 84);
            default -> Color.pink;
        };
    }

    public static String[] getPlanetNameArray() {
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            l.add(getPlanetName(i+1));
        return l.toArray(new String[l.size()]);
    }


    public static String getBodypartChartName(int n) {
        return switch (n) {
            case 1 -> "Head";
            case 2 -> "neck";
            case 3 -> "arm";
            case 4 -> "chest";
            case 5 -> "lower chest";
            case 6 -> "Stomach";
            case 7 -> "abdomen";
            case 8 -> "genital";
            case 9 -> "thigh";
            case 10 -> "knee";
            case 11 -> "lower leg";
            case 12 -> "feet";
            default -> "invalid";
        };
    }

    public static String getConstilationChartName(int n) {
        return switch (n) {
            case 1 -> "Aris";
            case 2 -> "Tarus";
            case 3 -> "Gemini";
            case 4 -> "Cancer";
            case 5 -> "Leo";
            case 6 -> "Virgo";
            case 7 -> "Libra";
            case 8 -> "scorpio";
            case 9 -> "sagitarus";
            case 10 -> "capricorn";
            case 11 -> "Aqurius";
            case 12 -> "Pisces";
            default -> "invalid";
        };
    }
    
    public static void add9PlanetsChartDetails(List<Planets> lst)
    {
        lst.add(new Planets(Planets.getPlanetName(1), 1));
        lst.add(new Planets(Planets.getPlanetName(2), 2));
        lst.add(new Planets(Planets.getPlanetName(3), 3));
        lst.add(new Planets(Planets.getPlanetName(4), 4));
        lst.add(new Planets(Planets.getPlanetName(5), 5));
        lst.add(new Planets(Planets.getPlanetName(6), 6));
        lst.add(new Planets(Planets.getPlanetName(7), 7));
        lst.add(new Planets(Planets.getPlanetName(8), 8));
        lst.add(new Planets(Planets.getPlanetName(9), 9));
    }

    public static void addPlanetsChartDetails(List<Planets> lst) {
                lst.add(new Planets(Planets.getPlanetName(3), 1));
                lst.add(new Planets(Planets.getPlanetName(6), 2));
                lst.add(new Planets(Planets.getPlanetName(4), 3));
                lst.add(new Planets(Planets.getPlanetName(2), 4));
                lst.add(new Planets(Planets.getPlanetName(1), 5));
                lst.add(new Planets(Planets.getPlanetName(4), 6));
                lst.add(new Planets(Planets.getPlanetName(6), 7));
                lst.add(new Planets(Planets.getPlanetName(3), 8));
                lst.add(new Planets(Planets.getPlanetName(5), 9));
                lst.add(new Planets(Planets.getPlanetName(7), 10));
                lst.add(new Planets(Planets.getPlanetName(7), 11));
                lst.add(new Planets(Planets.getPlanetName(5), 12));
        }

        public static String[] getPlanetNameChartStringArray(List<Planets> lst) {
                ArrayList<String> l = new ArrayList<>();
                for (int i = 0; i < 12; i++)
                        l.add(lst.get(i).getName());
                return l.toArray(new String[lst.size()]);
        }

    
    @Override
    public String toString() {
        return "Planets [number=" + number + ", name=" + name + ", color=" + color + ", nature=" + nature + ", element="
                + element + ", info = " + info +"]\n";
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getNature() {
        return nature;
    }

    public String getElement() {
        return element;
    }

    public String getInfo() {
        return info;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<String> getFriend() {
        return friend;
    }

    public ArrayList<String> getEnemies() {
        return enemies;
    }

    public ArrayList<String> getNeutral() {
        return neutral;
    }

    public String getDeity() {
        return deity;
    }

    public String getOwnSign() {
        return ownSign;
    }

    public String getAnimalAndBird() {
        return animalAndBird;
    }

    public String getDisease() {
        return disease;
    }

    public String getVarna() {
        return varna;
    }

    public String getGemstone() {
        return gemstone;
    }
}

