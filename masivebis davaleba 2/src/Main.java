import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        Scanner cin = new Scanner(System.in);
//        int[] arai = ( 1,3,4,7,5);
//        boolean nuli = true;
//        while (true)
//        {
//            for (int i = 0; i < arai.length; i++)
//            {
//                System.out.println(arai[i]);
//                if(arai[i] != 0)
//                {
//                    nuli = false;
//                }
//            }
//            System.out.println();
//            if(nuli) {
//                break;
//            }
//            int axali = cin.nextInt();
//            for(int j = 0; j < arai.length; j++)
//            {
//                if(axali == arai[j])
//                {
//                    arai[j]  = 0;
//                    break;
//                }
//            }
//            System.out.println();
//            nuli = true;
//        }
//    }
        int[] fasi = {8,3,2,5,1,5};
        int minimaluri = fasi[0];
        int bevri = fasi[0];
        for(int i = 0; i < fasi.length; i++)
        {
            if(fasi[i] < minimaluri) {
                minimaluri = fasi[i];
            }
            if(fasi[i] < bevri)
            {
                bevri = fasi[i]
            }
        }
        System.out.println(minimaluri);
        System.out.println(bevri);
}