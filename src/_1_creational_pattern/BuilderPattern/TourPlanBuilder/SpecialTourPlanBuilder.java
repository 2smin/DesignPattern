package _1_creational_pattern.BuilderPattern.TourPlanBuilder;

import _1_creational_pattern.BuilderPattern.TourPlan.SpecialTourPlan;
import _1_creational_pattern.BuilderPattern.TourPlan.TourPlan;

public class SpecialTourPlanBuilder extends AbstractTourPlanBuilder implements TourPlanBuilder{

    @Override
    public TourPlanBuilder nightAndDays(int night, int day){
        setNight(night);
        setDay(day);
        return this;
    }

    @Override
    public TourPlanBuilder plan(String plan){
        setPlan(plan);
        return this;
    }

    @Override
    public TourPlanBuilder resort(String resort){
        setResort(resort);
        return this;
    }

    @Override
    public TourPlanBuilder traffic(String traffic){
        setTraffic(traffic);
        return this;
    }

    @Override
    public TourPlan getTourPlan(){
        return new SpecialTourPlan(getPlan(), getNight(),getDay(),getResort(),getTraffic(), "special Ticket");
    }
}
