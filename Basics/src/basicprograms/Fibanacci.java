package basicprograms;

public class Fibanacci {
	public static void fibonaccisequence(int count) {
    int a=0;int b=1;int c=1;
	for(int i=1;i<=count;i++) {
		System.out.println(a+" ");
		a=b;b=c;c=a+b;
	}
}
    public static void main(String[] args) {
          fibonaccisequence(10);
	}

}
