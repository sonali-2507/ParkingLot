package Strategies.SpotAssignmentStrategy;

import Models.SlotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {
    public static  SpotAssignmentStrategy getStrategyByType(SlotAssignmentStrategyType type){

        if(type.equals(SlotAssignmentStrategyType.RANDOM)){
            return new RandomSpotAssignmentStrategy();
        }
        return  null;
    }
}
