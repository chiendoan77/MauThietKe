package Iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {
    private List<Employee> employees = new ArrayList<>();

    public void add(Employee emp) {
        employees.add(emp);
    }

    public MyIterator<Employee> iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements MyIterator<Employee> {
        private int index = 0;

        public boolean hasNext() {
            return index < employees.size();
        }

        public Employee next() {
            return employees.get(index++);
        }
    }
}