package bm.app.employeesListKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @BeforeEach
    void setUp() {
        employeesList = new EmployeesList();
    }

}