package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_after;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.addData("창수");
        employees.addData("민수");
        employees.addData("인수");
        employees.addData("정수");

        Employees clone = (Employees) employees.clone();
        clone.addData("클론");


    }
}
