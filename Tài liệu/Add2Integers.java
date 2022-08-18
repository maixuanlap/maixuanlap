/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Add2Integers {
    public static void main(String[] args) {
        int number1, number2,sum;
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter first integer");
        number1 = in.nextInt();
        number2 = in.nextInt();

        sum = number1 + number2;

        System.out.printf("The sum is: "+ sum);
        in.close();
    }
}
