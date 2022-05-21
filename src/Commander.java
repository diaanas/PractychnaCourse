public class Commander extends Person{
    private String name;
    private String weapon;
    private int shoulderStraps;

    public Commander(String name) {
        this.name = name;
        this.weapon = "Gun";
        this.shoulderStraps = 1;
    }

    public void subordination(){
        System.out.println("I obey higher in rank");
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
        return "Commander{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", shoulderStraps=" + shoulderStraps +
                '}';
    }
}
