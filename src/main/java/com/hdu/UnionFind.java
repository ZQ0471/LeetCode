package com.hdu;

import java.util.Arrays;

/**
 * @author zhang
 * @since 2024/7/22 下午2:18
 */
// 开启了路径压缩和按秩合并的并查集
public class UnionFind {
    int[] parent;
    int[] size;
    // 当前连通分支数目
    int branchCount;

    public UnionFind(int n) {
        this.branchCount = n;
        this.parent = new int[n];
        this.size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        // 路径压缩
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }

    public boolean unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return false;
        }
        // 按秩合并
        if (size[x] < size[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        parent[y] = x;
        size[x] += size[y];
        --branchCount;
        return true;
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public int branchCount() {
        return branchCount;
    }
}
