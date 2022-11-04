package lotto.winning.domain;

import common.vo.Count;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static lotto.winning.domain.MatchCountFixture.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("당첨 금액 총합")
class TotalWinningMoneyTest {
    /*
        0개 일치 1개
        2개 일치 1개
        3개 일치 1개         5_000
        4개 일치 1개        50_000
        5개 일치 1개     1_500_000
        6개 일치 1개 2_000_000_000
        총합        2_001_555_000
        */
    @DisplayName("당첨 금액 총합 구하기")
    @Test
    void sum() {
        TotalWinningMoney totalWinningMoney = new TotalWinningMoney(matchCount());
        assertThat(totalWinningMoney.sum()).isEqualTo(2_001_555_000);
    }
}
