package frequency_counter;
import java.util.*;
public class frequency {
	public static void main(String[] args){
		String a[]={"a", "a", "b", "c", "c", "c", "d", "a"};
		Map h=new HashMap();
		int count=1;
		for(int i=0;i<a.length;i++){
			if(h.containsKey(a[i])){
				int val=(int)(h.get(a[i]))+1;
				h.put(a[i], val);
			}
			else{
				count=1;
				h.put(a[i], count);
			}
			System.out.println(a[i]+"=>"+h.get(a[i]));
		}
	}

}
