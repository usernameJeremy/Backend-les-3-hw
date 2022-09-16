package src;

import java.util.HashMap;

public class TransLator {

    HashMap<Integer,String> numericAlpha = new HashMap<>();

    public TransLator(String[] alphabetic,Integer[] numeric ) {
    for (int i = 0; i< alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
    public String translate(Integer number) {
        return numericAlpha.get(number);
    }
}
