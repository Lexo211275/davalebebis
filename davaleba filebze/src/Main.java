import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String poem = """
                შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,
                კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;
                კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,
                ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.
                """;

        try (FileWriter writer = new FileWriter("poem.txt")) {
            writer.write(poem);
            System.out.println("სტროფი წარმატებით ჩაიწერა ფაილში!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName = "poem.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("raodenoba" + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName2 = "poem.txt";
        Scanner scanner = new Scanner(System.in);
        String searchWord = scanner.nextLine().trim();

        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (found)
        {
            System.out.println( searchWord + "yep");
        }
        else
        {
            System.out.println(searchWord + "nope");
        }
        scanner.close();
        String text = "Assure polite his real and other figures though. Day age advantages\n"
                + "and sufficient eating expression traveling. Of on am father by agreed\n"
                + "supply rather either. Own handsome delicate property mistresses her\n"
                + "end appetite. Mean are sons too sold nor said. Son share three men\n"
                + "power by you. Now merits wonder effect garret own.";
        try (FileWriter writer = new FileWriter("file1.txt")) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text2 = "Assure polite his real and other figures though. Day age advantages\n"
                + "and sufficient eating expression traveling. Of on am father by agreed\n"
                + "supply rather either. Own handsome delicate property mistresses her\n"
                + "end appetite. Mean are sons too sold nor said. Son share three men\n"
                + "power by you. Now merits wonder effect garret own.";
        String upperText = text2.toUpperCase();
        try (FileWriter writer = new FileWriter("file2.txt")) {
            writer.write(upperText);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String outputFile = "merged.txt";
        try (FileWriter writer = new FileWriter(outputFile);
             BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            writer.write("First File\n");
            writeFileContent(writer, reader1);
            writer.write("Second File\n");
            writeFileContent(writer, reader2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeFileContent(FileWriter writer, BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
        }
    }
}