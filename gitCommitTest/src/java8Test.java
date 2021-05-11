import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8Test {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        long abc = strings.stream().filter(names -> names.equals("abc")).count();

        System.out.println(abc);


    }

}
