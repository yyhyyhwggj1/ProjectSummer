package RefrenceMethod.MemberMethod._Super;

public class JavaProgrammer extends SoftEngineer {
    public void communicateWithCostumer()
    {
//        Costumer costumer=new Costumer() {
//            @Override
//            public void communicateBusyness() {
//                JavaProgrammer.super.analysisBusyness();
//            }
//        };
//        Costumer costumer=() ->{
//                JavaProgrammer.super.analysisBusyness();
//        };
//        Costumer costumer=() ->JavaProgrammer.super.analysisBusyness();
        Costumer costumer=super::analysisBusyness;
        costumer.communicateBusyness();
    }
}
