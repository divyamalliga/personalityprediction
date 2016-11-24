/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personality;

/**
 *
 * @author Admin
 */
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.*;
import java.io.File;
public class fileread{
    public static ArrayList<String> cr(String crunchifyCSV) {
		
                

ArrayList<String> cr=new ArrayList<String>();
		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*,\\s*");
                        
                        
                                
			for (int i = 0; i < splitData.length; i++)
                        {
                            
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
				cr.add(splitData[i].trim());	
				}
                            
                            }
                            
			}
		
               

		return cr;
                
	}
     public static ArrayList<String> csvtoarr3()throws Exception
    {
          Scanner sc2=new Scanner(new File("C:\\Users\\Admin\\Desktop\\ts2.csv"));
        sc2.useDelimiter("\n");
        ArrayList<String> data=new ArrayList<String>();
        while(sc2.hasNext())
        {
            
            data.add(sc2.next());
        }
        for(int i=0;i<data.size();i++)
        {
            System.out.println(data.get(i));
        }
        return data;
      
    }
    
    
}
    