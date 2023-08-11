//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counterwithoutstaticvariable{  
int count=0;//will get memory each time when the instance is created  
  
Counterwithoutstaticvariable(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counterwithoutstaticvariable c1=new Counterwithoutstaticvariable();  
Counterwithoutstaticvariable c2=new Counterwithoutstaticvariable();  
Counterwithoutstaticvariable c3=new Counterwithoutstaticvariable();  
}  
}  
