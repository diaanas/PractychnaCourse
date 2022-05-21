public class Soldier extends Person{
    private String name;
    private String weapon;
    private int starsOnShoulderStraps;
    private Commander commander;

    public Soldier(String name) {
        this.name = name;
        this.weapon = "AK 47";
        this.starsOnShoulderStraps= 0;
    }

    public void execution(){
        System.out.println("I do different tasks");
    }

    public void assignCommander(Commander commander){
        this.commander = commander;
    }
    @Override
    public void canFight() {
        if(this.commander != null){
            System.out.println("I can fight");
        }else{
            System.out.println("I can`t fight");
        }

    }

    @Override
    public void report() {
        System.out.println("I serve under this commander: " + this.commander);
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
