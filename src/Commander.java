import java.util.ArrayList;
import java.util.List;

public class Commander extends Person{
    private String name;
    private String weapon;
    private int shoulderStraps;
    private General general;
    private List<Soldier> soldiers;

    public Commander(String name) {
        this.name = name;
        this.weapon = "Gun";
        this.shoulderStraps = 1;
        soldiers = new ArrayList<>();
    }

    public void subordination(){
        System.out.println("I obey higher in rank");
    }

    public void assign(Soldier soldier)throws InvalidNumberException{
        if(this.soldiers.size() >=3){
            throw new InvalidNumberException("Impossible to add");
        }else {
            this.soldiers.add(soldier);
            soldier.assignCommander(this);
        }
    }


    public void assignGeneral(General general){
        this.general = general;
    }

    @Override
    public void canFight() {
        if(this.general != null){
            System.out.println("I can fight");
        }else{
            System.out.println("I can`t fight");
        }
    }

    @Override
    public void report() {
        System.out.println("I serve under this general: " + this.general);
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
