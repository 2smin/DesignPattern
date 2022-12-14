package _1_creational_pattern.BuilderPattern.TourPlan;

public class SpecialTourPlan extends TourPlan{

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    private String ticket;



    public SpecialTourPlan(String plan, int night, int day, String traffic, String resort, String ticket){
        setPlan(plan);
        setNight(night);
        setDay(day);
        setTraffic(traffic);
        setResort(resort);
        setTicket(ticket);
    }

    @Override
    public String toString() {
        return "SpecialTourPlan{" +
                "ticket='" + ticket + '\'' +
                '}';
    }
}
