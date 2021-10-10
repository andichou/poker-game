import com.andichou.poker.card.Card;
import com.andichou.poker.game.Gameplay;
import com.andichou.poker.game.Result;
import com.andichou.poker.game.Winner;
import com.andichou.poker.game.rule.GameRule;
import com.andichou.poker.hand.Hand;
import com.andichou.poker.player.Player;
import mocks.PlayerCardMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    private final Gameplay gameplay = new Gameplay(new GameRule());

    @Test
    void onePairWinAgaintsHighest() {
        Player firstPlayer = createPlayer(PlayerCardMock.onePairMock(), "Player 1");
        Player secondPlayer = createPlayer(PlayerCardMock.highestMock(), "Player 2");

        Result expected = new Winner(firstPlayer);

        Assertions.assertEquals(expected, gameplay.run(firstPlayer, secondPlayer));
    }

    @Test
    void onePairWinHighestSuit() {
        Player firstPlayer = createPlayer(PlayerCardMock.onePairMock(), "Player 1");
        Player secondPlayer = createPlayer(PlayerCardMock.onePairMockSameSuit(), "Player 2");

        Result expected = new Winner(secondPlayer);

        Assertions.assertEquals(expected, gameplay.run(firstPlayer, secondPlayer));
    }

    private Player createPlayer(Hand hand, String name) {
        return new Player(hand, name);
    }
}
