public class Pilot extends Person {

    private Rank rank;
    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        super(name);
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String flyPlane() {
        return "We are in the air";
    }
}
