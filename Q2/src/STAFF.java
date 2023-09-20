public class STAFF extends PERSON {

    public String Emp_ID;
    public String Emp_Role;
    public String Emp_Dept;
    public Float Emp_Salary;
    public int Experience;

    public String Attend(){
        return "This is Attend";
    }
    public String getPromotion()
    {
        return "This is Promotion";
    }

    public int getSalary()
    {
        return 100;
    }


}
