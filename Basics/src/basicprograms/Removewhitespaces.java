package basicprograms;

public class Removewhitespaces {
	public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is a QualityAna    list";
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
  
           }
}
