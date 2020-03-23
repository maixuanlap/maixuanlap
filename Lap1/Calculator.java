import java.util.Scanner;

public class Calculator {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
  int []myInterger=initArray(5);
  for (int i=0;i<myInterger.length;i++){
      System.out.println("Element"+i+",typed value was "+myInterger[i]);
  }
  System.out.println("the average is"+getAvarage(myInterger));
  for(int i=myInterger.length-1;i>=0;i--){
      System.out.println("Element"+i+",typed value was "+myInterger[i]);
  }
    }
     public  static int[]initArray(int size){
        System.out.println("Enter"+size+"interger values.\r");
        int[]values=new int[size];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
        }
     public static double getAvarage(int[]array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
}
}

