
public class Circulo_NCGC extends FiguraGeometrica_NCGC {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_NCGC(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		if(radio<0) {
			radio= radio*1;
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
