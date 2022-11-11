package it;

import java.util.Scanner;

public class IT {

    
    public static void main(String[] args) {
        System.out.println("pilih operator anda");
        System.out.println("1. perjumlahan");
        System.out.println("2. perkalian");
        System.out.println("3. pengurangan");
        System.out.println("4. pembagian");

        Scanner input = new Scanner(System.in);
        System.out.println("masukkan pilihan anda : ");
        int pilihan = input.nextInt();

        System.out.println();
        System.out.println("masukkan bilangan 1 : ");
        int bilangan1 = input.nextInt();
        System.out.println("masukkan bilangan 2 : ");
        int bilangan2 = input.nextInt();


        if (pilihan == 1){
            int hasil = bilangan1 + bilangan2;
            System.out.println("Hasil dari perjumlahan : "+hasil);
        }else if (pilihan == 2){
            int hasil = bilangan1 * bilangan2;
            System.out.println("Hasil dari perkalian : "+hasil);
        }else if (pilihan == 3){
            int hasil = bilangan1 - bilangan2;
            System.out.println("Hasil dari pengurangan : "+hasil);
        }else if (pilihan == 4){
            int hasil = bilangan1 / bilangan2;
            System.out.println("Hasil dari pembagian : "+hasil);
        }
    }
    
}
