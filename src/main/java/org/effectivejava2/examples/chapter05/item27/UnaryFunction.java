// Unary function - page 131
package org.effectivejava2.examples.chapter05.item27;

/**
 * 一元函数
 * @param <T>
 */
public interface UnaryFunction<T> {
	T apply(T arg);
}
