package com.andichou.poker.game;

import com.andichou.poker.helper.Formatter;

public class GameResult {

    private final Formatter formatter;

    public GameResult() {
        this.formatter = new Formatter();
    }

    public String getMessage(Result result) {
        if (result instanceof Tie) {
            return result.toString();
        }

        return winnerMessage((Winner) result);
    }

    private String winnerMessage(Winner result) {
        return String.format("%s is winner with %s", result.getPlayer().name, result.gameRank().message(formatter));
    }
}
