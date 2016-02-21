//Program To Calculate the day from the date using Zeller's congruence.
//by www.neiljohan.com

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class DayFromDate
{
   public static void main(String[] pArgs) throws IOException
   {

       int tYear = NeilClass.GetInputInt("Type in the year ");
       int tMonth = NeilClass.GetInputInt("Type in the Month ");
       int tDay = NeilClass.GetInputInt("Type in the Day ");

       int a=0;
       int b=0;
       int c=0;
       

       if (tMonth < 3){
           a = tMonth + 10;
           b = (tYear-1)%100;
           c = (tYear-1)/100;
       }
       else{
           a = tMonth - 2;
           b = tYear%100;
           c = tYear/100;
       }

       int tWeekDay = (700 + (((26*a)-2)/10)+tDay+b+b/4+c/4-(2*c))%7;
       System.out.println("The day is " + tWeekDay);
       System.out.println("[0 is Sunday, 1 is Monday etc.]");
       






       
   }
}

