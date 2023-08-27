// creat a class which is used to store the information of students.

class student
{
    private String name;
    private  int roll_no;
    private float  sgpa;

    public student(String name,int roll_no,float sgpa)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.sgpa=sgpa;
    }

    public void display()
    {
        System.out.println(name+" "+ roll_no+" "+sgpa);
    }
}