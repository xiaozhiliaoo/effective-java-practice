package org.effectivejava2.examples.chapter06.item32;

/**
 * Created by lili on 2017/6/30.
 */
public class Text2 {
    private static final int STYLE_BOLD = 1 << 0;
    private static final int STYLE_ITALIC = 1 << 1;
    private static final int STYLE_UNDERLINE = 1 << 2;
    private static final int STYLE_STRIKETHROUGH = 1 << 3;

    public void applyStyle(int styles){
        System.out.println(styles);
    }

    public static void main(String[] args) {
        Text2 text2 = new Text2();
        text2.applyStyle(STYLE_BOLD | STYLE_STRIKETHROUGH);
    }
}
