package datastructure.chap12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11724
// 연결요소의 갯수
public class DFS_실전문제_01 {

    // dfs + 방문저장하는거 만들기?
    // 그래프 인접리스트 방식
    static List<List<Integer>> adjList = new LinkedList<>();
    // 방문체크 배열
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 수
        int M = Integer.parseInt(st.nextToken()); // 간선의 수

        // 정점의 수만큼 인접리스트 내부에 1차원 배열을 추가
        for (int i = 0; i < N; i++) {
            adjList.add(new LinkedList<>());
        }

        // 정점 수 만큼 방문체크 배열 초기화
        visited = new boolean[N];

        // 간선들을 연결하여 인접리스트에 연결정보 추가하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작점
            int e = Integer.parseInt(st.nextToken()); // 끝나는점

            // 무방향 그래프이므로 양쪽에 모두 연결정보 추가
            adjList.get(s-1).add(e);
            adjList.get(e-1).add(s);

        }
        //dfs를 수정하여 성공한 횟수를 기록함
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i]){
                // 여기서 제귀호출~~~
                DFS(i);
                count++;
            }
        }


    }
    //DFS 함수 -> idx로 들어롬 / 1번 정점으로 들어온거 겟

    private static void DFS(int current){
        visited[current] = true;
        adjList.get(current);

        List<Integer> currentList = adjList.get(current);
        for (Integer n : currentList) {
            if (!visited[n - 1]) DFS(n-1);
        }
    }

}
