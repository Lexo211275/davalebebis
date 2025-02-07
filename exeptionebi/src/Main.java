import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("sheiyvanet pirveli: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("sheiyvanet meore: ");
//        int num2 = scanner.nextInt();
//
//        try {
//            int result = num1 / num2;
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("nulze gayofa vin gaswavla");
//        }
//
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("sheitvanet pirveli:");
//        String num1 = scanner.next();
//        try {
//            int num2 = Integer.parseInt(num1);
//            int res = 100 / num2;
//            System.out.println(res);
//        } catch (NumberFormatException e) {
//            System.out.println("ricxvi cade aba");
//        } catch (ArithmeticException e) {
//            System.out.println("fuf nuli");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("sheiyvanet ricxvi");
//        int num1 = scanner.next();
//        if(num1 < 0)
//        {
//
//        }
//        try
//        {
//            num1 < 0
//        }
        int number = -9; // ვამოწმებთ უარყოფით რიცხვზე
        try {
            int result = calculateSquareRoot(number);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("fuf" + e.getMessage());
        }
    }
}