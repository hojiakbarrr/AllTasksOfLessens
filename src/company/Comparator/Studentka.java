package company.Comparator;

public class Studentka implements Comparable {
    public String name;
    public String group;
    public int course;
    //    public int grade;
//    public String math;
//    public String biology;
//    public String geography;
//    public String history;
    Grade grade1;
    Grade grade2;
    Grade grade3;
    Grade grade4;
    public double sumGrade;

    public Studentka(String name, String group, int course, Grade grade1, Grade grade2, Grade grade3, Grade grade4) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    public void sumGrade(Studentka studentka) {

        sumGrade = (studentka.grade1.grade + studentka.grade2.grade + studentka.grade3.grade + studentka.grade4.grade) / 4;
        System.out.println(sumGrade);
    }

    public String listOfStudents() {
        return "Список студентов: " + this.name + "; курс: " + this.course;
    }

    public void odnokurs(int x) {
        if (this.course == x) {
            info();
        }
    }

    public void info() {
        System.out.print(this.name + " ");
    }

    @Override
    public int compareTo(Object o) {
        Studentka drugoy = (Studentka) o;
        return this.course - ((Studentka)o).course;
    }
}
