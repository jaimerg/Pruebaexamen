import java.io.BufferedReader;
import java.io.InputStreamReader;


public class hola {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		System.out.println("dime un numero");
		int numero = Integer.parseInt(br.readLine());
		
		System.out.println(numero);
		for(int i=0; i<numero; i++){
			System.out.println(numero);
			numero++;
		}
	}

}
