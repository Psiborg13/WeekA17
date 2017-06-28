package randomness;

public class P57 {

	public static void main(String[] args) {
		Fraction answer = startFraction(2);
		System.out.println(answer.toString());
	}

	public static Fraction startFraction(int iterations){
		Fraction botFraction = getFraction(iterations-1);
		return new Fraction(botFraction.getDenominator()+botFraction.getNumerator(), botFraction.getNumerator());
	}
	
	public static Fraction getFraction(int iterations){
		Fraction botFraction;
		if(iterations == 1){
			botFraction = new Fraction(1, 2);
		}
		else{
			botFraction = getFraction(iterations-1);
		}
		Fraction f1 = new Fraction(2, 1);
		Fraction f2 = new Fraction(botFraction.getDenominator(), botFraction.getNumerator());
		f1.scale(f2.getDenominator());
		Fraction fTotal = new Fraction(f1.getNumerator()+f2.getNumerator(), f1.getDenominator());
		return fTotal;
	}
}
