package nl.novi.array;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class ReadArray {

    public static void main(String[] args) {
        // write your code here
        String[] firstNames = {"Henk", "Piet", "Harry", "Sjaak", "Peter"};
        System.out.println("First my name was: " + firstNames[0]);

        // Array adjustment
        firstNames[0] = "Henriet";
        System.out.println("But now its " +
                firstNames[0]);

        // Array lenght
        int firstnamesLenght = firstNames.length;
        firstNames[firstnamesLenght - 1] = "laatste naam";
        System.out.println(firstnamesLenght);
        System.out.println(firstNames[firstnamesLenght - 1]);

        System.out.println(firstNames[4]);

        //Class array
        Voetbalclub ajax = new Voetbalclub("Ajax Amsterdam", "AFCA", 1902);
        Voetbalclub psv = new Voetbalclub("PSV Eindhoven", "PSV", 1903);
        Voetbalclub utrecht = new Voetbalclub("FC Utrecht", "030", 1970);
        Voetbalclub az = new Voetbalclub("AZ Alkmaar", "AZ", 1980);

        Voetbalclub[] clubs = {ajax, psv, utrecht, az};

        //Dit print niet echt iets uit
        System.out.println("Club op positie 0: " + clubs[0]);

        // Dat komt omdat clubs[0] het object teruggeeft. Als je van dat object de clubnaam wilt uitprinten, doe je dit:
        System.out.println("Clubnaam op positie 0: " + clubs[0].getNaam());

        // ArrayList (.get .size .set .add .remove .clear)
        List<String> firstnames = new ArrayList<>();
        firstnames.add("Nick");
        firstnames.add("Sjaak");
        firstnames.add("Mo");
        firstnames.add("Henk");

        // .get
        System.out.println(firstnames.get(0));
        // .size
        System.out.println("De laatste persoon in deze lijst is: " +
                firstnames.get(firstnames.size() - 1));
        // .set (index, string)
        firstnames.set(1, "Pieter");
        // .add (index, string)
        firstnames.add("Hans Kazan");
        // .remove
        firstnames.remove(1);
        // .clear
        firstnames.clear();

        Map<String, String> persons = new HashMap<>();
        persons.put("1", "Sjaak Polak");
        persons.put("2", "Coen Jansen");
        persons.put("3", "Hendrik El-Mecky");

        System.out.println("De persoon op nummer 1 is" +
                persons.get("1"));

        // For loop without index (FOR EACH)
        String[] cities = {"Zeist", "Burg-Haamstede", "Den Dolder", "soest"};

        for (String city : cities) {
            System.out.println(city);
        }

        // For loops with index
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]+"staat de postie op: " + i);
        }

        // While loop
        int amountOfVisitors = 0;
        while (amountOfVisitors <= 10) {
            System.out.println("Amount of visitors inside: " +
                    amountOfVisitors);
            amountOfVisitors++;
        }

        System.out.println("No more people aloud indside");

        amountOfVisitors = 100;
        do {
            System.out.println("Deze code wordt minimaal 1 keer uitgevoerd");
            System.out.println("Amount of people inside: " +
                    amountOfVisitors);
            amountOfVisitors++;
        } while (amountOfVisitors<=10);

        Map<Integer, String> deadlyVipers = new HashMap<>();
        // Ass some testdata
        deadlyVipers.put(3, "Black Mamba");
        deadlyVipers.put(2, "Sidewinder");
        deadlyVipers.put(1, "Snake Charmer");
        deadlyVipers.put(4, "California Mountain Snake");
        deadlyVipers.put(5, "Cottonmouth");
        deadlyVipers.put(6, "Copperhead");

        // Make iterator
        Iterator<Map.Entry<Integer, String>> iterator = deadlyVipers.entrySet().iterator();

        // Iterate over every key value in the HashMap
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> result = (Map.Entry<Integer, String>) iterator.next();
            System.out.println("Key: " + result.getKey() + " en value: " +
                    result.getValue());
        }
    }
}
