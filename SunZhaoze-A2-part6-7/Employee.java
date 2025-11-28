public class Employee extends Person {
    private String employeeId;
    private String department;

    // 默认构造器
    public Employee() {
        super();
        this.employeeId = "E000";
        this.department = "Operations";
    }

    // 带参构造器
    public Employee(String name, int age, String email, String employeeId, String department) {
        super(name, age, email);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getter 和 Setter 方法
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", email='" + getEmail() + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}