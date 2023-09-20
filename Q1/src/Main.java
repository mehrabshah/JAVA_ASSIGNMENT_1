
public class Main {
    public static void main(String[] args) {
        Batsaman_class batsman1=new Batsaman_class();
        batsman1.Print();
        Bowler_class bowler1=new Bowler_class();
        bowler1.Print();
        All_Rounder_class All_Rounder1=new All_Rounder_class( batsman1,bowler1);
        All_Rounder1.Print();
    }
}