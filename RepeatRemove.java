import java.io.*;
import java.util.*;

public class RepeatRemove {
    public static void main(String args[])
    {
        Set<Character> hs=new LinkedHashSet<Character>();
        String str;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        char p[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
        
        hs.add(p[i]);
        }
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
      
        System.out.print(it.next());
      
        }
    
}}
