import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Quadratic Equation's standard form is: ax^2 + bx + c = 0");
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        var eq = new Quad_Equation(a,b,c);
        System.out.println("Delta = " + eq.getDelta());

        if (eq.getDelta()>0){
            System.out.println("The equation has 2 roots: " + eq.getRoot1() + " & " + eq.getRoot2());
        }
        else if(eq.getDelta()==0){
            System.out.println("The equation has only 1 root: " + eq.get1Root());
        }
        else{
            System.out.println("The equation has no roots");
        }


    }
}
