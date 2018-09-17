public class WeirdColleague extends Colleague {

    public WeirdColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Den skumme fick meddelandet: " + message);
    }
}
