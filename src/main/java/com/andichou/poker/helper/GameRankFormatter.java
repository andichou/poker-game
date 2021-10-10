package com.andichou.poker.helper;

import com.andichou.poker.game.rank.FlushRank;
import com.andichou.poker.game.rank.FourPairRank;
import com.andichou.poker.game.rank.FullHouseRank;
import com.andichou.poker.game.rank.HighestRank;
import com.andichou.poker.game.rank.OnePairRank;
import com.andichou.poker.game.rank.RoyalFlushRank;
import com.andichou.poker.game.rank.StraightFlushRank;
import com.andichou.poker.game.rank.StraightRank;
import com.andichou.poker.game.rank.ThreePairRank;
import com.andichou.poker.game.rank.TwoPairRank;

public interface GameRankFormatter<T> {

    T message(HighestRank entity);

    T message(OnePairRank entity);

    T message(TwoPairRank entity);

    T message(ThreePairRank entity);

    T message(FourPairRank entity);

    T message(StraightRank entity);

    T message(FlushRank entity);

    T message(StraightFlushRank entity);

    T message(FullHouseRank entity);

    T message(RoyalFlushRank entity);
}
