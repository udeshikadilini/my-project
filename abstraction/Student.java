package abstraction;

public class Student {

    private Integer id;
    private String name;
    private School school;


    Student(){
        school = new School();
    }

    Student(School school){
        this.school=school;
    }


}

class School {
    private Integer id;
    private String name;
}
