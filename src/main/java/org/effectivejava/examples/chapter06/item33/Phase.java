// Using a nested EnumMap to associate data with enum pairs - Pags 163-164
package org.effectivejava.examples.chapter06.item33;

import java.util.EnumMap;
import java.util.Map;

public enum Phase {
	SOLID, LIQUID, GAS;//固，液，气

	//过渡
	public enum Transition {
		MELT(SOLID, LIQUID),//熔化
		FREEZE(LIQUID, SOLID),//冻结
		BOIL(LIQUID, GAS),//煮沸
		CONDENSE(GAS, LIQUID),//凝结
		SUBLIME(SOLID, GAS),//纯化
		DEPOSIT(GAS, SOLID);//沉淀

		private final Phase src;
		private final Phase dst;

		Transition(Phase src, Phase dst) {
			this.src = src;
			this.dst = dst;
		}

		// Initialize the phase transition map
		private static final Map<Phase, Map<Phase, Transition>> m =
				new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);
		static {
			for (Phase p : Phase.values())
				m.put(p, new EnumMap<Phase, Transition>(Phase.class));
			for (Transition trans : Transition.values())
				m.get(trans.src).put(trans.dst, trans);
		}

		public static Transition from(Phase src, Phase dst) {
			return m.get(src).get(dst);
		}
	}

	// Simple demo program - prints a sloppy table
	public static void main(String[] args) {
		for (Phase src : Phase.values())
			for (Phase dst : Phase.values())
				if (src != dst)
					System.out.printf("%s to %s : %s %n", src, dst,
							Transition.from(src, dst));
	}
}
