//One way is by changing no. of arguments
class Adding{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adding.add(11,11));  
System.out.println(Adding.add(11,11,11));  
}}  
