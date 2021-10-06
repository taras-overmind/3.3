
public class Main {
	 
	public static void main(String[] args) {
		Converter c=new Converter(27, 31);
		System.out.println(c.hrn_to_usd(540));
		System.out.println(c.usd_to_hrn(300));
		System.out.println(c.hrn_to_euro(651));
		System.out.println(c.euro_to_hrn(200));

	}

}
