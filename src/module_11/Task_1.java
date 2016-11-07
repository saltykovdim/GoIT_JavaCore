package module_11;


import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Task_1 {
    public static String readFile(String address) throws IOException {
        BufferedReader br = null;
        String result = null;
        try  {
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
            br.close();
            result = sb.toString();
        } catch (IOException e) {
            System.out.println(e);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        HashMap<String, String> mapWords = new HashMap<>();
        mapWords.put("Hell", "Hello");
        mapWords.put("Hel", "Hello");
        mapWords.put("Wo", "World");
        mapWords.put("Word", "World");
        Scanner scan = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter the path to the file.");
        String address = scan.next();
        String var = readFile(address);
        System.out.println("Original words to replace.");
        System.out.println(var);
        String[] l = var.split("\r\n");
        for (int i = 0; i < l.length; i++) {
            if (mapWords.containsKey(l[i])) {
                l[i] = mapWords.get(l[i]);
            }
        }
        System.out.println("The words after replace.");
        String newVar = l[0] + "\r\n";
        for (int i = 1; i < l.length; i++) {
            newVar += l[i] + "\r\n";
        }
        System.out.println(newVar);

    }
}
