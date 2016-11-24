import java.io.File;
import java.io.IOException;
import java.util.*;
import personality.candidate;
import personality.fileread;
import java.io.BufferedReader;
import java.io.FileReader;

public class Personality{

    public static void main(String[] args)throws IOException,Exception {
        Scanner sc=new Scanner(new File("C:\\Users\\Admin\\Desktop\\ts1.csv"));
        sc.useDelimiter("\n");
        ArrayList<String> data=new ArrayList<String>();
      HashMap<String,Integer> h1=new HashMap<String,Integer>();
        HashMap<String,Integer> h2=new HashMap<String,Integer>();
         HashMap<String,Integer> h3=new HashMap<String,Integer>();
 
        fileread fr=new fileread();
 
      candidate c=new candidate();
      ArrayList<String> data1=new ArrayList<String>();
      ArrayList<String> data2=new ArrayList<String>();
        
        while(sc.hasNext())
        {
            
           
            
           sc.useDelimiter(",");
           data.add(sc.next());
           
            }
          
        
        for(int i=0;i<data.size();i++)
        {
            
            System.out.println(data.get(i));
              
        }
        System.out.println(" candidate set");
        
        Set<Map.Entry<String,Integer>> set=occ(data).entrySet(); 
        for(Map.Entry<String,Integer> m:set)
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("frequent set ");
     h1= c.f1(set, data);  
     Set<Map.Entry<String,Integer>> set1=h1.entrySet();
     for(Map.Entry<String,Integer> n:set1)
        {
            System.out.println(n.getKey()+" "+n.getValue());
        }
    /* Scanner sc1=new Scanner(new File("C:\\Users\\Admin\\Desktop\\ts1.txt"));
        sc1.useDelimiter("\n");
        while(sc1.hasNext())
        {
            
           
            
         sc1.useDelimiter(",");
           data1.add(sc1.next());
           
            } 
      for(int i=0;i<data1.size();i++)
        {
            System.out.println(data1.get(i));
            
        }*/
     System.out.println(" candidate  set 2");
    /* h2= c.c2(set1,data);
      Set<Map.Entry<String,Integer>> set2=h2.entrySet(); 
        for(Map.Entry<String,Integer> l:set2)
        {
            System.out.println(l.getKey()+" "+l.getValue());
        }*/
        BufferedReader br = null;

		
			String crunchifyLine;
			br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\ts1.csv"));
                        

			// How to read file in java line by line?
			while((crunchifyLine = br.readLine()) != null) {
				
				data1= fr.cr(crunchifyLine);
                                System.out.println(data1);
                               
                   
                                
			}
                         data2=fr.csvtoarr3();
                         System.out.println("Frequent set 2");
                        h2= c.c2(set1,data2);
      Set<Map.Entry<String,Integer>> set2=h2.entrySet(); 
        for(Map.Entry<String,Integer> l:set2)
        {
            System.out.println(l.getKey()+" "+l.getValue());
        } 
       /* data2=fr.csvtoarr3();*/
       System.out.println("candidate set 2");
        h3= c.f2(set2,data2);
      Set<Map.Entry<String,Integer>> set3=h3.entrySet(); 
        for(Map.Entry<String,Integer> l:set3)
        {
            System.out.println(l.getKey()+" "+l.getValue());
        }
        c.ass(set3,data2);
        
                            
                        
    }  
                        
                            
                            
   public static HashMap<String,Integer> occ(ArrayList<String> data)
    {
        HashMap<String,Integer> h=new HashMap<String,Integer>();
        
        
        for(int i=0;i<data.size();i++)
        {
            for(int j=0;j<data.get(i).length();j++)
            
            {
                String[] a=new String[data.get(i).length()];
                a[j]=data.get(i).toString();
            
        int ac=Collections.frequency(data, a[j]);
       
       
         if(!h.containsKey(a[j])){
            
        h.put(a[j],ac);
         }
        
            }
        }        
   
        Set<Map.Entry<String,Integer>> set=h.entrySet(); 
      
       return h;
       
    }  
   /*  public static HashMap<String,Integer> c1(HashMap<String,Integer> h)
    {
        HashMap<String,Integer> n=new HashMap<String,Integer>();
        
    for()        
        int ac=Collections.frequency(data, a[j]);
       
       
         if(!h.containsKey(a[j])){
            
        h.put(a[j],ac);
         }
        
            }
        }        
   
        Set<Map.Entry<String,Integer>> set=h.entrySet(); 
      
       return h;
       
    }  */
}
   

