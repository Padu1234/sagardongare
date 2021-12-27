package stringmeethod;

public class charatMethod {
	public static void main (String[]args) {
	String s ="pradip";
	char returningofchar = s.charAt(0); //is use for get value for perticular index
	System.out.println("Char At index "+ returningofchar);
	String b="efg";
         String returningofconcate = s.concat (b); // used for joining two string
         
         System.out.println ("concate output " + returningofconcate);
         
         
         boolean returningOfequal = s.equals(b);  // use for to check content is equal or not 
         System.out.println( "eqal output" +  returningOfequal);
         
           String returningsub= s.substring (3,6); //use to create string from given string by index no
           System.out.println(returningsub);
          
           String c ="90876iouou";
           int returninglength= c.length();   //the length are used to specified size of string
           System.out.println(returninglength);
           
           
           String s2= "abcdabcd";
          String returnreplace= s2.replace('a','b');
          System.out.println(returnreplace);
           
          String a2 = "ABFR4Tyr";
           String returninglowercase=a2.toLowerCase();
          System.out.println( returninglowercase);
          
          String d = "asder45treswAq";
          
         String toreturnupper=d.toUpperCase();
          System.out.println(toreturnupper);
          
          String totrim=d.trim();
          System.out.println(totrim);
          
          int returnindex= d.indexOf("A");
          System.out.println( returnindex);
          
          
          
          
          
          
	}
         

}
      
