package bm.app.employeesListKata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee implements Comparable<Employee>{

    private Long id;
    private int age;
    private String name;

    @Override
    public int compareTo(Employee employee) {
        return (int)(this.id - employee.getId());
    }

    @Override
    public String toString() {
        return  " age = " + age +
                ", name = " + name
                ;
    }
}
