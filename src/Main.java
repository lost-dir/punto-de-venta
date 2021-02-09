import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static public String usuario = "admin";
	static public String password = "amodasy";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int regresoAMenu = 0;
		List<Articulo> articuloList = new ArrayList<>();
		
		System.out.println("Abarrotes Daysi-Madre!");
		String usuairo = "";
		String password = "";

		do {
			System.out.print("Usuario: ");
			usuairo = sc.next();
			System.out.print("Password: ");
			password = sc.next();
			if (usuairo.equals(Main.usuario) && password.equals(Main.password)) {
				
				do {
					int opcion = 0;
					System.out.println("\nMenu!");
					System.out.println("1. Admin");
					System.out.println("2. Stock");
					System.out.println("3. Balance");
					System.out.println("4. Utilidades");
					System.out.println("5. Reporte");
					System.out.println("Opcion: ");
					opcion = sc.nextInt();

					switch (opcion) {
					case 1:
							
						System.out.println("\nAdmin!");
						System.out.println("1. Registrar");
						System.out.println("2. Eliminar");
						System.out.println("3. Buscar");
						System.out.println("4. Modificar");
						System.out.println("5. regreso a menu");
						System.out.println("opcion: ");
						
						regresoAMenu = sc.nextInt();
						break;

					case 2:
						System.out.println("\nStock!");
						System.out.println("1. Stock inicial");
						System.out.println("2. Stock final");
						System.out.println("3. Articulos disponibles");
						
						System.out.println("5. regreso a menu");
						System.out.println("opcion: ");
						
						regresoAMenu = sc.nextInt();
						break;

					case 3:
						System.out.println("\nBalance!");
						
						System.out.println("1. Ventas totales");
						System.out.println("2. Ventas diarias");
						System.out.println("3. Ventas semanales");
						System.out.println("4. Valor de stock");
						System.out.println("5. regreso a menu");
						System.out.println("opcion: ");
						
						regresoAMenu = sc.nextInt();
						break;

					case 4:
						
						System.out.println("\nUtilidades!");
						System.out.println("1. Obtener utilidades");
						
						System.out.println("5. regreso a menu");
						System.out.println("opcion: ");
						
						regresoAMenu = sc.nextInt();
						break;

					case 5:
						System.out.println("\nReporte!");
						System.out.println("1. Reporte de articulos");
						System.out.println("2. Reporte financiero");
						System.out.println("3. Reporte de utilidades");
						
						System.out.println("5. regreso a menu");
						System.out.println("opcion: ");
						
						regresoAMenu = sc.nextInt();
						break;
						
					default: 
						System.out.println("\nOpcion invalida!");
						break;
					}
					
				}while(regresoAMenu == 5);
				//endWhileMenu
			} else {
				System.out.println("No entraste");
			}
		} while (!usuairo.equals(Main.usuario) || !password.equals(Main.password));

		// fin de programa
	}

}

//Huevos putos todos
//Hola, soy goku
