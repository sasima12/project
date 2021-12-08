package imp_programs;


public class Polidrome_num {

public static void main(String[] args) {
	
	int n=121;
	int a=n;
	int i,j=0;
	while (a>0) {
		i=a %10;
		j=(j*10)+i;
		a=a/10;
	}
	if (n==j) {
		System.out.println("is polindrome");
		
	} else {
System.out.println("not polindrome");
	}
}
}
