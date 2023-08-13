//Here we get null and 0 as values this is the problem we have to use this keyword to rectify this problem
//Refers current class instance variable
class this2{  
int rollno;  
String name;  
float fee;  
this2(int r,String n,float f){  
rollno=r;  
name=n;  
fee=f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class Test{  
public static void main(String args[]){  
this2 s1=new this2(111,"ankit",5000f);  
this2 s2=new this2(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
