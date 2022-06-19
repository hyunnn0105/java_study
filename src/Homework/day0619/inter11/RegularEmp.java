package Homework.day0619.inter11;

import Homework.day0619.inter11.Emp;

public class RegularEmp extends Emp {
    private int transtationAllw;

    public RegularEmp(String name, long salary, int transtationAllw) {
        super(name, salary);
        this.transtationAllw = transtationAllw;
    }

    @Override
    public long paySalary() {
        return this.salary / 12  + transtationAllw;
    }

    public int getTranstationAllw() {
        return transtationAllw;
    }

    @Override
    public String toString() {
        return super.toString() +
                "RegularEmp{" +
                "transtationAllw=" + transtationAllw +
                '}';
    }
}
