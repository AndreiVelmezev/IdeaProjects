import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Kate");
        names.add("Kirill");
        names.add("Anna");
        names.add("Kirill");
        names.add("Ilya");

        System.out.println(names);

    }
}
