import java.util.*;
import java.lang.*;
class se27
{
  public static void main(String arg[])
   {
     try
         {
            String s ="Shanghai Houston Colorado Alexandria";
            String s1 ="Alexandria Colorado Houston Shanghai";
	boolean m1 = s.regionMatches(0, s1, 28, 8);
	    System.out.println(m1);
	  
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}