package fundamentos;

public class Inferencia {
	
	//Vamo usar o var, que faz com que voçê não precise colocar maualmente o tipo de dado para tal variavel.
	//As variaveis em Java sempre são de determinado tipo e isso nunca vai mudar, int sempre será int, double, string......
	
	public static void main(String[] args) {
		double a = 4.5; //declaração e inicialização da variavel
		System.out.println(a);
		
		a = 12.5;
		System.out.println(a);
		
		/*
		a = "Texxto";
		System.out.println(a);
		error: Type mismatch: cannot convert from String to double
		*/
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada!
		// var deve ser declarado e inicializado na mesma linha
		
		/*
	    var e = 12; - inteiro
		e = 12.01; - casas decimais
		valores com casas decimais recebem valores inteiros porém o contrátio não é possível
		*/
		
	}

}
