package bm.app.employeesListKata;

import java.util.Map;

public class EmployeesList {

    public String showAdultEmployees(Map<String, Integer> inputMap) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            if (entry.getValue() >= 18) {
                stringBuffer.append(entry.getKey() + ", " + entry.getValue() + " and ");
            }
        }
            stringBuffer.setLength(stringBuffer.length() - 5);
            stringBuffer.append('.');
        return stringBuffer.toString();
    }

}
