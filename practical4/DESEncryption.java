import java.util.*;
import javax.crypto.*;

public class DESEncryption {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            String s;
            System.out.println("Enter a string :");
            s = sc.nextLine();
            sc.close();
            KeyGenerator key = KeyGenerator.getInstance("DES");
            SecretKey sk = key.generateKey();

            Cipher cip = Cipher.getInstance("DES");
            cip.init(Cipher.ENCRYPT_MODE, sk);
            byte[] encrypted = cip.doFinal(s.getBytes());
            cip.init(Cipher.DECRYPT_MODE, sk);
            byte[] decrypted = cip.doFinal(encrypted);

            System.out.println("Encrypted text: " + new String(encrypted));
            System.out.println("Decrypted text: " + new String(decrypted));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
