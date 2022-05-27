package com.kh.example.practice7.model.vo;

public class Employee {
    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bounsPoint;
    private String phone;
    private String address;




    public Employee(){
        this(100, "홍길동", "영업부", "과장", 25, '남', 250000, 0.05,
                "010-1234-5678", "서울시 강남구");
    }
    public Employee(int empNo, String empName, String dept) {
        this(100, "홍길동", "영업부", "과장", 25, '남', 250000, 0.05,
                "010-1234-5678", "서울시 강남구");
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender,
                    int salary, double bounsPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bounsPoint = bounsPoint;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bounsPoint=" + bounsPoint +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // public setter();
    // public getter();

}
