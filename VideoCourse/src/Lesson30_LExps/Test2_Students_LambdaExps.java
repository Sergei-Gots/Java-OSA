package Lesson30_LExps;

import java.util.ArrayList;


public class Test2_Students_LambdaExps {
    
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        
                                //parameter of Interface method
                                                //body of method implementation
        si.testStudents(list, (Student st) -> {return st.avGrade>8.5;} );
        System.out.println("----------------------------------------");
        si.testStudents(list,   st -> st.avGrade < 9 );
        System.out.println("----------------------------------------");
        si.testStudents(list, (Student st) -> st.age>27);
        System.out.println("----------------------------------------");
        si.testStudents(list, st -> {return st.age<25;} );
        System.out.println("----------------------------------------");
        si.testStudents(list, (Student st) -> {return st.sex == 'm';} );
        System.out.println("----------------------------------------");
        si.testStudents(list, (Student st) -> {
                                    return (st.avGrade > 7.2 
                                            && st.age < 23 
                                            && st.sex == 'f');
                                } );
        System.out.println("----------------------------------------");
        
    }
}
    
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;
    
    Student(String name, char sex, int age, int course, double avGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }
}

class StudentInfo{
    void print(Student st){
        System.out.println("Student " + st.name 
            + ", sex: " + st.sex
            + ", age: " + st.age
            + ", course: " + st.course
            + ", av.grade: " + st.avGrade);
    }
    
    void testStudents(ArrayList <Student> aL, StudentChecks sc){
        for (Student st: aL){
            if (sc.test(st)){
                print(st);
            }
        }
    }
}        

//It's a FUNCTIONAL INTERFACE. i.e. interface with the only declared function.
//Only for such interfaces LAMBDA-Expressions can be used.
interface StudentChecks {
    boolean test(Student s);
}
   


