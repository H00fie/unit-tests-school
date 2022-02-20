package bm.app.employeesListKata;

import java.util.Map;
import java.util.TreeMap;

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

    //TreeMap is a map implementation that keeps its entries sorted according to the natural
    //ordering of its keys or better still using a comparator if provided by the user at construction time.
    public TreeMap<String, Employee> showSortedEmployees(Map<String, Employee> inputMap) {
        TreeMap<String, Employee> sortedMap = new TreeMap<>();
        sortedMap.putAll(inputMap);
        return sortedMap;
    }
}
