public class Soldier extends Person{
    private String name;
    private String weapon;
    private int starsOnShoulderStraps;

    public Soldier(String name) {
        this.name = name;
        this.weapon = "AK 47";
        this.starsOnShoulderStraps= 0;
    }

    public void execution(){
        System.out.println("I do different tasks");
    }

    @Override
    public void canFight() {
        System.out.println("I can fight");
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", starsOnShoulderStraps=" + starsOnShoulderStraps +
                '}';
    }
}
