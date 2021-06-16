import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringLeftRightSorter {


    private final ArrayList<String> leftStrings = new ArrayList<>();
    private final ArrayList<String> rightStrings = new ArrayList<>();


    StringLeftRightSorter(List<String> source, Predicate<String> how) {
        for (String current : source) {
            if (how.test(current)) leftStrings.add(current);
            else rightStrings.add(current);

        }

    }

    @Override
    public String toString() {

       return "Left: " +
               leftStrings +
               System.lineSeparator() +
               "Right: " +
               rightStrings +
               System.lineSeparator();

    }
}
