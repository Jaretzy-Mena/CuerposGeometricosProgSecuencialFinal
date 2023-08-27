import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        double largo, ap;
        double Apent, volumen, Area;

        do{
        System.out.print("Ingrese el largo: ");
        largo=lector.nextInt();
        }while(largo>0);

        do{
        System.out.print("Ingrese el ap: ");
        ap=lector.nextInt();
        }while(ap>0);
        

        //
        Area=((3*largo*largo*largo)*(Math.sqrt((25)+(10*Math.sqrt(5)))));
        Apent=((5/2)*largo*ap);
        volumen=((1/4)*((15)+(7*Math.sqrt(5)))*(largo*largo*largo));
        //
        System.out.println("El area es de "+Area);
        System.out.println("El volumen es de "+volumen);
        System.out.println("Apent es de "+Apent);
        //
        lector.close();
    }
}
