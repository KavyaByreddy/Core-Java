//Let us see another example of default constructor  
//which displays the default values  
class Constructor2{  
int id;  
String name;  
//method to display the value of id and name  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
//creating objects  
Constructor2 s1=new Constructor2();  
Constructor2 s2=new Constructor2();  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  
