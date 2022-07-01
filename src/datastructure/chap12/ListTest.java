package datastructure.chap12;

import datastructure.chap11.graphMatrix.GraphList;
import datastructure.chap11.graphMatrix.GraphMatrix;
import datastructure.chap11.graphMatrix.Vertex;

public class ListTest {
    public static void main(String[] args) {

        GraphList gm = new GraphList();
        datastructure.chap12.GraphList gl = new datastructure.chap12.GraphList();

        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");

        // 정점을 그래프에 추가
        gm.addvertex(A);
        gm.addvertex(B);
        gm.addvertex(C);
        gm.addvertex(D);
        gm.addvertex(E);
        gm.addvertex(F);
        gm.addvertex(G);
        gm.addvertex(H);

        gm.addEdge(A,B);
        gm.addEdge(A,F);
        gm.addEdge(A,G);
        gm.addEdge(B,C);
        gm.addEdge(B,D);
        gm.addEdge(D,E);
        gm.addEdge(G,H);

//        gm.showGraph();
//        gl.DFS2(A);

                /*
                 A
               / \ \
             B   F  G
           /  \      \
          C    D      H
                \
                 E

         */


    }
}
