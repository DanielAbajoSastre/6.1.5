package figuras;

public class Circunferencia {
    //private static final String e = "rojo";
    public class e{
        String clr = "rojo";

    }
    //public static final double PI = 3.1416;
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

	public double getRadio() {
		return radio;
	}

	public void imprimir() {
        /// String color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + new e().clr);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

//    private double calcularArea() {
//        double area = 2 * 3.1416 * radio * radio;
//        return area;
//    }

//    private double d() {
//        return 2 * radio;
//    }

    public void setRadio(double radio) {
		this.radio = radio;
	}

	public boolean esIgual(boolean considerarDecimales,Circunferencia otro) {
        double radio2 = this.radio;
        double radio1 = otro.getRadio();
        if (considerarDecimales) {
            return radio2 == radio1;
        } else {
            return Math.abs(radio2 - radio1) < 1;
        }
    }
}

