import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.print("1. kenari giriniz : ");
        a=input.nextInt();
        System.out.print("2. kenari giriniz : ");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus : " +c);

        //Uc kenari girilen ucgenin alanini hesaplama
        double x,y,z;
        Scanner uc=new Scanner(System.in);
        System.out.print("X kenarini giriniz : ");
        x=uc.nextDouble();
        System.out.print("Y kenarini giriniz : ");
        y=uc.nextDouble();
        System.out.print("Z kenarini giriniz : ");
        z=uc.nextDouble();

        double u =(x+y+z)/2;

        double alan;
        alan=Math.sqrt(u*(u-x)*(u-y)*(u-z));
        System.out.println("Ucgenin alani : " +alan);

    }
}
