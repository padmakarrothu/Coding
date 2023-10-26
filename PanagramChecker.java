 import java.util.Scanner;
 class PanagramChecker {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		boolean letterspresent=true;
		for (char ch='a';ch<='z' ;ch++ )
		{
			if (!s.contains(String.valueOf(ch)))
			{
				letterspresent=false;
				break;
			}
		}
		if (letterspresent)
		{
			System.out.println(s+"is panagram");
		}
		else
		{
			System.out.println("is not a panagram");
		}
	}
        
}
