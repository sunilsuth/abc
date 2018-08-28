public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {10, 74, 30, 46, 20, 36, 78, 45};
        int first = a[0];
int second=a[0];
        for (int i = 1; i <= 7; i++)
        {
            if (a[i] >first)
            {
                first=a[i];

            }
        }
        for(int j = 1; j <= 7; j++)
        {
            if(a[j]>second && a[j]<first)
            {
                second=a[j];
            }

        }
        System.out.println(second);

        System.out.println(first);
    }
}
