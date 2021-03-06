package hackerrank.datastructures.arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kazanture on 4/23/2017.
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
        IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
    }
}
