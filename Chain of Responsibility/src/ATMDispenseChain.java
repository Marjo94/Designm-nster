public class ATMDispenseChain {

    private DispenseChain chain1;

    public ATMDispenseChain(){
        this.chain1 = new Sek50Dispenser();

        DispenseChain chain2 = new Sek20Dispenser();
        DispenseChain chain3 = new Sek10Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

    }

    public DispenseChain getChain1(){
        return chain1;
    }

}
