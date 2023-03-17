package org.example.bowling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CyberBowlORamaTest {
    private final BowlingGame game = new CyberBowlORama();

    @Test
    void testGutterGame() {
        rollMany(10 * 2, 0);
        assertThat(game.score()).isZero();
    }

    @Test
    void testAllOnes() {
        rollMany(10 * 2, 1);
        assertThat(game.score()).isEqualTo(20);
    }

    @Test
    void testOneSpare() {
        // 1st frame
        rollSpare();

        // 2nd frame
        game.roll(3);
        game.roll(5);

        rollMany(8 * 2, 0);
        assertThat(game.score()).isEqualTo(21);
    }

    @Test
    void testOneStrike() {
        // 1st frame
        rollStrike();

        // 2nd frame
        game.roll(3);
        game.roll(2);

        // 3rd frame
        game.roll(1);
        game.roll(4);

        rollMany(7 * 2, 0);
        assertThat(game.score()).isEqualTo(25);
    }

    @Test
    void testPerfectGame() {
        rollMany(12, 10);
        assertThat(game.score()).isEqualTo(300);
    }

    private void rollMany(int number, int pins) {
        for (int i = 0; i < number; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(8);
        game.roll(2);
    }

    private void rollStrike() {
        game.roll(10);
    }
}
