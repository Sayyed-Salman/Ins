
// Ceasr Cipher 
import java.util.Scanner;

public class cesarCipher {
    // decryption method
    public static String decrypt(String text, int k) {
        String message = text;
        char ch;
        int key = k;
        String decryptedString = "";
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);

                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                decryptedString += ch;
            }

            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key);

                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                decryptedString += ch;
            }

            else {
                decryptedString += ch;
            }
        }

        return decryptedString;
    }

    public static void main(String[] args) {
        String message, encryptedMessage = "";
        int key;
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Message:");
        message = sc.nextLine();

        System.out.println("Enter Key:");
        key = sc.nextInt();

        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);

                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptedMessage += ch;
            }

            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key);

                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                encryptedMessage += ch;
            }

            else {
                encryptedMessage += ch;
            }
        }
        sc.close();
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decrypt(encryptedMessage, key));
    }
}