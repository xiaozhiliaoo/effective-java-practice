package org.effectivejava.examples.chapter07.item44;

/**
 * Created by lili on 2017/7/2.
 */
public class ListDoc {
    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
//    E get(int index);

    /**
     *
     * @param start
     * @param end
     * @return
     * @throws NullPointerException
     */
    public int sum(int start,int end){
        return start+end;
    }


}
