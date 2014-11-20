import java.util.Scanner;


public class zadatak4 {
public static void main(String[] args) {
	double a,b,c,A=0,S=0,la=0;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite tri broja:");
	a=unos.nextDouble();
	b=unos.nextDouble();
	c=unos.nextDouble();
	if((a<b+c)&&(b<a+c)&&(c<a+b)) {
		S=(a+b+c)/2;
		A=Math.sqrt(S*(S-a)*(S-b)*(S-c));
		}
	else
		System.out.println("Ti brojevi ne mogu biti stranice trougla");
	if((a>b)&&(a>c))
		la=Math.pow(Math.cos((b*b+c*c-a*a)/2*b*c), -1.0);
	else if (b>c)
		la=Math.pow(Math.cos((a*a+c*c-b*b)/2*a*c), -1.0);
	else
		la=Math.pow(Math.cos((a*a+b*b-b*b)/2*a*b), -1.0);
	System.out.println("Najveci ugao je "+la+", a povsina trougla je "+A);

		

}
}
