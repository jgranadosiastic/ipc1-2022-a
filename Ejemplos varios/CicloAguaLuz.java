import java.util.Scanner;

public class CicloAguaLuz {

	public static void main(String[] args) {
		int opcion;
		Scanner scanner = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Opciones:");
			System.out.println("1. Agua");
			System.out.println("2. Luz");
			System.out.println("3. Salir");
			System.out.println("Ingrese su opcion");
			
			opcion = scanner.nextInt();
			if (opcion == 1) {
				int cantidad;
				double total;
				int base = 20;
				
				
				
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
			} else {
				if (opcion == 2) {
					int cantidad;
					double total;
					int extra;
					
					
					
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
		} while (opcion != 3);
		System.out.println("Saliendo del sistema!!");
	}

}
