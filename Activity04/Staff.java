package Activity04;

public class Staff extends Person {
    private String position;

    public Staff(String name, int id, String position) {
        super(name, id);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}