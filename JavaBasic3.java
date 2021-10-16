import java.util.Scanner;

public class JavaBasic3 {

    
    public static void main(String[] args){

        int angkamenu;
        Scanner input_angka = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Nama : Leo Agustino_Group 9");
        System.out.println("Java-Basic3");
        System.out.println("==============================");
        System.out.println("Silahkah Pilih Pola : ");
        System.out.println("1. Pola Segitiga");
        System.out.println("2. Pola Persegi");
        System.out.println("masukkan angka : ");
        angkamenu = input_angka.nextInt();
        if (angkamenu == 1 ){
            segitiga();
        } else if (angkamenu == 2 ){
            persegi();
        }else {
            System.out.print("Tidak ada menu");
        }
        }
        
            




static void persegi(){
    for(int b=1; b<=10; b++ ){
        System.out.print("");
    for(int k=1; k<=10; k++){
        System.out.print("*");
    }
 System.out.println("");
}


}
    static void segitiga(){
    for(int x=10; x>0; x--){
       for(int i=1; i<=x; i++){
        System.out.print(" ");
    }for(int j=10; j>x; j--){
    System.out.print("*");
    }   for(int h=11; h>x; h--){
    System.out.print("*");
    }
        System.out.println();
       }
    }

    

}