package module_11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_2 {
    public static String writeFileReplaceWords(Map<String, String> mapWords, String var, String address) throws IOException {
        String result = null;
        String[] l = null;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(address))) {
            l = var.split(" ");
            for (int i = 0; i < l.length; i++) {
                if (mapWords.containsKey(l[i])) {
                    l[i] = mapWords.get(l[i]);
                }
                bw.append(l[i]);
                bw.append(" ");
            }
        } catch (IOException e1) {
            System.out.println("Can not write file.");
        }
        result = readFile(address);
        return result;
    }

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
                sb.append(line);
                sb.append(" ");
                line = br.readLine();
            }
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
        String newVar = writeFileReplaceWords(mapWords, var, address);
        System.out.println("Words after replacement.");
        System.out.println(newVar);
    }
}


