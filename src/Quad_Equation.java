public class Quad_Equation {
    double a, b, c;
    public Quad_Equation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta(){
        return Math.pow(b,2) - (4 * a * c) ;
    }

    public double get1Root(){
        return (-b) / (2*a) ;
    }

    public double getRoot1(){
        return ((-b) + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2*a) ;
    }
    public double getRoot2(){
        return ((-b) - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2*a) ;
    }

}
