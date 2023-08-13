//Here this keyword not required
class this1{  
int rollno;  
String name;  
float fee;  
this1(int r,String n,float f){  
rollno = r;  
name = n;  
fee = f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class test{  
public static void main(String[] args){  
this1 s1=new this1(111,"ankit",5000f);  
this1 s2=new this1(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
