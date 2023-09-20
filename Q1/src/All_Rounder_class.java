public class All_Rounder_class implements Batsman,Bowler {

    private Batsman batsman1;
    private Bowler bowler1;


    All_Rounder_class(Batsman batsman1,Bowler bowler1){
         this.batsman1=batsman1;
         this.bowler1=bowler1;
    }


    public void Print(){

        batsman1.Print();
        bowler1.Print();


    }
}

