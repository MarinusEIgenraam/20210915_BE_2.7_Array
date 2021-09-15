package nl.novi.array;

public class ReadArray {

    public static void main(String[] args) {
	// write your code here
        String[] firstNames = {"Henk", "Piet", "Harry", "Sjaak"};
        System.out.println("First my name was: " + firstNames[0]);

        firstNames[0] = "Henriet";
        System.out.println("But now its " +
                firstNames[0]);
    }
}
