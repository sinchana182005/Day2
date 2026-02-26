public class Employee {
    int id;
    String name;
    public Employee(String name,int id) {
        this.name = name;
        this.id = id;
    }

void display(){
    System.out.println(id + " " + name);
}
 static Employee copy(Employee e){
return new Employee(e.name, e.id);

}
public static void main(String[] args) {
    Employee e1 = new Employee("Amit",101);
    Employee e2 = Employee.copy(e1);
    e2.display();
}
static {
        System.out.println("Start of execution");
        System.out.println("Internet protocols loading");

}
}


