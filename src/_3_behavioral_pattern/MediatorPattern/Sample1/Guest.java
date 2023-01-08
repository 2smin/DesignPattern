package _3_behavioral_pattern.MediatorPattern.Sample1;

import jdk.jfr.TransitionFrom;

public class Guest {
    private int getId;

    public Guest(int getId, FrontDesk frontDesk) {
        this.getId = getId;
        this.frontDesk = frontDesk;
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }

    public FrontDesk getFrontDesk() {
        return frontDesk;
    }

    public void setFrontDesk(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    private FrontDesk frontDesk;

    public void requestCleaning(){
        this.frontDesk.cleanGuestRoom(this.getId);
    }
    public void requestReserveDinner() { this.frontDesk.reserveGuestDinner(this.getId);}
}
