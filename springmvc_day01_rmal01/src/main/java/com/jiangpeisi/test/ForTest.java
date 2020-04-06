package com.jiangpeisi.test;

import org.junit.Test;

public class ForTest {
    @Test
    public void test(){
        String name1="lkadjsaflasflkas.pdf";
        String name2="faslkfjakldasd.txt";
        String[] words2 = name1.split("\\.");
        String[] words1=name2.split("\\.");
        for (String s : words1) {
            System.out.println(s);
        }
        System.out.println(words2[words2.length-1]);
        System.out.println(words2.length);
    }
}
