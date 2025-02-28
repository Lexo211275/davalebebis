import java.util.ArrayList;
import java.util.Random;

public class Main {
      public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random random = new Random();
//        while (true) {
//            int num = random.nextInt(50);
//            numbers.add(num);
//            if (num == 40) {
//                break;
//            }
//        }
//        System.out.println("sigrdze: " + numbers.size());
//        System.out.println(String.join(", ", numbers.stream()
//                .map(String::valueOf)
//                .toArray(String[]::new)));
//        numbers.removeIf(n -> n % 2 == 0);
//        System.out.println("uluwo" + String.join(", ", numbers.stream()
//                .map(String::valueOf)
//                .toArray(String[]::new)));
//    }
//    public static void printListBeautifully(ArrayList<Integer> list)
//    {
//        System.out.print("List of {");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//            if (i < list.size() - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("}");
//    }
//            int[] numbers = new int[5];
//            Random random = new Random();
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = random.nextInt(51);
//            }
//            ArrayList<Integer> numberList = new ArrayList<>();
//            for (int num : numbers) {
//                numberList.add(num);
//            }
//            int maxNumber = numberList.get(0);
//            int maxIndex = 0;
//            for (int i = 1; i < numberList.size(); i++) {
//                if (numberList.get(i) > maxNumber) {
//                    maxNumber = numberList.get(i);
//                    maxIndex = i;
//                }
//            }
//            System.out.println("aray: " + numberList);
//            System.out.println("maximaluri: " + maxNumber);
//            System.out.println("maximaluris indexi: " + maxIndex);
//        }
//    }
          Library library = new Library();
          library.populateList("books.txt"); // books.txt ფაილიდან მონაცემების ჩატვირთვა
          for (Book book : library.getBooks()) {
              System.out.println(book);
          }
      }

}