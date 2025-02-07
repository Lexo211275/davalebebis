public class Main {
    public static void main(String[] args) {
//        String string = "Hello World";
//        int charebi = 0;
//        for (int i = 0; i < string.length(); i++)
//        {
//            if(!(" " == string.charAt(i)))
//            {
//                charebi++;
//            }
//        }
        String data = "me var data";
                for(int i = 0; i < data.length(); i++)
                {
                    if(data.charAt(i) == " ")
                    {
                        for(int j = 0; j <= i; j++)
                        {
                            data.charAt(i) == data.charAt(j);
                        }
                    }
                }

    }
}