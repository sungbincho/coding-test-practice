package Baekjoon;

import java.util.*;

class Dfs_G {
    int nodeCount;      // 정점 개수
    int virusComputer;
    ArrayList<ArrayList<Integer>> graph;        // 그래프
    boolean[] visitArr;         // 방문 확인 여부 배열

    // 생성자
    Dfs_G(int nodeCount){
        this.nodeCount = nodeCount;
        this.virusComputer = 0;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<nodeCount+1; i++)        // 그래프 정점의 ArrayList 생성
            this.graph.add(new ArrayList<Integer>());
        this.visitArr = new boolean[nodeCount + 1];
    }

    public void putTwoWay(int x, int y){
        this.graph.get(x).add(y);
        this.graph.get(y).add(x);

        Collections.sort(this.graph.get(x));
        Collections.sort(this.graph.get(y));
    }

    public void dfs(int startNode){
        visitArr[startNode] = true;
        this.virusComputer++;
        for(int i : this.graph.get(startNode))
            if(visitArr[i] == false)
                dfs(i);
    }

    public int getVirusComputer(){
        return this.virusComputer;
    }
}

class Bfs_G {
    int nodeCount;      // 정점 개수
    int virusComputer;
    ArrayList<ArrayList<Integer>> graph;        // 그래프
    Queue<Integer> queue;
    boolean[] visitArr;         // 방문 확인 여부 배열

    // 생성자
    Bfs_G(int nodeCount){
        this.nodeCount = nodeCount;
        this.virusComputer = 0;
        graph = new ArrayList<ArrayList<Integer>>();
        queue = new LinkedList<>();
        for(int i = 0; i<nodeCount+1; i++)        // 그래프 정점의 ArrayList 생성
            this.graph.add(new ArrayList<Integer>());
        this.visitArr = new boolean[nodeCount + 1];
    }

    public void putTwoWay(int x, int y){
        this.graph.get(x).add(y);
        this.graph.get(y).add(x);

        Collections.sort(this.graph.get(x));
        Collections.sort(this.graph.get(y));
    }

    public void bfs(int startNode){
        queue.add(startNode);
        while(!queue.isEmpty()){
            int queuePollNum = queue.poll();
            visitArr[queuePollNum] = true;
            this.virusComputer++;
            for(int i : this.graph.get(queuePollNum)){
                if (visitArr[i] == true || queue.contains(i))
                    continue;
                queue.add(i);
            }
        }
    }

    public int getVirusComputer(){ return this.virusComputer; }
}

public class B_2606_DFS_BFS_Virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int nodeCount = sc.nextInt();
        int edgeCount = sc.nextInt();

        Dfs_G dg = new Dfs_G(nodeCount);
        Bfs_G bg = new Bfs_G(nodeCount);

        for(int i = 0; i<edgeCount; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            dg.putTwoWay(x, y);
            bg.putTwoWay(x, y);
        }

        dg.dfs(1);
        System.out.println(dg.getVirusComputer()-1);

        bg.bfs(1);
        System.out.println(bg.getVirusComputer()-1);
    }
}
