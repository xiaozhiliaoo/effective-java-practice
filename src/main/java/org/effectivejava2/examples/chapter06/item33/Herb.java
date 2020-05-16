// Using an EnumMap to associate data with an enum - Pages 161-162
package org.effectivejava2.examples.chapter06.item33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.*;

// Simplistic class representing a culinary herb - Page 161 HERB香草
public class Herb {
	public enum Type {
		ANNUAL,  //每年的
		PERENNIAL,// 多年生的
		BIENNIAL//二年生植物
	}

	private final String name;
	private final Type type;

	Herb(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Herb[] garden = { new Herb("Basil", Type.ANNUAL),//紫苏
				new Herb("Carroway", Type.BIENNIAL),//香菜
				new Herb("Dill", Type.ANNUAL),//莳萝
				new Herb("Lavendar", Type.PERENNIAL),//薰衣草
				new Herb("Parsley", Type.BIENNIAL),//欧芹
				new Herb("Rosemary", Type.PERENNIAL) };//迷迭香

		// Using an EnumMap to associate data with an enum - Page 162
		Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Type, Set<Herb>>(
				Herb.Type.class);
		for (Herb.Type t : Herb.Type.values())
			herbsByType.put(t, new HashSet<Herb>());
		for (Herb h : garden)
			herbsByType.get(h.type).add(h);
		System.out.println(herbsByType);
		/*Set<Herb>[] herbsByType = (Set<Herb>[])new Set[Type.values().length];
		for (int i = 0; i < herbsByType.length; i++) {
			herbsByType[i] = new HashSet<>();
		}
		for(Herb h:garden){
			herbsByType[h.type.ordinal()].add(h);
		}
		for (int i = 0; i < herbsByType.length; i++) {
			System.out.println("%s: %s %n",Herb.Type.values()[i],herbsByType[i]);
		}*/
	}
}
