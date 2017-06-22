package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by wt on 2016/10/13.
 */

public class ConnectedComponentCount {//计算无向图连通分量个数

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int verNum = in.nextInt();
        int grid[][] = new int[verNum][verNum];
        for(int i = 0;i<verNum;i++)
            for(int j = 0;j<verNum;j++)
                grid[i][j] = in.nextInt();
        System.out.println(GetCount(grid));
    }
    public static void BFS(int[][] G, int edgeNum, int begin, boolean[] visited)
    {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(begin);
        visited[begin] = true;


        while (!Q.isEmpty())
        {
            int tmp = Q.peek();
            Q.poll();
            for (int i = 0; i < edgeNum; i++)
            {
                if (!visited[i] && G[tmp][i]==1)
                {
                    Q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static int GetCount(int[][] grid){
        int count = 0;
        int verNum = grid.length;
        boolean[] visited = new boolean[verNum];
        for (int i = 0; i < verNum; i++)  {
            if (!visited[i])
            {
                BFS(grid,verNum,i,visited);
                count++;
            }
        }
        return count;
    }


}
