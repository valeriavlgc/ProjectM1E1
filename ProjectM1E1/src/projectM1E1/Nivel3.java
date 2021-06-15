package projectM1E1;

import java.util.Arrays;

public class Nivel3 {

	public static void main(String[] args) {
		
int array[]= {1,2,3,4,5,6,7,8,9,10};
int length = array.length - 1;
int auxiliar = 1, i;

System.out.println(Arrays.toString(array));

   for (i = length; i >= 0; i--) {
		array[i] = auxiliar;
		auxiliar++;
			
	}

System.out.println(Arrays.toString(array));

	}

}
