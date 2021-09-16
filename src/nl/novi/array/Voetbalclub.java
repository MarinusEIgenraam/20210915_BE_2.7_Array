package nl.novi.array;

public class Voetbalclub {
    private String naam;
    private String afkorting;
    private int oprichtingsjaar;

    public Voetbalclub(String naam, String afkorting, int oprichtingsjaar) {
        this.naam = naam;
        this.afkorting = afkorting;
        this.oprichtingsjaar = oprichtingsjaar;
    }
    // Getters
    public String getNaam() {
        return naam;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public int getOprichtingsjaar() {
        return oprichtingsjaar;
    }

    // Setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    public void setOprichtingsjaar(int oprichtingsjaar) {
        this.oprichtingsjaar = oprichtingsjaar;
    }

    // Constructor
    public Voetbalclub(String naam) {
        this.naam = naam;
    }

}