package gfx;

import java.io.*;
import java.util.*;

public class HighScoreLoader {
    private static SortedMap<String,Integer> scores;
    public static Map<String,Integer> highScores;
    public static int lowestScore;

    public static void loadingHighScores() {
        scores = new TreeMap<>();
        highScores = new LinkedHashMap<>();
        List<Map.Entry<String,Integer>> list;

        try (BufferedReader fileReader = new BufferedReader(new FileReader("resources/scores.txt"))) {
            String line;
            String[] arguments;
            StringBuilder sb = new StringBuilder();
            while ((line = fileReader.readLine()) != null){
                arguments = line.split(" ");
                if (arguments.length > 2){
                    sb.append(arguments[0] + " ");
                    sb.append(arguments[1]);
                    scores.put(sb.toString(), Integer.parseInt(arguments[2]));
                    sb.append("\r\n");
                } else {
                    scores.put(arguments[0], Integer.parseInt(arguments[1]));
                }
            }
        } catch (IOException ex) {
            System.out.println("Cannot read the file");
        }

        list = new ArrayList<>(scores.entrySet());
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

        if(list.size() > 9) {
            list.subList(0, 9);
        }

        for (Map.Entry<String, Integer> entry : list) {
            highScores.put(entry.getKey(), entry.getValue());
        }

        if (list.size() > 0) {
            lowestScore = list.get(list.size() - 1).getValue();
        }

    }

    public static void savingHighScores(String name, int score) {
        if (score >= lowestScore || highScores.size() < 9) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("resources/scores.txt", true))) {
                writer.println(name + " " + score);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
