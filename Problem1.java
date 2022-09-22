import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    char op;
    Double n1, n2, output;
    Scanner inp = new Scanner(System.in);

    System.out.println("Enter first value");
    n1 = inp.nextDouble();

    System.out.println("Enter second value");
    n2 = inp.nextDouble();
   
    System.out.println("Choose an operator: +, -, *, /");
    op = inp.next().charAt(0);
    switch (op) {
       
      case '+':
        output = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + output);
        break;

      case '-':
        output = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + output);
        break;

      case '*':
        output = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + output);
        break;

      case '/':
          if(n2==0){
            System.out.println("Second Value can't be zero for Division");
            break;
          }
        output = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + output);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}
