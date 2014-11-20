import java.util.Scanner;


public class zadatak6 {
	public static void main(String[] args) {
		int sp,tH=0; 
		double dis,t,tM;
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite brzinu broda u mph:");
		sp=unos.nextInt();
		System.out.println("Unesite razdaljinu u kilometrima:");
		dis=unos.nextDouble();
		double spKM=sp*1.6;
		t=dis/spKM;
		if(t>1) {
			tH=(int)(dis/spKM); 
		tM=(dis%spKM)/100*60;	
		}
		else {
			tH=0;
			tM=(dis%spKM)/100*60;
			
		}
		System.out.println("Potrebno je "+tH+" sati i "+tM+" minuta da se predje navedena razdaljina");

		
}
}