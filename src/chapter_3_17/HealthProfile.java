package chapter_3_17;

import chapter_3_16.HeartRates;


public class HealthProfile extends HeartRates {
    private int heightInches;
    private int weightPounds;

    public HealthProfile(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, int heightInches, int weightPounds) {
        super(firstName, lastName, birthMonth, birthDay, birthYear);

        if (heightInches < 1) {
            throw new IllegalArgumentException("Height must be > 1 inch");
        }

        if (weightPounds < 1) {
            throw new IllegalArgumentException("Weight must be > 1 pound");
        }

        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    public double getBMI() {
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        if (heightInches < 1) {
            throw new IllegalArgumentException("Height must be > 1 inch");
        }
        this.heightInches = heightInches;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        if (weightPounds < 1) {
            throw new IllegalArgumentException("Weight must be > 1 pound");
        }
        this.weightPounds = weightPounds;
    }
}
