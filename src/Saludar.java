import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Dalkiller
 *
 */
public class Saludar {

	static int[] numeros = new int[2];
	static int[] num = new int[4];
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		numeros[0]=5;
		numeros[1]=15;
		num=numeros;
		System.out.println("hola "+numeros[1]);
		System.out.println("tamaño: "+numeros.length);
		System.out.println("hola "+num[1]);
		System.out.println("tamaño: "+num.length);
		BufferedReader usuario = new BufferedReader(new InputStreamReader(System.in));
		String dato;
		dato = usuario.readLine();
		System.out.println("info: " + dato);
		Scanner entrada = new Scanner(System.in);
		int number;
		number = entrada.nextInt();
		System.out.println(number);
	}

}