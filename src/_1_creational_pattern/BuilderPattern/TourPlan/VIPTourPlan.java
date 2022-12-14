package _1_creational_pattern.BuilderPattern.TourPlan;

public class VIPTourPlan extends TourPlan{

    public VIPTourPlan(int night, int day, String plan, String traffic, String resort) {
        this.setNight(night);
        this.setDay(day);
        this.setPlan(plan);
        this.setTraffic(traffic);
        this.setResort(resort);
        this.setType("VIP");
    }

    @Override
    public String toString() {
        return "VIPTourPlan{}";
    }
}
