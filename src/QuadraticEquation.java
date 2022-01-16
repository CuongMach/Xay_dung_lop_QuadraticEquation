public class QuadraticEquation {
    private double A;
    private double B;
    private double C;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c){
        this.A =a;
        this.B =b;
        this.C =c;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        this.A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        this.B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        this.C = c;
    }

    public double getDiscriminant(){
        return B * B - 4* A * C;
    }

    public double getRoot1(){
        return (-B + Math.sqrt(getDiscriminant()))/ 2 * A;
    }

    public double getRoot2(){
        return (-B - Math.sqrt(getDiscriminant()))/ 2 * A;
    }
}
