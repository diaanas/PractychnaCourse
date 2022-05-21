public class General extends Person {
    private String name;
    private String weapon;
    private int shoulderStraps;

    public General(String name) {
        this.name = name;
        this.weapon = "Saber";
        this.shoulderStraps = 3;
    }

    public void command(){
        System.out.println("I command soldiers and commanders");
    }


    @Override
    public void canFight() {
        System.out.println("I can fight");
    }

    @Override
    public String toString() {
        return "General{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", shoulderStraps=" + shoulderStraps +
                '}';
    }
}
