package github;

class RBI{
	float getROI() {
		return 5.0f;
	}
}

class BOI extends RBI{
	float getROI() {
		return 6.0f;
	}
}

class Kotak extends RBI{
	float getROI() {
		return 7.0f;
	}
}

public class Overriding {
	public static void main(String[] args) {
		BOI boi = new BOI();
		Kotak kotak = new Kotak();
		
		System.out.println("Bank of India return "+boi.getROI()+" percent rate of interest");
		System.out.println("Kotak bank return "+kotak.getROI()+" percent rate of interest");
	}
}
