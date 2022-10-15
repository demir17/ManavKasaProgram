import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz= 0.95, patlican= 5.00, a, e,d,m,p, toplam;
        System.out.print("Armut Kaç Kilo:");
        System.out.println();
        a = sc.nextDouble();

        System.out.print("Elma Kaç Kilo :");
        System.out.println();
        e = sc.nextDouble();

        System.out.print("Domates Kaç Kilo :");
        System.out.println();
        d = sc.nextDouble();

        System.out.print("Muz Kaç Kilo :");
        System.out.println();
        m = sc.nextDouble();

        System.out.print("Patlıcan Kaç Kilo :");
        System.out.println();
        p = sc.nextDouble();

        toplam = ((armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlican * p));

        System.out.println("Toplam ödemeniz gereken tutar: " + toplam );

    }
}
