// Enum with integer data stored in an instance field
package org.effectivejava.examples.chapter06.item31;

public enum Ensemble {
	SOLO(1),//独奏
	DUET(2),//二重奏
	TRIO(3),//三重唱
	QUARTET(4),//四重奏
	QUINTET(5),//五重奏
	SEXTET(6),//六重奏
	SEPTET(7),//七重奏
	OCTET(8),//八重奏
	DOUBLE_QUARTET(8),//双四重奏
	NONET(9),//九重奏
	DECTET(10),//十重奏
	TRIPLE_QUARTET(12);//十二重奏

	private final int numberOfMusicians;

	Ensemble(int size) {
		this.numberOfMusicians = size;
	}

	public int numberOfMusicians() {
		return numberOfMusicians;
	}
}
