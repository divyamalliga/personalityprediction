package personality;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Math;


public class candidate
        
        {
    
    
    public static HashMap<String,Integer> f1( Set<Map.Entry<String,Integer>> set,ArrayList<String>  data)
    {
        HashMap<String,Integer>  h=new HashMap<String,Integer>();
        for(Map.Entry<String,Integer> m:set)
        {
            if(m.getValue()>=2)
            {
                h.put(m.getKey(),m.getValue());
            }
        }
         Set<Map.Entry<String,Integer>> set1=h.entrySet();
         return h;
    }
    public static HashMap<String,Integer> c2( Set<Map.Entry<String,Integer>> set,ArrayList<String>  data)
    {
        String[] a=new String[set.size()];
        int s=set.size();
        int s1=((s*(s+1))/2);
        String[] b=new String[s1];
        int i=0;
        HashMap<String,Integer> h2=new HashMap<String,Integer>();
        
        for(Map.Entry<String,Integer> l:set)
        {
          a[i]=l.getKey();
          i++;
        }
       
     int count;   
        for(int j=0,l=0;j<a.length-1;j++)
        {
            
            for(int k=j+1;k<a.length-1;k++)
            {
                
                
                b[l]=a[j]+","+a[k];
                count=0;
                
                for(int b1=0;b1<data.size();b1++)
                {
                   String str=data.get(b1);
                    
                
                        if(str.contains(a[j])&&str.contains(a[k]))
                            
                            {
                                               count++;

                                
                            }
                }
            h2.put(b[l], count);
           /*2.put(b[l],1);*/
              /* h2.put(b[l], c);*/
             
              System.out.println(b[l]);
                   
             l++;
              
            }
        }
             Set<Map.Entry<String,Integer>> set2=h2.entrySet(); 
       return h2;
        
    }
    
    public static HashMap<String,Integer> f2( Set<Map.Entry<String,Integer>> set,ArrayList<String>  data)
    {
        HashMap<String,Integer>  h=new HashMap<String,Integer>();
        /*int minsup=((4*data.size())/100);*/
        
        for(Map.Entry<String,Integer> m:set)
        {
            if(m.getValue()>=3)
            {
                h.put(m.getKey(),m.getValue());
            }
        }
         Set<Map.Entry<String,Integer>> set1=h.entrySet();
         return h;
    }
    public static double conf(ArrayList<String> data,String a,String b,String c)
    {   
         
        
        double c1=0.0,c2=0.0;
        
       for(int i=0;i<data.size();i++)
        {
            if(data.get(i).contains(a)&&data.get(i).contains(b))
            {
                c1++;
            }
        }
      /* for(Map.Entry<String,Integer> l2:set)
        {
             d1=l2.getValue();
        }*/
      
      
        for(int j=0;j<data.size();j++)
        {
            if(data.get(j).contains(a)&&data.get(j).contains(b)&&data.get(j).contains(c)){
            c2++;
            }
        }
        double d=(double)((c2/c1)*100);
        return d;
    }

             public static void ass(Set<Map.Entry<String,Integer>> set,ArrayList<String> data)
    {
        String a[]={"0","2","4"};
        int s=0;
        for(Map.Entry<String,Integer> l2:set)
        {
            s+=l2.getValue();
        }
        String b[]=new String[1000];
        int c[]=new int[1000];
        
        int i=0,j=0;
        HashMap<String,Integer> h2=new HashMap<String,Integer>();
        HashMap<String,Integer> h3=new HashMap<String,Integer>();
        ArrayList<String> a4=new ArrayList<String>();
        
        for(Map.Entry<String,Integer> l:set)
        {
          b[i]=l.getKey();
          i++;
          
          c[j]=l.getValue();
          j++;
        }
        
        int a1[]={0,2,4};
        double d;
        int d1;
        int c2;
        double f;
        String g;
        String s1[]= new String[100];
        String s2[]=new String[100];
        String s3[] =new String[100];
        int m1=0,m2=0,m3=0;
        float size=data.size();
        int count=0;
        for(int k1=0;k1<b.length;k1++)
        {
          String[] a2=new String[2];
          a2=b[k1].split(",");
          
                         for(int k3=0;k3<data.size();k3++)
                {
                   
                    String str=data.get(k3);
                   
                    if(str.contains(a2[0])&&str.contains(a2[1]))
                        
                    {
                        
                       
                       
                            
                                                     
                         /*   for(Map.Entry<String,Integer> l2:set)
                                
        {
            
            if(l2.getKey().equals(b[k1]))
            {
                 d1=l2.getValue();
            }
        }*/
        
            if(str.contains("0"))
                                
                            {   
                               /* int flag=0;
                                for(String l:s1)
                                {
                                    if(l.equals(str+"0"))
                                    {
                                        flag=1;
                                    }
                                }*/
                                
                                double m=c[k1];
                                  f=(double)((m/size)*100);
                                  a4.add(a2[0]+","+a2[1]+"0");

                                 d=conf(data,a2[0],a2[1],"0");
                                 
                                 s1[m1]=b[k1];
                                 m1++;
                           /* h2.put(b[k1],a1[k2]);*/
                            System.out.println(b[k1]+"->"+a[0]+"["+(String.format("%.2f", f))+","+(String.format("%.2f", d))+"]");
                            count++;
                            
                            
                            }
        
                       
                    else     if(str.contains("2"))
                            {
                                double n=c[k1];
                                f=(double)((n/size)*100);
                                 a4.add(a2[0]+","+a2[1]+"2"); 
                                
                            d=conf(data,a2[0],a2[1],"2");
                             s2[m2]=b[k1];
                                 m2++;
                              
  
    
  
                           /* h2.put(b[k1],a1[k2]);*/
                            System.out.println(b[k1]+"->"+a[1]+"["+(String.format("%.2f", f))+","+(String.format("%.2f", d))+"]");
                            count++;
                            
    
                        } 
                       
                            
                    else
                            {
                               
                                double k=c[k1];
                                  f=(double)((k/size)*100);
                                    a4.add(a2[0]+","+a2[1]+"4");
                                  

                                  d=conf(data,a2[0],a2[1],"4");
                                   s3[m1]=b[k1];
                                 m3++;
                                  
                                System.out.println(b[k1]+"->"+a[2]+"["+(String.format("%.2f", f))+","+(String.format("%.2f", d))+"]");
                            count++;
                           
                            
                            }
                            
                    break;
                    }
                    
                  
                    
                }
                         
          System.out.println("The count of Association rules are generatd :"+count);
       
                       
                        
                                   } 
        
        }
       
        
         
        

          
        /*for(String l1:s1)
        {
            
        }*/
      /*  Set<Map.Entry<String,Integer>> set1=h2.entrySet();
        return h2;*/
        
    }
   
                 
 


        
/*   for(int k=0;k<b.length;k++)
      {
          int count1=0,count=0;
          for(int m=0;m<data.size();m++)
      
                  {
            
            String input = data.get(m);
            if(input.contains(b[k].))
            {
                count1++;
                
            }
          /*  else
            {
                count1;
            }
              
    } 
                  
                
            
            h2.put(b[k], count1);
            
      
      } */

      
    
    
    

