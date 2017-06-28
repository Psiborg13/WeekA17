package randomness;

public class Fraction {

	int num;
	int denom;
	
	public Fraction(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}

	public String toString(){
		return num+"/"+denom;
	}

	public int getNumerator() {
		return num;
	}

	public void setNumerator(int num) {
		this.num = num;
	}

	public int getDenominator() {
		return denom;
	}

	public void setDenominator(int denom) {
		this.denom = denom;
	}
	
	public void scale(int factor){
		num*=factor;
		denom*=factor;
	}
	
}
