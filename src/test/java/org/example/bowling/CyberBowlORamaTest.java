package org.example.bowling;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CyberBowlORamaTest {
    @Test
    void testGutterGame() {
        var game = new CyberBowlORama();
        for (int i = 0; i < 10 * 2; i++) {
            game.roll(0);
        }
        assertThat(game.score()).isZero();
    }

    // testAllOnes

    // testOneSpare

    // testOneStrike

    // testPerfectGame
}
