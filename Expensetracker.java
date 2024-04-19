import java.util.Scanner;
import java.util.ArrayList;
public class Expensetracker{
    

    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
        ArrayList<String> tiposg = new ArrayList<>();
        ArrayList<Integer> montosg = new ArrayList<>();
        
            
            int registro = 0;

            for (int opcion = 0; opcion != 3;) {
                System.out.print("\033\143");
                System.out.println("Menu de opciones ");
                System.out.println(" ");
                System.out.println("1- Agregar Gastos");
                System.out.println("2- Listado de Gastos");
                System.out.println("3- Salir del programa");
                System.out.println(" ");
                System.out.print("Elija una opcion: ");
                int opciones = input.nextInt();

                opcion = opciones;
                
                if (opcion == 1) {
                    System.out.print("Digite el tipo de gasto: ");
                    String descripcion = input.next();
                    System.out.print("Digite el monto del gasto: ");
                    int monto = input.nextInt();


                    registro = registro + 1;
                    tiposg.add(descripcion);
                    montosg.add(monto);
                }

                if (opcion == 2) {
                    System.out.println(" ");
                    System.out.println("Listado de Gastos");
                    System.out.println(" ");
                    int total = 0;

                    for (int i = 0; i + 1 <= tiposg.size();) {
                        if (tiposg.get(i) != "") {
                            System.out.println(tiposg.get(i) + " " + montosg.get(i));
                            total = total + montosg.get(i);
                        }   
                        i = i + 1;       
                    }
                    System.out.println("Total de Gastos: " + total);
                    

                    System.out.println(" ");
                    System.out.print("Digite 0 para volver al menu...");
                    int tecla = input.nextInt();
                    if (tecla == 0) {
                        opcion = 0;
                    }
                };
            }
            
        }





    }
}
