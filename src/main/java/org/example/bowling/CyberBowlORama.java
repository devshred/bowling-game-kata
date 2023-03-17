package org.example.bowling;

import java.util.ArrayList;
import java.util.List;

public class CyberBowlORama implements BowlingGame {
    private final List<Integer> rolls = new ArrayList<>();

    @Override
    public void roll(int pins) {
        rolls.add(pins);
    }

    @Override
    public int score() {
        int rollIndex = 0;
        int sum = 0;

        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            int firstRoll = rolls.get(rollIndex++);
            sum += firstRoll;

            if (firstRoll == 10) {
                sum += rolls.get(rollIndex) + rolls.get(rollIndex + 1);
            } else {
                int secondRoll = rolls.get(rollIndex++);
                sum += secondRoll;
                if (firstRoll + secondRoll == 10) {
                    sum += rolls.get(rollIndex);
                }
            }
        }

        return sum;
    }
}
