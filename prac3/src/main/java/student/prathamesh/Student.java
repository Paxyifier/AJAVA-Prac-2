package student.prathamesh;

class Student{
    public String name;
    public Department department;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
    public Student( Department department){
        this.department = department;
    }
    public Student(){

    }
}