public class SquareRootCalculator
{
    public static double calculateSquareRoot(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("fuf ricxvi " + number);
        }
        return Math.sqrt(number);
    }
}
