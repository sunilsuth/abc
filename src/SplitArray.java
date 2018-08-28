public class SplitArray {
    public static void main(String[] args) {
        int a[] = {10, 74, 30, 46, 20, 36, 78, 45};
        int b[] = new int[4];
        int c[] = new int[4];
        for (int i = 0; i <4; i++) {
            b[i] = a[i];
        }
        int k = 0;
        for (int i =4 ; i < 8; i++) {

            c[k] = a[i];
            k++;
        }
        for (int i = 0; i < b.length; i++) {


            System.out.print(b[i]);
        } for (int i = 0; i < c.length; i++) {
            System.out.println("   ");

            System.out.print(c[i]);
        }


    }
}
