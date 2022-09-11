public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String passengerName) {
        this.name = passengerName;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int bags) {
        this.numberOfBags = bags;
    }
}
