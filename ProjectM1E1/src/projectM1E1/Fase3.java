package projectM1E1;

public class Fase3 {
	
	public static void main(String[] args) {
boolean bisiesto = false;
String mensaje = "";
int year = 1991;

	if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ) {
		bisiesto = true;
	}
				
	if (bisiesto == true) {
		mensaje = "Tu a�o de nacimiento (" + year + ")" + " es bisiesto."; 
				
	} else {
		mensaje = "Tu a�o de nacimiento (" + year + ")" + " no es bisiesto." ;
      }

System.out.println(mensaje);


	}

}
