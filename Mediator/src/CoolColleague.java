public class CoolColleague extends Colleague {

    public CoolColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Den coole fick meddelandet: " + message);
    }
}
