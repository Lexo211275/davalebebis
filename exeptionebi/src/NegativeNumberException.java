public class NegativeNumberException extends Exception
{
    public void setNumber(int number) {
        this.number = number;
    }

    public NegativeNumberException(String message)
    {
        super(message);
    }
    public class Main {
        public static void checkNumber(number) throws NegativeNumberException {
            if (number < 0) {
                throw new NegativeNumberException("fuf" + number);
            } else {
                System.out.println("oke" + number);
            }
        }
    }
}
