import java.util.Comparator;

public class PetsComparator implements Comparator<Pets> {
    @Override

    public int compare(Pets o1, Pets o2) {
        return o2.getName().length() - o1.getName().length();

    }
}
