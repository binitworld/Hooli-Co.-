import java.util.Arrays;
import java.util.Scanner;

public class CompanyData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] Data = new String[7];

        for (int i = 0; i < Data.length; i++) {
            System.out.print("Enter the "+(i+1)+" Data of company :");
            Data[i]=in.nextLine();

        }
        System.out.println();
        System.out.println("The Company Data services includes these fields");
        System.out.println();

        System.out.println(Arrays.toString(Data));
    }

    @Override
    public String toString() {
        return "CompanyData []";
    }
}
