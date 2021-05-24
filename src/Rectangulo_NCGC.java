/**
 * 
 * @author Neylin Carolina Gutiérrez Camargo
 * Versión 1.2
 * 24/05/2021
 */
public class Rectangulo_NCGC extends FiguraGeometrica_NCGC {
	private double l1;
	private double l2;
	
	public Rectangulo_NCGC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Método que calcula el area del rectangulo
	 */	
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Metodo que calcula el perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
