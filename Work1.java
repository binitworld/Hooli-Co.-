// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Work1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of the work "+(i+1)+" which you have performed! :");
            names[i] =in.nextLine();
        }

        System.out.println();
        System.out.println("Your resulted output will be :");
        System.out.println();

        System.out.println(Arrays.toString(names));
    }
}