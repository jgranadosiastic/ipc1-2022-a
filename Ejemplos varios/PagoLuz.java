import java.util.Scanner;

public class PagoLuz {

	public static void main(String[] args) {
		int cantidad;
		double total;
		int extra;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de kw/h consumidos: ");
		cantidad = scanner.nextInt();
		
		if (cantidad >= 1 && cantidad <= 50) {
			total = cantidad * 1;
			System.out.println("La cuota a pagar de luz es de: Q.");
			System.out.println(total);
		} else {
			if (cantidad > 50 && cantidad <= 100) {
				extra = cantidad - 50;
				total = 50 + extra * 1.5;
				System.out.println("La cuota a pagar de luz es de: Q.");
				System.out.println(total);
			} else {
				if (cantidad > 100 ) {
					extra = cantidad - 100;
					total = (extra * 2) + (50 - 1.5) + 50;
					System.out.println("La cuota a pagar de luz es de: Q.");
					System.out.println(total);
				}
			}
		}
	}

}
