import java.util.Random;

public class OTp {
    public static void main(String[] args)
    {
        System.out.println("Generating password using random");
        System.out.println("your new password is");
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklomnpqrstuvwxyz";
        String num ="0123456789";

        String val=caps+small+num;
        Random r =new Random();
        char[] password = new char[10];

        for (int i = 0; i < 10; i++)
        {
           password[i]= val.charAt(r.nextInt(val.length()));

        }
            System.out.println(password);
   }
}
