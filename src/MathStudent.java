class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " (Math Student) is writing an exam right now.");
    }
}