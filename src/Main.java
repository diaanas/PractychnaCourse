import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> headquarters = new ArrayList<>();
        Soldier soldier1 = new Soldier("Soldier1");
        Soldier soldier2 = new Soldier("Soldier2");
        Soldier soldier3 = new Soldier("Soldier3");
        Soldier soldier4 = new Soldier("Soldier4");
        Soldier soldier5 = new Soldier("Soldier5");
        Soldier soldier6 = new Soldier("Soldier6");
        Commander commander1 = new Commander("Commander1");
        commander1.assign(soldier1);
        commander1.assign(soldier2);
        try{
            commander1.assign(soldier3);
        }catch (InvalidNumberException exception){
            System.out.println("Exception occured: " + exception.getMessage());
        }

        Commander commander2 = new Commander("Commander2");
        commander2.assign(soldier4);
        commander2.assign(soldier5);

        try{
            commander2.assign(soldier6);
        }catch (InvalidNumberException exception){
            System.out.println("Exception occured: " + exception.getMessage());
        }

        General general = new General("General1");
        general.assign(commander1);
        general.assign(commander2);



        headquarters.add(soldier1);
        soldier1.report();
        soldier1.canFight();
        headquarters.add(soldier2);
        soldier2.report();
        headquarters.add(soldier3);
        soldier3.report();
        headquarters.add(soldier4);
        soldier4.report();
        headquarters.add(soldier5);
        soldier5.report();
        headquarters.add(soldier6);
        soldier6.report();
        headquarters.add(commander1);
        commander1.report();
        headquarters.add(commander2);
        commander2.report();
        headquarters.add(general);


    }
}
