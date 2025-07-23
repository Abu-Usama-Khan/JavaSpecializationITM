public class Person {
    String name;
    int age;

    Person() {
        this.name = "Usama";
        this.age = 28;
    }
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void showDetails() {
        System.out.println("The Name of person is: "+this.name);
        System.out.println("The Age of person is: "+this.age);
    }
}