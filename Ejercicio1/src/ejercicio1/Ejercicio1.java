package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c, d, e, f, g;
        //c=suma, d=division, e=resta, f=multiplicación, g=modulo
        System.out.println("Dame un numero: ");
        a =leer.nextInt();
        System.out.println("Dame un numero: ");
        b =leer.nextInt();
        c = a + b;
        System.out.println("La suma es: "+c);
        d= a/b;
        System.out.println("La division es: "+d);
        e = a - b;
        System.out.println("La resta es: "+e);
        f = a * b;
        System.out.println("La multiplicacion es: "+f);
        g = a % b;
        System.out.println("El modulo es: "+g);
    }
}
