import java.util.ArrayList;
import java.util.List;

public class General extends Person {
    private String name;
    private String weapon;
    private int shoulderStraps;
    private List<Commander> commanders ;

    public General(String name) {
        this.name = name;
        this.weapon = "Saber";
        this.shoulderStraps = 3;
        commanders = new ArrayList<>();
    }

    public void command(){
        System.out.println("I command soldiers and commanders");
    }


    @Override
    public void canFight() {
        System.out.println("I can fight");
    }


    public void assign(Commander commander) throws InvalidNumberException{
        if(this.commanders.size() > 2){
            throw new InvalidNumberException("Impossible to add");
        }else {
            this.commanders.add(commander);
            commander.assignGeneral(this);
        }
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
