public class Student {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return name.equals(person.name);
    }

    String name;
    int age;

    Student() {
        this.name = "Usama";
        this.age = 28;
    }
    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    Student(Student st) {
        st.name = this.name;
        st.age = this.age;
    }

    public void showDetails() {
        System.out.println("The Name of student is: "+this.name);
        System.out.println("The Age of student is: "+this.age);
    }
}
