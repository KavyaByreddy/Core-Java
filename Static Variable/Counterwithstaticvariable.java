//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counterwithstaticvariable{  
static int count=0;//will get memory each time when the instance is created  
  
Counterwithstaticvariable(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counterwithstaticvariable c1=new Counterwithstaticvariable();  
Counterwithstaticvariable c2=new Counterwithstaticvariable();  
Counterwithstaticvariable c3=new Counterwithstaticvariable();  
}  
}  
