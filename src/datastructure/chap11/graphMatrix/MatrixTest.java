package datastructure.chap11.graphMatrix;

public class MatrixTest {
    public static void main(String[] args) {
        GraphMatrix gm = new GraphMatrix();

        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");

        // 정점을 그래프에 추가
        gm.addvertex(A);
        gm.addvertex(B);
        gm.addvertex(C);
        gm.addvertex(D);
        gm.addvertex(E);

        gm.addEdge(A,B);
        gm.addEdge(B,E);
        gm.addEdge(E,D);
        gm.addEdge(B,C);

        gm.showGraph();

    }
}
