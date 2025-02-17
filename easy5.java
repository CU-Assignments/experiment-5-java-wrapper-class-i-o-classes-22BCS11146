import java.util.ArrayList;

public class easy5 {
    public static void main(String[] args) {
        String[] numbers = { "10", "20", "30", "40", "50" };
        ArrayList<Integer> integerList = new ArrayList<>();

        for (String num : numbers) {
            integerList.add(Integer.parseInt(num));
        }

        int sum = 0;
        for (int num : integerList) {
            sum += num;
        }

        System.out.println("Sum of the integers: " + sum);
    }
}
