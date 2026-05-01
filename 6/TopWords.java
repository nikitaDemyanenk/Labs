import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "text.txt";
        File file = new File(filePath);
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        while (scanner.hasNext()) {
            String rawWord = scanner.next();
            String word = rawWord.toLowerCase().replaceAll("[^a-zа-я]", "");
            
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        scanner.close();
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        int limit = Math.min(10, list.size());
        System.out.println("Топ-" + limit + " самых частых слов:");
        
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue());
        }
    }
}