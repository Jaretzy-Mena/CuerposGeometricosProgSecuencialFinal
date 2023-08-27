import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double largo;
        double volumen, Area;

        do{
        System.out.print("Ingrese el largo: ");
        largo=lector.nextInt();
        }while(largo>0);

        //
        Area=(((largo*largo)*(5))*Math.sqrt(3));
        volumen=((5/12)*(3+(7*Math.sqrt(5)))*(largo*largo*largo));
        //
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        //
        lector.close();
    }
}
