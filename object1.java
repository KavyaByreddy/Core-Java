public class object1 {
    int rollno;
    String name;
    void getDetails(int r,String n){
        rollno=r;
        name=n;
    }
   void displayInformation(){System.out.println(rollno+" "+name);}
   public static void main(String args[]){
   object1 s1 = new object1();
   object1 s2 = new object1();
   s1.getDetails(101,"Kavya");
   s2.getDetails(102, "ayaan");
   s1.displayInformation();
   s2.displayInformation();
   }
}

