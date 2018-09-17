public class Main {

    public static void main(String[] args){

        ApplicationMediator mediator = new ApplicationMediator();
        WeirdColleague arne = new WeirdColleague(mediator);
        CoolColleague janne = new CoolColleague(mediator);

        mediator.addColleague(arne);
        mediator.addColleague(janne);

        arne.send("Jag är konstig");

    }

}
