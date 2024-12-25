public class Main {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Ivan Ivanov", 2, 4.5);
        Student mathStudent = new MathStudent("Petr Petrov", 3, 5.0);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}
