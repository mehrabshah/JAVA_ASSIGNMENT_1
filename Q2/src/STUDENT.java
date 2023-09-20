public class STUDENT  extends PERSON{

    public String Student_ID;
    public String Major;
    public int Year;
    public int Semester;
    public String College;

    public int grade;

    public String Register(String Course)
    {
        return "This is course";
    }
    public int getGrade(char course)
    {
        if(course=='A')
        {
            return   90;
        }

        return 0;
    }
    public String Attend(String Class)
    {
       return "This is class";
    }
    public String Learn()
    {
        return "this is learn";
    }
}
