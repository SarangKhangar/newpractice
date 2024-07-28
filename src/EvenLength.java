public class EvenLength {

	public static void main(String[] args) {

		String s1 = "This is a java language";

		String[] strArr = s1.split(" ");

		for (String s : strArr) {

			if (s.length() % 2 == 0)
				System.out.println(s);

//			String n = "Sarang";
//			char[] arr = n.toCharArray();
//
//			arr.toString();

			StringBuilder sb = new StringBuilder("Sarang");
			System.out.println();
		}

	}

}
