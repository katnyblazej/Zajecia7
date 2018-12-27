import java.util.InputMismatchException;
import java.util.Scanner;




public class Main {

    public static void Zad1(){
        boolean czy=true;
        int[] tablica= new int[5];
        int indeks;

        Scanner sc=new Scanner(System.in);

        do{
            try{
                System.out.println("Podaj indeks");
                indeks=sc.nextInt();
                System.out.println(tablica[indeks]);
                czy=false;
            }
            catch(InputMismatchException exc){
                System.out.println("Podaj cyfre!");
                sc.nextLine();
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Indeks poza zakresem tablicy!");
            }

        }while(czy);
    }

    public static void Zad2(){
        Scanner sc=new Scanner(System.in);
        double liczba;
        System.out.println("Podaj liczbe: ");
        liczba=sc.nextDouble();
        if(liczba<0){
            IllegalArgumentException e=new IllegalArgumentException("Liczba nie moze byc ujemna");
            throw e;
        }
        else{
            liczba=Math.sqrt(liczba);
            System.out.println(liczba);
        }



    }

    public static void Zad3(){
        Scanner sc=new Scanner(System.in);
        int liczba1=0,liczba2=0;
        boolean czy=true;


        do{
            try{
                System.out.println("Podaj dwie liczby jedna po drugiej ");
                System.out.print("Liczba1: ");
                liczba1=sc.nextInt();
                System.out.print("Liczba2: ");
                liczba2=sc.nextInt();
                czy=false;
            }
            catch(InputMismatchException exc){
                System.out.println("Podaj cyfre!");
                sc.nextLine();
            }


        }while(czy);
        System.out.println(liczba1+" x "+liczba2+" = "+liczba1*liczba2);


    }

    public static void Zad4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj wiek ");
        int wiek;
        wiek=sc.nextInt();


        System.out.println();

        if(wiek>=18){
            System.out.println("Jestes pelnoletni i możesz głosować");
        }
        else
        {
            IllegalArgumentException e=new IllegalArgumentException("Nie mozesz glosowac! Musisz miec 18 lat!");
            throw e;
        }

    }


    public static void Zad5(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj wiek ");
        int wiek = sc.nextInt();
        System.out.println("Podaj wzrost ");
        int wzrost=sc.nextInt();

        czyZakwalifikowany(wiek,wzrost);
    }

    private static void czyZakwalifikowany(int wiek, int wzrost) {
        if(wiek<=19||wzrost<=180){
            ArithmeticException e=new ArithmeticException("Student NIE kwalifikuje się do drużyny!");
            throw e;
        }
        else System.out.println("Student kwalifikuje się do drużyny!");
    }


    public static void main(String[] args) {
        Zad1();
        Zad2();
        Zad3();
        Zad4();
        Zad5();
    }

}