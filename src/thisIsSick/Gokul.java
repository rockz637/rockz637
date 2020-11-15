package thisIsSick;

import java.util.Scanner;
import java. lang. Math. *;

     class formulas {
	
	
	
	 static void capacitance () {
		 Scanner s=new Scanner(System.in);
		 System.out.println("is it in Series or Parallel");
		 System.out.println("1 - series ");
		 System.out.println("2 - parallel");
		 int  cap=s.nextInt();
		 if(cap==1) {
			 System.out.println("enter the 1st capacitance = ");
			 double C1=s.nextDouble();
			 System.out.println("enter the 2nd capacitance = ");
			 double C2=s.nextDouble();
			 Double C=(C1*C2)/C1+C2;
			 System.out.println(C1+"C and "+C2+"C in series = "+C+"C");
			 }
		 else {
			 System.out.println("enter the 1st capacitance = ");
			 double C1=s.nextDouble();
			 System.out.println("enter the 2nd capacitance = ");
			 double C2=s.nextDouble();
			 Double C=C1+C2;
			 System.out.println(C1+"C and "+C2+"C in parallel = "+C+"C");
			 
		 }
		}
	 
	static void resistance (){
	
		Scanner s=new Scanner(System.in);
		 System.out.println("is it in Series or Parallel");
		 System.out.println("1 - series ");
		 System.out.println("2 - parallel");
		 int  cap=s.nextInt();
		 if(cap==1) {
			 System.out.println("enter the 1st resistance= ");
			 double R1=s.nextDouble();
			 System.out.println("enter the 2nd resistance = ");
			 double R2=s.nextDouble();
			 Double R=R1+R2;
			 System.out.println(R1+"R and "+R2+"R in series = "+R+"R");
			 }
		 else {
			 System.out.println("enter the 1st capacitance = ");
			 double R1=s.nextDouble();
			 System.out.println("enter the 2nd capacitance = ");
			 double R2=s.nextDouble();
			 Double R=(R1*R2)/R1+R2;
			 System.out.println(R1+"R and "+R2+"R in parallel = "+R+"R");
			 
		 }
		
		
	}
	static void resonantFrequency() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the inductance = ");
		 double L=s.nextDouble();
		 System.out.println("enter the capacitance = ");
		 double C=s.nextDouble();
		 double RF=1/(2*Math.PI*Math.sqrt(L*C));
		System.out.println("Resonant Frequency: "+RF);
	}
}
	public class Gokul extends formulas {
		
	public static void main (String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("what are you dealing with?");
		System.out.println("");
		System.out.println("");
		System.out.println("1 - Resistance ");
		System.out.println("2 - Capacitance");
		System.out.println("3 - Resonant frequecy");
		int q=s.nextInt();
		switch(q) {
		case 1:
			resistance();
			break;
		case 2:
			capacitance();
		case 3:		
			resonantFrequency();
		default:
			
		}
		System.out.println(" Have a GOOD DAY ");
		
		
	}
		
	}	

