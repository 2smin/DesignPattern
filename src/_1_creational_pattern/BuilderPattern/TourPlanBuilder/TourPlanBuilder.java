package _1_creational_pattern.BuilderPattern.TourPlanBuilder;

import _1_creational_pattern.BuilderPattern.TourPlan.TourPlan;

public interface TourPlanBuilder {

    TourPlanBuilder nightAndDays(int night, int day);

    TourPlanBuilder plan(String plan);

    TourPlanBuilder resort(String resort);

    TourPlanBuilder traffic(String traffic);

    TourPlan getTourPlan();
}
