// 인접리스트로 BFS 구현

package Algorithm;

import java.util.*;

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

    // 그래프 return
    public ArrayList<ArrayList<Integer>> getGraph(){
        return bfsGraph;
    }

    // 그래프 노드 return
    public ArrayList<Integer> getNode(int index){
        return bfsGraph.get(index);
    }

    // 그래프 간선 추가 (양방향)
    public void putTwoWay(int x, int y){
        this.bfsGraph.get(x).add(y);
        this.bfsGraph.get(y).add(x);

        // 그래프 간선 정렬
        Collections.sort(this.bfsGraph.get(x));
        Collections.sort(this.bfsGraph.get(y));
    }

    // 그래프 간선 추가 (단방향)
    public void putOneWay(int x, int y){
        this.bfsGraph.get(x).add(y);

        // 그래프 간선 정렬
        Collections.sort(this.bfsGraph.get(x));
    }

    // 그래프 방문 여부 확인 배열 초기화
    public void clearVisitArray(){
        Arrays.fill(this.visitArray, false);
    }

    // 그래프 인접 리스트 출력
    public void printGraphToAdjList(){
        for(int i = 1; i < bfsGraph.size(); i++){
            System.out.print("정점 " + i + " 의 인접리스트 :");
            for(int j = 0; j < bfsGraph.get(i).size(); j++)
                System.out.print("-> " + bfsGraph.get(i).get(j));
            System.out.println();
        }
    }

    // 큐로 그래프 탐색
    public void bfs(int startNode){
        queue.add(startNode);
        while(!queue.isEmpty()){
            int queuePollNum = queue.poll();
            visitArray[queuePollNum] = true;
            System.out.println( queuePollNum + " ");

            for(int i : bfsGraph.get(queuePollNum)){
                if (visitArray[i] == true || queue.contains(i))
                    continue;
                queue.add(i);
            }
        }
    }
}

public class BfsAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertexCount = sc.nextInt();
        int edgeCount = sc.nextInt();
        int startNode = sc.nextInt();

        BfsGraph bfsgraph = new BfsGraph(vertexCount);

        // 정점과 간선 수동 입력
        for(int i = 0; i<edgeCount; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            bfsgraph.putTwoWay(x, y);
        }

        sc.close();

        // 입력한 정점과 간선으로 구성된 인접리스트 출력
        bfsgraph.printGraphToAdjList();

        // 정점 순서대로 그래프 탐색
        bfsgraph.bfs(startNode);
    }
}
