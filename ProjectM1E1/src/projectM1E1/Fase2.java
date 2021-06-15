package projectM1E1;

public class Fase2 {

	public static void main(String[] args) {

final int YEAR1 = 1948; 
int contador= 0, i;
int year = 1991;

System.out.println("Los años bisiestos comprendidos entre " + YEAR1 + " y " + year + " son: ");

for (i = YEAR1; i < year; i++) {
	if (i % 400 == 0 || i % 100 != 0 && i % 4 == 0) {
		System.out.print(i + " ");
		contador += 1;
}
	}
		

System.out.println("\n" + "Son " + contador + " años bisiestos.");

	}

}
