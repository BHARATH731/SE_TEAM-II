/**import java.io.File;
import java.util.*;
import java.util.Map.Entry;
public class SearchDemo {
	public String searchByAuthor(String text)throws Exception{
        Scanner sc=new Scanner(new File("C:\\Users\\lenovo\\eclipse-workspace\\Desktop.csv"));
        sc.useDelimiter("\n");
        LinkedHashMap<String,String> m = new LinkedHashMap<String, String>();
        while(sc.hasNext()){
            String[] tokens=sc.next().split(",");
            m.put(tokens[1],tokens[2]);
        }
        Set<Map.Entry<String,String>> s = m.entrySet();
        LinkedHashMap<Integer,String> a = new LinkedHashMap<Integer, String>();
        for(Entry<String, String> temp : s){
            if(temp.getValue().equals(text)){
            	int i=1;
                a.put(i, temp.getKey());
                i+=1;
            }
        }
        Set<Map.Entry<Integer,String>> b = a.entrySet();
        for(Entry<Integer,String> c : b) {
        	
        }
	}
}
**/