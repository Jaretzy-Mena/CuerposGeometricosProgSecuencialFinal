import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double largo;
        double diametro, volumen, Area;

        do{
        System.out.print("Ingrese el largo: ");
        largo=lector.nextInt();
        }while(largo>0);

        //
        Area=((largo*largo)*(6));
        diametro=((largo)*((Math.sqrt(3)));
        volumen=(largo*largo*largo);
        //
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("El diametro es de "+diametro);
        //
        lector.close();
    }
}
