package org.example.bowling;

interface BowlingGame {
    /**
     * Number of pins scored in that roll.
     * Expects a value from 0 to 10. No validation.
     *
     * @param pins Number of pins scored in that roll.
     */
    void roll(int pins);

    /**
     * Total score for that game.
     * Is called only at the very end of that game.
     *
     * @return total score for that game.
     */
    int score();
}
