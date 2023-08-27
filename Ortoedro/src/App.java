import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double largo, baseMA, baseme;
        double diametro, volumen, Area;

        do{
        System.out.print("Ingrese el largo: ");
        largo=lector.nextInt();
        }while(largo>0);
        
        do{
        System.out.print("Ingrese base menor: ");
        baseme=lector.nextInt();
        }while(largo>0);
        
        do{
        System.out.print("Ingrese base mayor: ");
        baseMA=lector.nextInt();
        }while(largo>0);
        
        //
        Area=((2)*((largo*baseme)+(largo*baseMA)+(baseMA*baseme)));
        diametro=(Math.sqrt((largo*largo)+(baseMA*baseMA)+(baseme*baseme)));
        volumen=(largo*baseMA*baseme);
        //
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("El diametro es de "+diametro);
        //
        lector.close();
    }
}
