package practical3;

import java.util.Scanner;

public class RailFence {
    public static void main(String[] args) {
        String msg;
        String s = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string : ");
        msg = sc.next();
        sc.close();
        int i;

        System.out.println("String : " + msg);

        for (i = 0; i < msg.length(); i = i + 2) {
            char c = msg.charAt(i);
            s = s + c;
            System.out.print(c);
        }
        for (int j = 1; j < msg.length(); j = j + 2) {
            char c = msg.charAt(j);
            s = s + c;
            System.out.print(c);
        }

        System.out.println("\nCipher text is " + s);
    }
}
