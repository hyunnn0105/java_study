package Homework.day0619.inter11;

import Homework.day0619.inter11.Emp;

public class Manager extends Emp {
    private long bouns;

    public Manager(String name, long salary, long bouns) {
        super(name, salary);
        this.bouns = bouns;
    }

    public long getBouns() {
        return bouns;
    }

    public void setBouns(long bouns) {
        this.bouns = bouns;
    }

    @Override
    public long paySalary() {
        return this.salary / 12 + this.bouns;
    }

    @Override
    public String toString() {
        // 부모내용 더해주ㅜ기
        return super.toString() +
                "Manager{" +
                "bouns=" + bouns +
                '}';
    }
}
