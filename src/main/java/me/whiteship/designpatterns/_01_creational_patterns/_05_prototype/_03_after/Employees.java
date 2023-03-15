package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_after;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public void addData(String data) {
        employees.add(data);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        employees.forEach(s -> temp.add(s));
        return new Employees(temp);
    }
}
