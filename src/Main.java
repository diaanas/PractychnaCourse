import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> headquarters = new ArrayList<>();
        headquarters.add(new Soldier("Soldier1"));
        headquarters.add(new Soldier("Soldier2"));
        headquarters.add(new Soldier("Soldier3"));
        headquarters.add(new Soldier("Soldier4"));
        headquarters.add(new Soldier("Soldier5"));
        headquarters.add(new Soldier("Soldier6"));
        headquarters.add(new Commander("Commander1"));
        headquarters.add(new Commander("Commander2"));
        headquarters.add(new General("General1"));
    }
}
