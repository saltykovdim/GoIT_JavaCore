package module_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class task_4 {
    public static String readFile(String address) throws IOException {
        BufferedReader br = null;
        String result = null;
        try {
            FileReader fileReader = new FileReader(address);
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                if (!line.equals("pop")) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }
                line = br.readLine();
            }

            result = sb.toString();
        } catch (IOException e) {
            System.out.println(e);
        }
        return result;
    }

    public static int checkWord(String word, String address) throws IOException {
        String var = readFile(address);
        int amount = 0;
        String[] temp = var.split("\r\n");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals(word)) {
                amount++;
            }
        }
        return amount;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the file.");
        String adress = scanner.nextLine();
        System.out.println("Enter the word to the check.");
        String word = scanner.nextLine();
        scanner.close();
        System.out.println(checkWord(word, adress));

    }
}
