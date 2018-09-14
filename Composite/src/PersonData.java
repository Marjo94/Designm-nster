public class PersonData {

    int vacationDays = 0;
    int sickDays = 0;

    public void increaseVacationDays(int days){
        vacationDays = vacationDays + days;
    }

    public void decreaseVacationDays(int days){
        vacationDays = vacationDays - days;
    }

    public void increaseSickDays(int days){
        sickDays = sickDays + days;
    }

    public void decreaseSickDays(int days){
        sickDays = sickDays - days;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }
}
