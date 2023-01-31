package bwg.tutorials.resttutorial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class interview {
//countWordOccurrences(List<String> linesOfFile) { }

    public Map<String, Integer> countWordOccurrences(List<String> linesOfFile) {
        Map<String, Integer> countMap = new HashMap<>();
        for(String line : linesOfFile) {
            Scanner scanner = new Scanner(line);
            while (scanner.hasNext()) { // added after interview
                String temp = scanner.next(); // check for hasNext() first
                if (countMap.containsKey(temp)) {
                    int thing = countMap.get(temp);
                    countMap.put(temp, ++thing);
                } else {
                    countMap.put(temp, 1);
                }
            }
        }
        return countMap;
    }
}
