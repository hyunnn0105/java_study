
package datastructure.chap11.graphMatrix;
// 인접행렬방식 그래프 구현
// : 탐색시에 사용하는 구조
// 단)크기 증가XX
public class GraphMatrix {

    // 1. 정점클래스 생성

    // 2. 최대 정점 갯수
    public static final int MAX = 50;

    // 3. 그래프의 인접방향을 저장할 인접 행렬
    private int[][] adjMatrix;

    // 정점을 모아볼 배열 - 안에 아이디가 키값
    private  Vertex[] vertices;

    // 현재 그래프에 저장되어있는 정점의 수
    private int numOfVertice;

    public GraphMatrix(){
        adjMatrix = new int[MAX][MAX];
        vertices = new Vertex[MAX];
    }

    public void addvertex(Vertex v){

        // 정점 객체에 id부여 : 0~순차적 증가
        v.setId(numOfVertice);

        // 정점 배열에 추가
        vertices[numOfVertice++] = v;
    }

    // 간선 연결하기(무방향그래프 - 서로 연결)
    public void addEdge(Vertex departure, Vertex destination){
        //인접 행렬에 연결정보 저장
        adjMatrix[departure.getId()][destination.getId()] = 1;
        adjMatrix[destination.getId()][departure.getId()] = 1;

    }

    // 인접 행렬 출력
    public void showGraph() {
        System.out.print("    ");
        for (int i = 0; i < numOfVertice; i++) {
            System.out.print(vertices[i].getData() + " ");
        }
        System.out.println();

        for (int i = 0; i < numOfVertice; i++) {
            System.out.printf("%s | ", vertices[i].getData());
            for (int j = 0; j < numOfVertice; j++) {
                System.out.printf("%d ", adjMatrix[i][j]);
            }
            System.out.println();
        }
    }

}
