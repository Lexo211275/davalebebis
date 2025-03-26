//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.aslist(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List.<Integer> odds = nums
                .stream();
        List<Integer> nums = Arrays.aslist(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List.<Integer> odds = nums
                .stream()
                .map(n -> n * n)
                .forEach(n + (n + 1));
    }