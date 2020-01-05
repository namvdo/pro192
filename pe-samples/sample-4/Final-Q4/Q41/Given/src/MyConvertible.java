/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
import java.util.*;
public class MyConvertible implements Convertible{
    public double toMile(double km){
        return km * 0.621371;
    }
    public String getCode(String rc){
        //String [] s = rc.split("(?<=\\G...)");
        //return String.join("-", s);
        ArrayList <String> ab = new ArrayList<String>();
        for(int i = 0; i < rc.length(); i += 3){
            ab.add(rc.substring(i, Math.min(i + 3, rc.length())));
        }
        return String.join("-", ab);
        
        

                
    }
}
