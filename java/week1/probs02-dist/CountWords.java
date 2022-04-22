// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;


public class CountWords {

    static String FILENAME;
    static String FILEOutput;
    static HashMap<String,Set<Integer>> wordCount = new HashMap<String,Set<Integer>>();

    public static void main(String[] args) {


        try {

            FILENAME = args[0];
            FILEOutput = args[1];
            StringBuilder buffer;
            int lineNumber = 1;
            try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
                String strCurrentLine;
                buffer = new StringBuilder();

                //read from file and store words and corresponding lines in wordCount
                while ((strCurrentLine = br.readLine()) != null) {

                    String[] words = strCurrentLine.split("\\W+");
                    Arrays.sort(words);

                        for (String word : words) {

                            word = word.toLowerCase();


                            if (wordCount.containsKey(word)) {
                                wordCount.get(word).add(lineNumber);
                            } else {
                                if(word.matches("[a-zA-Z]+$")) {
                                    Set<Integer> values = new TreeSet<>();
                                    values.add(lineNumber);
                                    wordCount.put(word, values);
                                }
                            }
                            buffer.append(word + ": line(s)" + wordCount.get(word) + "\n");

                        }

                        lineNumber++;

                }
            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            }

            //sort wordCount by keys, iterate through and write in new file

            FileWriter fw = new FileWriter(FILEOutput);
            List keys = new ArrayList<>(wordCount.keySet());
            Collections.sort(keys);
            for (Object key : keys) {

                fw.write(key + ": line(s) " + wordCount.get(key).toString());
                fw.write("\n");
                fw.flush();

        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Two filenames are required");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


};

