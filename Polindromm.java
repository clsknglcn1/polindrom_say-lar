import java.util.Scanner;

public class Polindromm {
    static boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("===============");
            System.out.println("sayı =>" + temp);


            lastNumber = temp % 10;//  10 a bölümünden kalan son basamagı verir
            System.out.println("son basamak =>" + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;// ilk basamğı verır
            System.out.println("yeni sayı=>" + reverseNumber);

            temp /= 10;
            System.out.println("yeni temp=>"+ temp);
        }
        if (number == reverseNumber )

        return true;

        else
            return false;

    }


    public static void main(String[] args) {
        isPolindrom(2002);


    }
}
