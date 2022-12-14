package _1_creational_pattern.BuilderPattern;

import _1_creational_pattern.BuilderPattern.TourPlan.TourPlan;
import _1_creational_pattern.BuilderPattern.TourPlanBuilder.TourPlanBuilder;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    TourDirector(TourPlanBuilder tourPlanBuilder){

        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cebuTrip(){

        return tourPlanBuilder.plan("cebu").nightAndDays(4,5)
                .traffic("airplane").resort("cebuResort")
                .getTourPlan();
    }

    public TourPlan americaTrip(){

        return tourPlanBuilder.plan("america").nightAndDays(9,10)
                .traffic("airplane").resort("firstResort")
                .getTourPlan();
    }
}
