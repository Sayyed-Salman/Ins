import java.util.*;
import javax.crypto.*;

class AESEncryption {
    public static void main(String[] args) {

        try {
            // Taking Input from input stream
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String s = sc.nextLine();

            // Key Generation
            KeyGenerator key = KeyGenerator.getInstance("AES");
            // change "AES" to "DES" for part b
            SecretKey sk = key.generateKey();

            // Encryption and Decryption
            Cipher cip = Cipher.getInstance("AES");
            // change "AES" to "DES" for part b
            cip.init(Cipher.ENCRYPT_MODE, sk);
            byte[] encrypted = cip.doFinal(s.getBytes());

            cip.init(Cipher.DECRYPT_MODE, sk);
            byte[] decrypted = cip.doFinal(encrypted);

            // Output
            System.out.println("Encrypted String: " + new String(encrypted));
            System.out.println("Decrypted String: " + new String(decrypted));
            sc.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}