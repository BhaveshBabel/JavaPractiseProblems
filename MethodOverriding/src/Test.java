class Bank{
	int getrateOfInterest(){
		return 0;
	}
}

class SBI extends Bank{
	int getrateOfInterest() {
		return 9;
	}
}

class ICICI extends Bank{
	int getrateOfInterest() {
		return 8;
	}
}

class OBC extends Bank{
	int getrateOfInterest() {
		return 7;
	}
}

public class Test {
	public static void main(String[] args) {
		
		SBI s1 = new SBI();
		ICICI i1 = new ICICI();
		OBC o1 = new OBC();
		
		System.out.println("SBI Rate Of Interest : "+s1.getrateOfInterest());
		System.out.println("ICICI Rate Of Interest : "+i1.getrateOfInterest());
		System.out.println("OBC Rate Of Interest : "+o1.getrateOfInterest());
	}
}
