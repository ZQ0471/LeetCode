package com.hdu;

/**
 * @author zhang
 * @since 2024/7/22 上午9:23
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 宽度优先搜索
 * @author hh
 */
public class Bfs {

    int [][] dir = new int[][] {{0,1}, {1,0},{-1,0},{0,-1}};
    public void bfs(int[][] grid, boolean[][] visited, int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        visited[x][y] = true;
        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dir[i][0];
                int nextY = p.y + dir[i][1];
                if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length) continue;  // 越界了，直接跳过
                if (!visited[nextX][nextY]&&grid[nextX][nextY]==1) {
                    q.add(new Point(nextX, nextY));
                    visited[nextX][nextY] = true;
                }
            }
        }
    }
}