package projectM1E1;

public class Fase4 {

	public static void main(String[] args) {
String name = "Valeria", surname1 = "Lav�n", surname2 = "Guti�rrez";
int day = 27, month = 12, year = 1991;
String data = name + " " + surname1 + " " + surname2; 
String birthDate = "" + day + "/" + month + "/" + year; 
String mensaje ="";
boolean bisiesto = false;


if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ) {
	bisiesto = true;
}
			
if (bisiesto == true) {
	mensaje = "Tu a�o de nacimiento (" + year + ")" + " es bisiesto."; 
			
} else {
	mensaje = "Tu a�o de nacimiento (" + year + ")" + " no es bisiesto." ;
  }

System.out.println("Tu nombre completo es " + data + ".\nFecha de nacimiento: " + birthDate + ". " + mensaje);

		

	}

}
