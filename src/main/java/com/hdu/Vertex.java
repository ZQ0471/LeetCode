package com.hdu;

import java.util.List;

/**
 * @author zhang
 * @since 2024/7/22 上午10:44
 */

public class Vertex {
    int index;
    List<Integer> next;
    public Vertex(int index, List<Integer> next) {
        this.index = index;
        this.next = next;
    }

}
