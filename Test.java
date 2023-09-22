class Test{
    public static void main(String[] args){
        String s1="PSA";
        String s2="PSA";
        String s3=new String("PSA");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
         System.out.println(s1.equals(s2));
          System.out.println(s1.equals(s3));
    }
}

/*class Test{
    public static void main(String[] args){
        String s1="abc";
        String s2="abc";
        System.out.println("s1==s2 is :" +s1==s2);
        System.out.println(s1==s2);
    }
}*/
/*class Test{
    public static void main(String[] args){
        String x="Rahul";
        String y="Gandhi";
        x.concat(y);
        System.out.println(x);
    }
}*/


/*import java.io.IOException;
class Test{
    public static void main(String[] args){
        try{
            throw new IOException("Hello");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       //catch(IOException e){ System.out.println(e.getMessage());} 
    }
}*/