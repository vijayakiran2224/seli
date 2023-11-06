

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInArray {

	public static void main(String[] args) {
		char[] c= {'a','a','b','c','b'};
		HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
		for(int i=0;i<=c.length-1;i++)
		{
			char cc=c[i];
			if(hp.containsKey(cc))
			{
				hp.put(cc,hp.get(cc)+1);
			}
			else
			{
				hp.put(cc,1);
			}
		}
		
		Set<Character>allKeys=hp.keySet();
		for(Character key:allKeys)
		{
			System.out.println(key+":"+hp.get(key));
		}
		
		System.out.println("duplicate character in array");
		
		for(Character key:allKeys)
		{   
			if(hp.get(key)>1)
			System.out.println(key+":"+hp.get(key));
		}
		

	}


	

}
