//If you don't use the this keyword, compiler automatically adds this keyword while invoking the method. 
class thismethod{  
void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();  
}  
}  
class TestThis4{  
public static void main(String args[]){  
thismethod a=new thismethod();  
a.n();  
}}  
