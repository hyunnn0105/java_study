package datastructure.chap11.graphMatrix;
// 정점설계
public class Vertex {

    private int id; // 정점 고유 번호
    private String data; // 정점에 저장할 데이터
    private boolean visitflag; //정점방문여부


    public Vertex(String data) {
        this.data = data;
        this.id = -1; // 존재X
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisitflag() {
        return visitflag;
    }

    public void setVisitflag(boolean visitflag) {
        this.visitflag = visitflag;
    }
}
