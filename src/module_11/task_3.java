package module_11;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class task_3 {
    public static void writeFileReplaceWords(String var, String address) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(address))) {
            String[] l = var.split(" ");
            for (int i = 0; i < l.length; i++) {
                bw.append(l[i]);
                bw.append(" ");
            }
        } catch (IOException e1) {
            System.out.println("Can not write file.");
        }
    }

    public static String readFile(String address) throws IOException {
        String result = null;
        try {
            FileReader fileReader = new FileReader(address);
            BufferedReader br = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(" ");
                line = br.readLine();
            }
            result = sb.toString();
            br.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
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
        String[] l = var.split(" ");
        for (int i = 0; i < l.length; i++) {
            if (mapWords.containsKey(l[i])) {
                l[i] = mapWords.get(l[i]);
            }
        }
        var = l[0];
        for (int i = 1; i < l.length; i++) {
            var += l[i] + " ";
        }
        System.out.println("The words after replace.");
        System.out.println(var);
        writeFileReplaceWords(var, address);
    }
}