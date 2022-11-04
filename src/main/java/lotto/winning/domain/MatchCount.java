package lotto.winning.domain;

import lotto.lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class MatchCount {

    private final List<Lotto> lottos;
    private final WinningNumber winningNumber;
    private int threeMatchCount;
    private int fourMatchCount;
    private int fiveMatchCount;
    private int sixMatchCount;

    public MatchCount(List<Lotto> lottos, WinningNumber winningNumber) {
        this.lottos = lottos;
        this.winningNumber = winningNumber;
    }

    public TotalWinningMoney generate() {
        for (Lotto lotto : this.lottos) {
            if (this.winningNumber.matchCounts(lotto) == 3) {
                threeMatchCount++;
            } else if (this.winningNumber.matchCounts(lotto) == 4) {
                fourMatchCount++;
            } else if (this.winningNumber.matchCounts(lotto) == 5) {
                fiveMatchCount++;
            } else if (this.winningNumber.matchCounts(lotto) == 6) {
                sixMatchCount++;
            }
        }
        return new TotalWinningMoney(threeMatchCount, fourMatchCount, fiveMatchCount, sixMatchCount);
    }
}
