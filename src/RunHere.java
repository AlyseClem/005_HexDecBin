
public class RunHere {

	public static void main(String[] args) {
	
		//Added hex to binary functionality (just for git practice)
		BinPower binpower = new BinPower(); //BinPower is class, binpower is instance
		binpower.setBinary();
		
		HexDecBin baseConverter = new HexDecBin();
		baseConverter.setHexNumber();
		baseConverter.convert();

	}

}
