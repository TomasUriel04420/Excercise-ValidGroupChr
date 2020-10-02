package net.tuhb.algorithm.excercise.validator;

import java.util.Stack;
import java.util.HashMap;

public class FormatValidator {
	
	
	private Stack<Character> cStack = new Stack<Character>();
		
	private HashMap<Character,Character> chrPair = new HashMap<Character,Character>();
	
	{
		chrPair.put('(',')');
		chrPair.put('{','}');
		chrPair.put('[',']');
	}
	
	public boolean validateFormat(String cadena) {
		boolean ban = false;
		
		emptyStack();
		
		if(cadena != null && !cadena.isEmpty()) {
			for(Character chr: cadena.toCharArray()) {
				if(chrPair.containsKey(chr) || chrPair.containsValue(chr)) {
					if(chrPair.containsKey(chr))
						cStack.push(chr);
					else if(!cStack.empty() && chrPair.containsValue(chr) && chrPair.get(cStack.peek()) == chr)
						cStack.pop();
					else if(chrPair.containsValue(chr))
						cStack.push(chr);
				}
			}
			
			if(cStack.empty())
				ban = true;
		}
		
		return ban;
	}
	
	private void emptyStack() {
		while(!cStack.empty())
			cStack.pop();		
	}

}
