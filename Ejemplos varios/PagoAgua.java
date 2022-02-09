import java.util.Scanner;

public class PagoAgua {

	public static void main(String[] args) {
		int cantidad;
		double total;
		int base = 20;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de metros cubicos consumidos: ");
		cantidad = scanner.nextInt();
		
		if (cantidad > 0 && cantidad <= 5) {
			System.out.println("La cuota a pagar de agua es de: Q.");
			System.out.println(base);
		} else {
			if (cantidad > 5 && cantidad <= 15) {
				total = (cantidad * 5) + base;
				System.out.println("La cuota a pagar de agua es de: Q.");
				System.out.println(total);
			} else {
				total = (cantidad * 6.5) + base;
				System.out.println("La cuota a pagar de agua es de: Q.");
				System.out.println(total);
			}
		}
	}

}
