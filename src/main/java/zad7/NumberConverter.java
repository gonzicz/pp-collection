package zad7;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class NumberConverter
{
    Map<String, Integer> romanToDecimal = new HashMap<>();
    public NumberConverter()
    {
        romanToDecimal.put("I",1);
        romanToDecimal.put("II",2);
        romanToDecimal.put("III",3);
        romanToDecimal.put("IV",4);
        romanToDecimal.put("V",5);
        romanToDecimal.put("VI",6);
        romanToDecimal.put("VII",7);
        romanToDecimal.put("VIII",8);
        romanToDecimal.put("IX",9);
        romanToDecimal.put("0",0);
    }

    public void getConvert()
    {
        romanToDecimal.forEach( (key,value)-> System.out.println("Key: " + key + " Value: " + value));

    }

    public static void main(String[] args)
    {
        NumberConverter nc = new NumberConverter();
        nc.getConvert();
    }
}


