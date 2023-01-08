package _3_behavioral_pattern.MediatorPattern.Sample1;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();
    public void cleanGuestRoom(int guestId){
        int roomNo = searchGuestRoomNo(guestId);
        cleaningService.cleanRoom(roomNo);
    }

    public void reserveGuestDinner(int guestId){
        restaurant.reserveDinner(guestId);
    }

    private int searchGuestRoomNo(int guestId) {
        return guestId+10;
    }
}
