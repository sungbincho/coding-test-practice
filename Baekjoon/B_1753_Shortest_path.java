/**
 * 백준 1753
 * Dijkstra Algorithm
 * ArrayList로 그래프 표현
 * Priority queue 사용
 */

package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge>{
    int destination;
    int weight;

    public Edge(int destination, int weight){
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge e){
        return Integer.compare(this.weight, e.weight);
    }
}

public class B_1753_Shortest_path {
    static ArrayList<Edge>[] graph;     // 그래프
    static boolean[] visited;       // 방문 확인 여부 배열
    static int[] dist;          // 최단 거리 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(stringTokenizer.nextToken());
        int E = Integer.parseInt(stringTokenizer.nextToken());
        int start = Integer.parseInt(br.readLine());

        // 그래프 생성
        graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++)
            graph[i] = new ArrayList<>();

        // 그래프 초기화
        for (int i = 0; i < E; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(stringTokenizer.nextToken());
            int v = Integer.parseInt(stringTokenizer.nextToken());
            int w = Integer.parseInt(stringTokenizer.nextToken());
            graph[u].add(new Edge(v, w));   // 방향성이 있기 때문에 하나만
        }

        visited = new boolean[V + 1];
        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dijkstra(start);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i<=V; i++){
            if (dist[i] != Integer.MAX_VALUE)
                stringBuilder.append(dist[i] + "\n");
            else
                stringBuilder.append("INF\n");
        }
        System.out.print(stringBuilder.toString());
    }

    public static void dijkstra(int start){
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(start, 0));
        dist[start] = 0;
        while(!priorityQueue.isEmpty()){
            Edge edge = priorityQueue.poll();
            if(visited[edge.destination])
                continue;
            visited[edge.destination] = true;

            for(Edge next : graph[edge.destination]){
                if (dist[next.destination] >= dist[edge.destination] + next.weight){
                    dist[next.destination] = dist[edge.destination] + next.weight;
                    priorityQueue.add(new Edge(next.destination, dist[next.destination]));
                }
            }
        }
    }
}
