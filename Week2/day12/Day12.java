package day12;
import java.util.*;
import util.*;
public class Day12{
    /**
     * @param data list of words
     * Return a map with count as key and list of words that has been found in the data as value.
     */
    public HashMap<Integer,LinkedList<String> > getCountOfWords(String[] data){
        HashMap<Integer,LinkedList<String> > words = new HashMap<Integer,LinkedList<String> >();
        ArrayList<String> cache =new ArrayList<String>();
        try { 
            for(Integer i = 0; i < data.length; i++){
                int count = 1;
                if(!cache.contains(data[i])){
                    for(Integer j = i + 1; j < data.length; j++){
                        if(data[i].equals(data[j])){
                            count++;
                        }
                    }
                    if(words.containsKey(count)){
                        words.get(count).add(data[i]);
                    }else{
                        LinkedList<String> ll = new LinkedList<String>();
                        ll.add(data[i]);
                        words.put(count,ll);
                    }
                    cache.add(data[i]);
                }
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        return words;
    }

    /**
     * @param data list of words
     * Return a map with substring(0,3) as key and list of matched prefixes in data as value.
     */
    public HashMap<String,LinkedList<String> > getCommonPrefix(String[] data){
        HashMap<String,LinkedList<String> > words = new HashMap<String,LinkedList<String> >();
        try {
            for(Integer i = 0; i < data.length; i++){
                String substr = data[i].substring(0, 3);
                if(words.containsKey(substr)){
                    words.get(substr).add(data[i]);
                }
                else{
                    LinkedList<String> ll = new LinkedList<String>();
                    ll.add(data[i]);
                    words.put(substr,ll);
                }
            }
        } catch (Exception e) {
            Util.print(e.getMessage());
        }
        return words;
    }
}