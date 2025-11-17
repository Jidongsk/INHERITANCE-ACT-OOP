import java.util.Scanner;
class takinginput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Input the first number: ");
        int num1 = myObj.nextInt(); 
        System.out.println("Input the second number: ");
        int num2 = myObj.nextInt();
        System.out.println("");
        System.out.println("Sum: " + (num1+num2));
        System.out.println("Difference: " + (num1-num2));
        System.out.println("Product: " + (num1*num2));
        System.out.println("Quotient: " + (num1/num2));

        myObj.close();
    }
}
