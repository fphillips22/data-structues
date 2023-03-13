import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


public class spellChecker {

    spellChecker(){

    }

    public void spellCheck(File processing, File words) throws IOException {
        String getTest = "";
        Scanner scanner = new Scanner(words);
        Scanner scanner2 = new Scanner(processing);
        HashSet<String> hs = new HashSet<>();
        while (scanner.hasNext()){
            hs.add(scanner.next().trim().toLowerCase());
        }
        while (scanner2.hasNextLine()){
            getTest = scanner2.nextLine();
            getTest = getTest.toLowerCase();
        }

        String[] arrayOf = getTest.replaceAll(("[\\p{Punct}&&[^_-]]+"), "").toLowerCase().split("(\\s+)");

        try {
            FileWriter myWriter = new FileWriter("/Users/fletcherphillips/Downloads/_232Lab5/testWrite.txt");
            for (String str : arrayOf){
                String[] broken;
                if (!str.matches(("[a-zA-Z]+"))){
                    broken = str.split("-");
                    for (String s : broken) {
                        if (hs.contains(s)) {
                            myWriter.write(str+" ");
                            break;
                        }
                    }
                }
                if (str.matches(("[a-zA-Z]+"))) {
                    if (hs.contains(str)) {
                        myWriter.write(str + " ");
                    }
                    if (!hs.contains(str)) {
                        myWriter.write("<" + str + "> ");
                    }
                }
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        spellChecker speller = new spellChecker();
        File dictionary = new File("/Users/fletcherphillips/Downloads/_232Lab5/words.txt");
        File tester = new File("/Users/fletcherphillips/Downloads/_232Lab5/test.txt");
        speller.spellCheck(tester, dictionary);
    }
}
