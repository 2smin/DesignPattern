package _1_creational_pattern.BuilderPattern.TourPlan;

public class DefaultTourPlan extends TourPlan{

    public DefaultTourPlan(int night, int day, String plan, String traffic, String resort) {
        this.setNight(night);
        this.setDay(day);
        this.setPlan(plan);
        this.setTraffic(traffic);
        this.setResort(resort);
        this.setType("default");
    }
}
