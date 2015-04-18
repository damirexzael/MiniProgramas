
public class PasswordRecursivo {

	public static void pass(String palabra, String clave, int lugar, String pre) {
		if(clave.length() <= lugar) {
			System.out.println(pre);
		}
		else if(clave.charAt(lugar) == '#') {
			pass(palabra, clave, lugar + 1, pre + palabra);
		}
		else if(clave.charAt(lugar) == '0') {
			pass(palabra, clave, lugar + 1, pre + 0);
			pass(palabra, clave, lugar + 1, pre + 1);
			pass(palabra, clave, lugar + 1, pre + 2);
			pass(palabra, clave, lugar + 1, pre + 3);
			pass(palabra, clave, lugar + 1, pre + 4);
			pass(palabra, clave, lugar + 1, pre + 5);
			pass(palabra, clave, lugar + 1, pre + 6);
			pass(palabra, clave, lugar + 1, pre + 7);
			pass(palabra, clave, lugar + 1, pre + 8);
			pass(palabra, clave, lugar + 1, pre + 9);
		}
	}
}
