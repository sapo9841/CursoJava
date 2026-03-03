package desafioscurso;

public class DesafioTemperatura {
	public static void main(String[] args) {
		double f = 98.6; //Temperatura corporal média
		final double c = (f - 32) * 5 / 9.0;
		
		System.out.printf("%.2f Fahrenheit equivale a %.2f °C.", f, c);
	}

}
