package java_percabangan;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama : ");
        int variable1 = userInput.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int variable2 = userInput.nextInt();
        
        if(variable1 % 2 == 0 && variable2 % 2 == 0){//genap
            int penjumlahan = variable1 + variable2;
            System.out.printf("\nHasil Penjumlahan : %d \n", penjumlahan);
        }else if (variable1 % 2 != 0 && variable2 % 2 != 0){
            int perkalian = variable1 * variable2;
            System.out.printf("\nHasil Perkalian : %d \n", perkalian);
        }else {
            System.out.printf("\nKedua bilangan tidak memenuhi ketentuan.\n");
        }
        
        System.out.print("\n");
        
        userInput.close();
        }
}
