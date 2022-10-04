package practical2;

import java.util.*;

public class VernamCipher {
    public static void main(String[] args) {
        char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        int n1[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String message = sc.nextLine();
        System.out.print("Enter OTP : ");
        String otp = sc.nextLine();
        String result = "";
        char msgchar, otpchar;
        int p1 = 0, p2 = 0;
        sc.close();

        if (message.length() != otp.length()) {
            System.out.println("Please Enter OTP same length as the message:");
            otp = sc.nextLine();
        }

        for (int i = 0; i < message.length(); i++) {

            msgchar = (char) (message.charAt(i));
            otpchar = (char) (otp.charAt(i));

            for (int j = 0; j < c.length; j++) {
                if (msgchar == c[j]) {
                    p1 = n1[j];
                }
                if (otpchar == c[j]) {
                    p2 = n1[j];
                }
            }

            int p = p1 + p2;

            System.out.println(p1 + "+" + p2 + "=" + p);
            if (p > 26) {
                p = p - 26;
            }
            char c1 = c[p];
            System.out.println("Character at " + p + " is " + c1);
            result += c1;
        }
        System.out.println("Cipher Text is " + result);
    }
}
