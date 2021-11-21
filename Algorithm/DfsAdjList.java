// 인접리스트로 DFS 구현

package Algorithm;

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

    // 그래프 return
    public ArrayList<ArrayList<Integer>> getGraph(){
        return dfsGraph;
    }

    // 그래프 노드 return
    public ArrayList<Integer> getNode(int index){
        return dfsGraph.get(index);
    }

    // 그래프 간선 추가 (양방향)
    public void putTwoWay(int x, int y){
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);

        // 그래프 간선 정렬
        Collections.sort(dfsGraph.get(x));
        Collections.sort(dfsGraph.get(y));
    }

    // 그래프 간선 추가 (단방향)
    public void putOneWay(int x, int y){
        this.dfsGraph.get(x).add(y);

        // 그래프 간선 정렬
        Collections.sort(dfsGraph.get(x));
    }

    // 그래프 방문 여부 확인 배열 초기화
    public void clearVisitArray(){
        Arrays.fill(this.visitArray, false);
    }

    // 그래프 인접 리스트 출력
    public void printGraphToAdjList(){
        for(int i = 1; i < dfsGraph.size(); i++){
            System.out.print("정점 " + i + " 의 인접리스트 :");
            for(int j = 0; j < dfsGraph.get(i).size(); j++)
                System.out.print("-> " + dfsGraph.get(i).get(j));
            System.out.println();
        }
    }

    // 그래프 탐색 (재귀호출)
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

public class DfsAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertexCount = sc.nextInt();
        int edgeCount = sc.nextInt();
        int startNode = sc.nextInt();

        DfsGraph dfsgraph = new DfsGraph(vertexCount);

        // 정점과 간선 수동 입력
        for(int i=0; i < edgeCount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            dfsgraph.putTwoWay(x, y);
        }

        sc.close();

        // 입력한 정점과 간선으로 구성된 인접리스트 출력
        // dfsgraph.printGraphToAdjList();

        // 정점 순서대로 그래프 탐색
        dfsgraph.dfs(startNode);
    }
}