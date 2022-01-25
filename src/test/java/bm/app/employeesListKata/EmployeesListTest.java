package bm.app.employeesListKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeesListTest {

    EmployeesList employeesList;

    @Test
    void shouldDisplayOnlyAdultEmployees() {
        //given
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Monica", 20);
        employees.put("Atilla", 17);
        employees.put("Nessa", 19);
        String expectedResult = "Nessa, 19 and Monica, 20.";
        //when
        String actualResult = employeesList.showAdultEmployees(employees);
        //then
        assertThat(expectedResult).isEqualTo(actualResult);
    }

    @Test
    void shouldSortEmployeesAlphabetically() {
        //given
        Map<String, Employee> employees = new HashMap<>();
        employees.put("Anastasia", new Employee(111L, 20, "Anastasia"));
        employees.put("Atilla", new Employee(20L, 17, "Atilla"));
        employees.put("Nessa", new Employee(8L, 19, "Nessa"));
        employees.put("Basil", new Employee(1L, 23, "Basil"));
        //when
        TreeMap<String, Employee> result = employeesList.showSortedEmployees(employees);
        //then
        assertThat(result.lastEntry().getValue().getName()).isEqualTo("Nessa");
    }

    @BeforeEach
    void setUp() {
        employeesList = new EmployeesList();
    }

}