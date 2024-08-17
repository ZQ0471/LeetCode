package com.hdu;

/**
 * @author zhang
 * @since 2024/7/16 上午10:24
 */
public class Union {
    int [] parent;
    public Union(int n) {
        parent = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
    }
    //存入a->b
    public void join(int a, int b) {
        a = find(a);
        b = find(b);
        if(a == b) return;
        parent[a] = b;
    }
    public int find(int x) {
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }
    public boolean isSame(int a, int b) {
        a = find(a);
        b = find(b);
        return find(a) == find(b);
    }
}
