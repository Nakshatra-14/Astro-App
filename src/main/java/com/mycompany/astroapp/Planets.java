/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astroapp;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO;
import javax.swing.Icon;

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
    private String disease;
    private String varna;
    private String gemstone;
    private String info;
    private String mantra;
    private Image img;

    String natureContainer[] = { "movable", "fixed", "duel", "movable", "fixed", "duel", "movable", "fixed", "duel",
            "movable", "fixed", "duel" };
    String elementContainer[] = { "fire", "earth", "air", "water", "fire", "earth", "air", "water", "fire", "earth",
            "air", "water" };
    String[] planetaryGenders = {
            "Masculine", // Mars (Aries)
            "Feminine", // Venus (Taurus)
            "Neuter", // Mercury (Gemini)
            "Feminine", // Moon (Cancer)
            "Masculine", // Sun (Leo)
            "Neuter", // Mercury (Virgo)
            "Feminine", // Venus (Libra)
            "Masculine", // Mars (Scorpio)
            "Masculine", // Jupiter (Sagittarius)
            "Neuter", // Saturn (Capricorn)
            "Neuter", // Saturn (Aquarius)
            "Masculine" // Jupiter (Pisces)
    };

    public Planets(String name, int number) {
        this.name = name;
        this.number = number;
        String clr = switch (this.name) {
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

        // info
        this.info = getInfo(name);

        // friends
        friend = new ArrayList<>();
        addFriendInArrayList(name, friend);

        // //enemies
        enemies = new ArrayList<>();
        addEnemiesInArrayList(name, enemies);

        // //neutral
        neutral = new ArrayList<>();
        addNeutralInArrayList(name, neutral);

        deity = getDeity(this.name);

        ownSign = getOwnSign(this.name);

        disease = getDisease(this.name);

        varna = getVarna(this.name);

        gemstone = getGemstone(this.name);

        mantra = getMantra(this.name);
        
        img = getImage(this.name);

    }

    public Image getImage(String name) {
        Image img = null;
        String str = switch (this.name) {
            case "Sun" -> "resources\\sun.png";
            case "Moon" -> "resources\\moon.png";
            case "Mars" -> "resources\\mars.png";
            case "Mercury" -> "resources\\mercury.png";
            case "Jupiter" -> "resources\\jupiter.png";
            case "Venus" -> "resources\\venus.png";
            case "Saturn" -> "resources\\saturn.png";
            case "Rahu" -> "resources\\bg.jpg";
            case "Ketu" -> "resources\\bg.jpg";
            default -> null;
        };
        try {
            img = ImageIO.read(new File(str));
        } catch (Exception ex) {
            System.getLogger(Planets.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            ex.printStackTrace();
        }
        return img;
    }

    public String getDeity(String name) {
        return switch (name) {
            case "Sun" -> "Shiva";
            case "Moon" -> "Shiva";
            case "Mars" -> "Hanuman / Kartikeya";
            case "Mercury" -> "Vishnu or Narayan";
            case "Jupiter" -> "Brahma & Shiva";
            case "Venus" -> " Lakshmi";
            case "Saturn" -> "Bharina, Brahma, & Shiva";
            case "Rahu" -> "Adhishakti, Nag devata";
            case "Ketu" -> "Ganesh";
            default -> "invalid";
        };
    }

    public String getOwnSign(String name) {
        return switch (name) {
            case "Sun" -> "Leo";
            case "Moon" -> "Cancer";
            case "Mars" -> "Aries & Scorpio";
            case "Mercury" -> "Gemini, Virgo";
            case "Jupiter" -> "Sagittarius, Pisces";
            case "Venus" -> "Taurus, Libra";
            case "Saturn" -> "Capricorn & Aquarius";
            case "Rahu" -> "Aquarius";
            case "Ketu" -> "Scorpio";
            default -> "invalid";
        };
    }

    public String getDisease(String name) {
        return switch (name) {
            case "Sun" -> "Heart & Bone related problem, High fever, acidity";
            case "Moon" -> "Digestion problem, Anxiety, depression, and cold, cough, weak eye sight";
            case "Mars" -> "Blood infection, stomatch related problem disease, piles and blood pressure";
            case "Mercury" ->
                "Tooth decay, all problem related to nervous disorder, mental imbalance, defected speech, insomnia";
            case "Jupiter" -> "All deseases connected with liver, sinus, cancer, jaundice and enlargement of organs";
            case "Venus" -> "Skin related, allergies, sexual diseases";
            case "Saturn" -> "Cough, vision problem, gathiya, pain and chronic illness";
            case "Rahu" -> "Accident, leprosy, sudden injury, disease of foot and skin, mental disease";
            case "Ketu" -> "Disease from unknown cause, urinary disease, mental instability";
            default -> "invalid";
        };
    }

    public String getVarna(String name) {
        return switch (name) {
            case "Sun" -> "Kshatriya";
            case "Moon" -> "Vaishya";
            case "Mars" -> "Kshatriya";
            case "Mercury" -> "Vaishya";
            case "Jupiter" -> "Brahman";
            case "Venus" -> "Brahman";
            case "Saturn" -> "Shudra";
            case "Rahu" -> "Shudra";
            case "Ketu" -> "Shudra";
            default -> "invalid";
        };
    }

    public String getGemstone(String name) {
        return switch (name) {
            case "Sun" -> "Ruby, Garnet";
            case "Moon" -> "Pearl, Moon stone";
            case "Mars" -> "Red Coral";
            case "Mercury" -> "Emerald, onyx";
            case "Jupiter" -> "Yellow Sapphire & topaz";
            case "Venus" -> "Diamond or AD & opal";
            case "Saturn" -> "Blue Sapphire & Neeli";
            case "Rahu" -> "Gomed";
            case "Ketu" -> "Cats eye";
            default -> "invalid";
        };
    }

    public String getMantra(String name) {
        return switch (name) {
            case "Sun" -> "Om Hreem Hraum se Suryaye Namah";
            case "Moon" -> "Om Shraam Shreem Shraum se chandraye Namah";
            case "Mars" -> "Om Kraam Kreem Kraum se Bhaumaye Namah";
            case "Mercury" -> "Om Braam Breem Braum se Budhaye Namah";
            case "Jupiter" -> "Om Graam greem graum Se Guruve Namah";
            case "Venus" -> "Om Dhraam Dhreem Dhraum Se Shukraye Namah";
            case "Saturn" -> "Om Praam Preem Praum Se Shaniye Namah";
            case "Rahu" -> "Om Bhraam Bhreem Bhraum se Rahuve Namah";
            case "Ketu" -> "OM ke ketve Namah";
            default -> "invalid";
        };
    }

    public String getInfo(String name) {
        return switch (name) {
            case "Sun" ->
                "orange, father king, slow, high management honesty, politician, royality, goverment,leadership, confidence, fire, doctor, heart, head, acidity, bone, right eye";
            case "Moon" ->
                "white, mother, subconcious, mother love, emotions, fast driving, water or liquid, inner peace, food, water, kindness, nurse, mind and mental, broncrities, pneumonia, insomia, husband";
            case "Mars" ->
                "action and aggression, courage, general, motivation, younger brother, fights, physical strength, tough, adament, red, machinary, enginering, fever, diarrhea, brother, land, property";
            case "Mercury" ->
                "green greenery, talkative, inteligence, Concious mind, sometime childish, calculation, speech, diluted, book, writing, reading, skill, school, sense of humor, sensing smell, baby nature, baby items, \nsister, hand, ear, arm";
            case "Jupiter" ->
                "yellow, teacher, god, temple, fair complextion, phlegmatic and stout body,  higher study, growth (cancer), jandice";
            case "Venus" ->
                "firoji, soild, filter, purify, Good looking body, pleasing eyes, curly hairs, youthful look, skin disease, kidney, wife, everything that make feels pleasure";
            case "Saturn" ->
                "black, aged person, laubour, begger, servent, delay, bone, hair, farmer property, job, teeth, leg, slum area";
            case "Rahu" ->
                "online, gadgets, big thinking, focus anything, attention, fear, gas, research, poison, snake head, dart board, wind chimes, camera, hot drinks, upper portion of body, dirty";
            case "Ketu" ->
                "pale brown, fierce looking, dharmik and black complextion, yoga, isolation, meditation, small place, narrow, secret, detach, lower portion of body, nature, cyst, back pain, low pressure";
            default -> "Invalid";
        };
    }

    public void addFriendInArrayList(String name, ArrayList<String> al) {
        switch (name) {
            case "Sun" -> al.addAll(List.of("Moon", "Mars", "Jupiter"));
            case "Moon" -> al.addAll(List.of("Sun", "Mercury"));
            case "Mars" -> al.addAll(List.of("Sun", "Moon", "Jupiter"));
            case "Mercury" -> al.addAll(List.of("Sun", "Venus"));
            case "Jupiter" -> al.addAll(List.of("Sun", "Moon", "Mars"));
            case "Venus" -> al.addAll(List.of("Mercury", "Saturn"));
            case "Saturn" -> al.addAll(List.of("Mercury", "Venus"));
            case "Rahu" -> al.addAll(List.of("Venus", "Saturn"));
            case "Ketu" -> al.addAll(List.of("Mars", "Venus"));
        }
    }

    public void addEnemiesInArrayList(String name, ArrayList<String> al) {
        switch (name) {
            case "Sun" -> al.addAll(List.of("Venus", "Saturn"));
            case "Moon" -> al.addAll(List.of("None"));
            case "Mars" -> al.addAll(List.of("Mercury"));
            case "Mercury" -> al.addAll(List.of("Moon"));
            case "Jupiter" -> al.addAll(List.of("Mercury", "Venus"));
            case "Venus" -> al.addAll(List.of("Sun", "Moon"));
            case "Saturn" -> al.addAll(List.of("Sun", "Moon", "Mars"));
            case "Rahu" -> al.addAll(List.of("Sun", "Moon", "Mars"));
            case "Ketu" -> al.addAll(List.of("Sun", "Moon"));
        }
    }

    public void addNeutralInArrayList(String name, ArrayList<String> al) {
        switch (name) {
            case "Sun" -> al.addAll(List.of("Mercury"));
            case "Moon" -> al.addAll(List.of("Mars", "Jupiter", "Venus", "Saturn"));
            case "Mars" -> al.addAll(List.of("Venus", "Saturn"));
            case "Mercury" -> al.addAll(List.of("Mars", "Jupiter", "Saturn"));
            case "Jupiter" -> al.addAll(List.of("Saturn"));
            case "Venus" -> al.addAll(List.of("Mars", "Jupiter"));
            case "Saturn" -> al.addAll(List.of("Jupiter"));
            case "Rahu" -> al.addAll(List.of("Mercury", "Jupiter"));
            case "Ketu" -> al.addAll(List.of("Mercury", "Jupiter", "Saturn"));
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
            l.add(getPlanetName(i + 1));
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

    public static void add9PlanetsChartDetails(List<Planets> lst) {
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

    public String getFriend() {
        StringJoiner sj = new StringJoiner(", ");
        for (String s : friend)
            sj.add(s);
        return sj.toString();
    }

    public String getEnemies() {
        StringJoiner sj = new StringJoiner(", ");
        for (String s : enemies)
            sj.add(s);
        return sj.toString();
    }

    public String getNeutral() {
        StringJoiner sj = new StringJoiner(", ");
        for (String s : neutral)
            sj.add(s);
        return sj.toString();
    }

    public String getDeity() {
        return deity;
    }

    public String getOwnSign() {
        return ownSign;
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

    public String getMantra() {
        return mantra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planets{");
        sb.append("number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", nature=").append(nature);
        sb.append(", element=").append(element);
        sb.append(", gender=").append(gender);
        sb.append(", deity=").append(deity);
        sb.append(", friend=").append(friend);
        sb.append(", enemies=").append(enemies);
        sb.append(", neutral=").append(neutral);
        sb.append(", ownSign=").append(ownSign);
        sb.append(", disease=").append(disease);
        sb.append(", varna=").append(varna);
        sb.append(", gemstone=").append(gemstone);
        sb.append(", info=").append(info);
        sb.append(", mantra=").append(mantra);
        sb.append(", img=").append(img);
        sb.append('}');
        return sb.toString();
    }

    public Image getImg() {
        return img;
    }
}
