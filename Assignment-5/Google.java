import java.util.HashMap;
import java.time.LocalDate;

class SearchEngine {
    
    HashMap<String, LocalDate> fruitDictionary = new HashMap<>();
    
    public SearchEngine() {
        fruitDictionary.put("Apple", LocalDate.of(2024, 2, 24)); 
        fruitDictionary.put("Banana", LocalDate.of(2019, 6, 1)); 
        fruitDictionary.put("Orange", LocalDate.of(2014, 12, 9)); 
    }
    
    public void search(String fruit) {
        boolean flag = false;
        for (String f : this.fruitDictionary.keySet()) {
            if (f.equals(fruit)) {
                flag = true;
                System.out.println(f +" "+ fruitDictionary.get(f));
                break;
            }
        }
        if (!flag) {
            System.out.println("Fruit not found.");
        }
    }
    
    public void search(LocalDate date) {
        boolean flag = false;
        for (String f : this.fruitDictionary.keySet()) {
            LocalDate l = fruitDictionary.get(f);
            if (l.equals(date)) {
                flag = true;
                System.out.println(f +" "+ l);
                break;
            }
        }
        if (!flag) {
            System.out.println("Fruit not found.");
        }
    }
    
    public void search(int rel) {
    	System.out.println("Searched by relevance");
    }
}

public class Google {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        searchEngine.search("Apple");
        searchEngine.search(LocalDate.of(2019, 6, 1));
        searchEngine.search(1);
    }
}
