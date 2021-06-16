
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(new StringLeftRightSorter(
                Arrays.asList("How much wood"
                        , "would a woodchuck chuck"
                        , "if a woodchuck"
                        , "could chuck wood")
                , subject -> subject.contains("ould"))); // поэкспериментировать с критериями
    }
}
