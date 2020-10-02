package net.tuhb.algorithm.excercise.validator;

public class FormatValidatorTest {
	public static void main(String[] args) {
		FormatValidator fv = new FormatValidator();
		
		System.out.println("=========================> FormatValidatorTest <=======================");
		
		String strTest[] = {null,
							"",
							"}",
							"{",
							"()",
				            ")(",
							"[]",
							"{}",
							"()()",
							"[][]",
							"{}{}",
							"{}[]()",
							"([{}])",
							"[{()}]",
							"{([])}",
							"{([})]",
							"{([]}",
							"[{()}",
							"{([])}()[{()}]",
							"{([])})[{()}]",
							"{([)}()[{()}]",
							"{([])}(){()}]",
							"a+(c-d)",
							"e/[3*{f-1}]",
							"(g+h)*{(i/j)-3}",
							"e/[3*f-1}]",
							"{([])}()[{()}]{([])}()[{()}]{([])}()[{()}]{([])}()[{()}]{([])}()[{()}]{([])}()[{()}]",
							"{([])}()[{()}]{([])}()[{()}]{([])}()[{)}]{([])}()[{()}]{([])}()[{()}]{([])}()[{()}]",
							"{([])}()[{()}]}{([])}()[{()}]{([])}()[{()}]{()])}()[{()}]{([])}()[{()}]{([])}()[{()}]"};
		
		int i= 1;
		
		for(String tstCase: strTest) {
			System.out.println("Test "+i+": "+tstCase);
			System.out.println("Test "+i+" result: "+fv.validateFormat(tstCase));
			
			i++;
		}
		
		System.out.println("================================>  Fin  <==============================");
	}
}
