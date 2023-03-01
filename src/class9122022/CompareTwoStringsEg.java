package class9122022;

public class CompareTwoStringsEg {

	public static void main(String[] args) {
		String str1 = "I like black colour";
		String str2 = "I love bike ride";
		String str3 = "I like black colour";
		boolean result1 = str1.equals(str3);
		System.out.println("str1 and str3 is equal or not :" + result1);
		boolean result2 = str2.equals(str3);
		System.out.println("str2 and str3 is equal or not :" + result2);

	}

}
