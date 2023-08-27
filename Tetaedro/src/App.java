import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double largo;
        double hipotenusa, volumen, Area;

        do{
        System.out.print("Ingrese el largo: ");
        largo=lector.nextInt();
        }while(largo>0);

        //
        Area=((largo*largo)*Math.sqrt(3));
        hipotenusa=((largo)*((Math.sqrt(6))/(3)));
        volumen=(((Math.sqrt(2))/(12))*(largo*largo*largo));
        //
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("El hipotenusa es de "+hipotenusa);
        //profe no sabia que significaba la H así que le puse hipotenusa
        lector.close();
    }
}
