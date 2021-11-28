package Algorithm;

import java.util.*;

class Node {
    int x;
    int y;
    int depth;

    Node(int x, int y, int depth){
        this.x = x;
        this.y = y;
        this.depth  = depth;
    }
}

class Bfs_Graph {
    private int[][] arr;        // 미로
    private Queue<Node> queue;      // 노드 객체를 가진 큐
    private boolean[][] visitArr;       // 정점 방문 확인 배열 생성

    public Bfs_Graph(){
        this.arr = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1}
        };
        queue = new LinkedList<>();
        visitArr = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                visitArr[i][j] = false;
            }
        }
    }

    // 최단거리
    public void BFS(int s_x, int s_y, int e_x, int e_y){
        queue.add(new Node(s_x, s_y, 1));
        while(!queue.isEmpty()){
            Node node = queue.poll();
            visitArr[node.x][node.y] = true;
            System.out.println("(" + node.x + ", " + node.y + ")");

            // 좌
            if(node.y-1 >= 0 &&
                    node.y-1 < e_y+1 &&
                    arr[node.x][node.y-1] == 1 &&
                    visitArr[node.x][node.y-1] == false){
                queue.add(new Node(node.x,node.y-1,node.depth+1));
            }

            // 우
            if(node.y+1 >= 0 &&
                    node.y+1 < e_y+1 &&
                    arr[node.x][node.y+1] == 1 &&
                    visitArr[node.x][node.y+1] == false){
                queue.add(new Node(node.x,node.y+1,node.depth+1));
            }

            // 상
            if(node.x-1 >= 0 &&
                    node.x-1 < e_x+1 &&
                    arr[node.x-1][node.y] == 1 &&
                    visitArr[node.x-1][node.y] == false){
                queue.add(new Node(node.x-1,node.y,node.depth+1));
            }

            // 하
            if(node.x+1 >= 0 &&
                    node.x+1 < e_x+1 &&
                    arr[node.x+1][node.y] == 1 &&
                    visitArr[node.x+1][node.y] == false){
                queue.add(new Node(node.x+1, node.y,node.depth+1));
            }

            // 목적지 도착 체크
            if(visitArr[e_x][e_y]){
                System.out.println("완료");
                System.out.println(node.depth);
                break;
            }
        }
    }
}

public class Bfs_shortest_path {
    public static void main(String[] args) {
        Bfs_Graph bfs = new Bfs_Graph();
        bfs.BFS(3, 0, 2,5);
    }
}
