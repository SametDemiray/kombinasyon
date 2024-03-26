package org.example;

import java.util.Scanner;
// Eleman sayısı girilen bir kümenin belirtilen kombinasyonlarını hesaplayan program.
public class Main {
    public static void main(String[] args) {
        float f1 = 1;
        float f2 = 1;
        float f3 = 1;
        float k;
        int i,n,r;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        n = scanner.nextInt();

        System.out.print("r = ");
        r = scanner.nextInt();

        for (i=1; i<=n; i++){
            f1*=i;
                if (i<=r)
                    f2*=i;
                if(i<=n-r)
                    f3*=i;
        }
        k=f1/(f2*f3);
        System.out.println("\nSonuç = " + k);
    }
}