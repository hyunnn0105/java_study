package JavaStudyDate.day16.api.obj;

public class Company implements Cloneable{

    String name; // 회사명
    String address;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
