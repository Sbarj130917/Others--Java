/**
 * name, sigil, motto as marked as final because are constant in the class, you cannot change it. This is reason there is no setters for these property
 * currentHead is mutable, you have setters
 * for displaying house there is toString method overrided which uses all getters
 */
public class GreatHouse {
    private final String name;
    private final String sigil;
    private final String motto;
    private String currentHead;

    public GreatHouse(String name, String sigil, String motto, String currentHead) {
        this.name = name;
        this.sigil = sigil;
        this.motto = motto;
        this.currentHead = currentHead;
    }

    public String getName() {
        return name;
    }

    public String getSigil() {
        return sigil;
    }

    public String getMotto() {
        return motto;
    }

    public String getCurrentHead() {
        return currentHead;
    }

    public void setCurrentHead(String currentHead) {
        this.currentHead = currentHead;
    }

    @Override
    public String toString() {
        return "GreatHouse{" +
                "name='" + getName() + '\'' +
                ", sigil='" + getSigil() + '\'' +
                ", motto='" + getMotto() + '\'' +
                ", currentHead='" + getCurrentHead() + '\'' +
                '}';
    }

    //sample usage
    public static void main(String[] args) {
        //create lannister house
        GreatHouse house = new GreatHouse("Lannister", "Lion", "Hear me roar!", "Tywin Lannister");
        //display all characteristic of lannister house
        System.out.println(house);
        //change head of house
        house.setCurrentHead("Jamie Lannister");
        //display updated house
        System.out.println(house);

    }
}
