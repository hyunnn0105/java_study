package datastructure.chap12;

import datastructure.chap11.graphMatrix.Vertex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// 인접리스트 형식 그래프 구현
public class GraphList {
    // 정점 저장하는 리스트
    private List<Vertex> vertices;
    // 그래프들의 연결관계를 저장할 인접 리스트
    private List<List<Vertex>> adjList;

    public GraphList() {
        vertices = new LinkedList<>(); // 정점들이 저장될 1차원 리스트
        adjList = new LinkedList<>(); // 정점의 관계들이 저장을 

        // 채우기
    }

    public void addVertex(Vertex v) {
        v.setId(vertices.size()); // 정점에 ID부여
        vertices.add(v); // 정점을 정점리스트에 부여
        adjList.add(new ArrayList<>()); // 인접리스트에 1차원리스트추가


    }

    // 간선 연결하기 (무방향 그래프)
    public void addEdge(Vertex departure, Vertex destination) {
        // 인접 행렬에 연결정보 저장

        adjList.get(departure.getId()).add(destination);
        adjList.get(destination.getId()).add(departure);
    }

    // 인접 리스트 그래프 출력
    public void showGraph() {

        for (int i = 0; i < adjList.size(); i++) {
            System.out.printf("%s | ", vertices.get(i).getData());
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.printf("%s ", adjList.get(i).get(j).getData());
            }
            System.out.println();
        }


    }
    // 깊이 우선 탐색 구현 - 스택방식
    public void DFS(Vertex starr) {
        // 스택 만들기 - VERtes in
        Stack<Vertex> stack = new Stack<>();

        // 탐색시작정점을 스택에 저장함
        stack.push(starr);

        // 스택이 빌 때까지 깊이우선탐색실행
        while (!stack.isEmpty()){
            Vertex current = stack.pop();
            // 해당정점의 방문처리
            current.setVisitflag(true);
            // 방문한 정점의 데이터를 출력
            System.out.printf("%s", current.getData());
            // 해당 정점에 연결되어 있는 다른 정점들을 찾아서 모두 스택에 저장
            List<Vertex> connectedVertices = adjList.get(current.getId());
            for (Vertex cv : connectedVertices) {
                if (!cv.isVisitflag()){
                    stack.push(cv);
                }
            }

        }
        System.out.println();
    }
    
    // 깊이 우선 탐색 구현
    public void DFS2(Vertex current){

        //탈출조건
        if (current.isVisitflag()){
            System.out.println();
            return;
        }
        
        // 현재 정점에 방문처리
        current.setVisitflag(true);
        // 현재정점에 출력
        System.out.printf("%s", current.getData());

        // 현재 정점에 있는 모든 정점을 가져오기
        List<Vertex> connectedVertices = adjList.get(current.getId());
        for (int i = connectedVertices.size() - 1; i >= 0; i--) {
            // 연결된 정점하나 가져오기
            Vertex v = connectedVertices.get(i);
            if (!v.isVisitflag()) {
                DFS2(v); // 방문되지 않은 정점 재귀호출
            }
        }




    }



}