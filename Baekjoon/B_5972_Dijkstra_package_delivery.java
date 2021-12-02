/**
 * 백준 5972
 * Dijkstra Algorithm
 * ArrayList로 그래프 표현
 * Priority queue 사용
 * class Node 생성
 */

package Baekjoon;

import java.io.*;
import java.util.*;

public class B_5972_Dijkstra_package_delivery {
    static final int INF = 999999999;
    static int sum = 0;
    static List<List<Node>> graph = new ArrayList<>();
    static int[] distance;
    static boolean[] visited;

    static class Node implements Comparable<Node>{
        int idx;        // 도착 노드의 인덱스
        int dist;       // 가중치

        Node(int idx, int dist){        //생성자
            this.idx = idx;
            this.dist = dist;
        }

        // 우선순위 큐를 사용하기 위한 compareTo 오버라이드
        // dist를 기준으로 오름차순 정렬한다.
        @Override
        public int compareTo(Node o){
            return this.dist - o.dist;
        }
    }

    public static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>();  // 우선 순위큐
        distance[start] = 0;
        queue.add(new Node(start, 0));
        while(!queue.isEmpty()){
            Node e = queue.poll();
            if(visited[e.idx])
                continue;
            visited[e.idx] = true;

            for(Node linkedNode :graph.get(e.idx)){
                if(e.dist + linkedNode.dist < distance[linkedNode.idx]){
                    distance[linkedNode.idx] = e.dist + linkedNode.dist;
                    queue.add(new Node(linkedNode.idx, distance[linkedNode.idx]));
                    sum +=linkedNode.dist;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        for(int i = 0; i < N; i++)
            graph.add(new LinkedList<>());

        distance = new int[N];      // 최단거리를 담아놓을 배열
        visited = new boolean[N];       // 방문여부 체트
        Arrays.fill(distance, INF);     // 최단거리 배열은 INF로 초기화한다.

        // 연결 그래프 생성
        // u - 1, v - 1을 하는 이유는 0번 인덱스부터 시작하기 위함
        for(int i = 0; i<M; i++){
            stk = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(stk.nextToken());  // 출발점
            int v = Integer.parseInt(stk.nextToken());  // 도착점
            int w = Integer.parseInt(stk.nextToken());  // 가중치
            graph.get(u-1).add(new Node(v-1, w));   // 양방향 그래프
            graph.get(v-1).add(new Node(u-1, w));   // 양방향 그래프
        }

        dijkstra(0);    // k번 노드부터 탐색 시작
        System.out.println(distance[N-1]);

    }
}
