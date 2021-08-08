package domein;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Cryptografie {
	private Deque<Character> stack;
	private Queue<Character> queue;
	private static final Character[] KLINKERS_ARR = {'a','e','i','o','u','y'};
	private static final Set<Character> KLINKERS_SET = new HashSet<>(Arrays.asList(KLINKERS_ARR));
	
	@SuppressWarnings("static-access")
	public String codeerBericht(String origineel) {
		stack = new ArrayDeque<>();
		queue = new ArrayDeque<>();
		
		String output = "";
	
	
		for (char chara: origineel.toCharArray())
			if (KLINKERS_SET.contains(chara))
				queue.offer(chara);		
			else stack.push(chara);
		
		for (char chara: origineel.toCharArray())
			if (KLINKERS_SET.contains(chara))
				output += String.format("%c", queue.poll());
			else output += String.format("%c", stack.pop());
			
			
			
	
		
		
		
		return output;
	}

}
