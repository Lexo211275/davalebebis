import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //1)b; 2)c; 3)d; 4)c; 5)d; 6)c; 7); 8)a; 9)a; 10)c; 11)c; 12)c; 13)a; 14)a; 15)b;
//        int[] wignebi = {1, 5, 9, 2, 10, 7};
//        int max = wignebi[0];
//        int min = 0;
//        for (int i = 0; i < wignebi.length; i++) {
//            if (min <= wignebi[i]) {
//                min = wignebi[i];
//            }
//            if (max >= wignebi[i]) {
//                max = wignebi[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//        for(int i = 0; i <= 100; i++)
//        {
//            if(i % 35 == 0)
//            {
//                System.out.println("HEYHOW");
//            }
//            else if(i % 5 == 0)
//            {
//                System.out.println("HEY");
//            }
//            else if(i % 7 == 0)
//            {
//                System.out.println("HOW");
//            }
//       Scanner scanner = new Scanner(System.int)
//        Random randr = new Random[];
//       int rig = scanner.nextInt();
//       int svet = scanner.nextInt();
//       int[][] arai = new int[rig][svet];
//       for(int i = 0; i < rig; i++)
//       {
//           for(int j = 0; j<svet; j++)
//           {
//               arai[i][j] = randr.nextInt(91);
//           }
//       }
//       for(int i = 0; i < rig; i++)
//       {
//           for(int j = 0; j < svet; j++)
//           {
//               System.out.println([i][j]);
//           }
//           System.out.println();
//       }
//       int min = arai[0][0];
//       int max = arai[0][0];
//       int minim = 0;
//        int maxim = 0;
//        int minimo = 0;
//        int maximo = 0;
//        for(int i = 0; i < rig; i++)
//        {
//            for(int j = 0; j < svet; j++)
//            {
//                if(arai[i][j] < min)
//                {
//                    min = arai[i][j];
//                    minim = i;
//                    maxim = j;
//                }
//                if(arai[i][j] > max)
//                {
//                    max = arai[i][j];
//                    minimo = i;
//                    maximo = j;
//                }
//            }
//        }
//        System.out.println(minim);
//        System.out.println(maxim);
//        System.out.println(minimo);
//        System.out.println(maximo);
//        Scanner scanner = new Scanner(System.in)
//                Random randr = new Random();
//        int rands = scanner.nextInt();
//        int[][] arai = new int[rands][rands];
//        for(int i = 0; i < rands; i++)
//        {
//            for(int j = 0; j < rands; j++)
//            {
//                arai[i][j] = randr.nextInt(91);
//            }
//        }
//        int jam = 0;
//        for (int i = 0; i < rands; i++)
//        {
//            jam+=arai[i][i];
//            jam+=arai[i][rands - i - 1];
//        }
//        if(rands % 2 !=0)
//        {
//            jam-=arai[rands / 2][rands /2];
//        }
//        System.out.println(jam);
//        Scanner scanner = new Scanner(System.in);
//        Random randr = new Random();
//        int rig = scanner.nextInt() ;
//        int svet = scanner.nextInt() ;
//        int[][] arr = new int[rig][svet] ;
//        for (int i = 0; i < rig; i++ )
//        {
//            for(int j = 0; j < rig; j++)
//            {
//                arr[i][j] = randr.nextInt(91);
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        int [][] meorearr = new int[svet][rig];
//        for (int i = 0; i < rig; i++)
//        {
//            for(int j = 0; j < svet; j++)
//            {
//                meorearr[j][rig - i - 1] = arr[i][j];
//            }
//        }
//        for (int i = 0 ; i < svet ; i++)
//        {
//            for(int j = 0; j < rig; j++)
//            {
//                System.out.print(meorearr[i][j]);
//            }
//        }
    }
}