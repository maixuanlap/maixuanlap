import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tempature {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number day");
        n = scanner.nextInt();
        System.out.println();
        List<Integer> array = new ArrayList<>();
        int sum =0;
        double Average;
        for (int i = 0 ; i <=n; i++){
            array.add(scanner.nextInt());
            sum =sum + array.get(i);
        }
        Average = (double)sum /(n+1);
        System.out.println("Average is :"+ Average);
        array.forEach(arrayr->{
            if(arrayr >Average){

                System.out.println("\n" +
                        "days with a higher temperature than average: "+array.indexOf(arrayr)+" *C: " + arrayr);
            }
        });

    }
}
