package Baekjoon;

import java.util.*;

class DfsGraph{
    private int vertexCount;        // 정점의 개수
    private ArrayList<ArrayList<Integer>> dfsGraph;     // 그래프
    private boolean[] visitArray;       // 정점 방문 확인 배열

    // 그래프 생성자
    public DfsGraph(int vertexCount){
        this.vertexCount = vertexCount;     // 정점 개수 초기화
        this.dfsGraph = new ArrayList<ArrayList<Integer>>();        // 그래프 생성
        for(int i = 0; i<vertexCount+1; i++)        // 그래프 정점의 ArrayList 생성
            this.dfsGraph.add(new ArrayList<Integer>());
        this.visitArray = new boolean[vertexCount + 1];     // 정점 방문 확인 배열 생성
    }

    // 그래프 간선 추가 (양방향)
    public void putTwoWay(int x, int y){
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);

        // 그래프 간선 정렬
        Collections.sort(dfsGraph.get(x));
        Collections.sort(dfsGraph.get(y));
    }

    // 재귀함수로 그래프 탐색
    public void dfs(int index){
        this.visitArray[index] = true;
        System.out.print(index + " ");

        for(int i : this.dfsGraph.get(index)){
            if(visitArray[i] == false){
                dfs(i);
            }
        }
    }
}

class BfsGraph {
    private int vertexCount;        // 정점 개수
    private ArrayList<ArrayList<Integer>> bfsGraph;
    private Queue<Integer> queue;
    private boolean[] visitArray;

    // 그래프 생성자
    public BfsGraph(int vertexCount){
        this.vertexCount = vertexCount;     // 정점 개수 초기화
        this.bfsGraph = new ArrayList<ArrayList<Integer>>();        // 그래프 생성
        queue = new LinkedList<>();     // queue 생성
        for(int i = 0; i<vertexCount+1; i++){
            bfsGraph.add(new ArrayList<>());
        }
        visitArray = new boolean[vertexCount + 1];
    }

    // 그래프 간선 추가 (양방향)
    public void putTwoWay(int x, int y){
        this.bfsGraph.get(x).add(y);
        this.bfsGraph.get(y).add(x);

        // 그래프 간선 정렬
        Collections.sort(this.bfsGraph.get(x));
        Collections.sort(this.bfsGraph.get(y));
    }

    // 큐로 그래프 탐색
    public void bfs(int startNode){
        queue.add(startNode);
        while(!queue.isEmpty()){
            int queuePollNum = queue.poll();
            visitArray[queuePollNum] = true;
            System.out.print( queuePollNum + " ");

            for(int i : bfsGraph.get(queuePollNum)){
                if (visitArray[i] == true || queue.contains(i))
                    continue;
                queue.add(i);
            }
        }
    }
}

public class B_1260_DFS_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertexCount = sc.nextInt();
        int edgeCount = sc.nextInt();
        int startNode = sc.nextInt();

        BfsGraph bfsgraph = new BfsGraph(vertexCount);
        DfsGraph dfsgraph = new DfsGraph(vertexCount);

        // 정점과 간선 수동 입력
        for(int i = 0; i<edgeCount; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            dfsgraph.putTwoWay(x, y);
            bfsgraph.putTwoWay(x, y);
        }

        sc.close();

        // 정점 순서대로 그래프 탐색
        dfsgraph.dfs(startNode);
        System.out.println();
        bfsgraph.bfs(startNode);
    }
}
