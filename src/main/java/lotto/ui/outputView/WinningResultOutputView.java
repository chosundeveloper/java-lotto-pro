package lotto.ui.outputView;

import lotto.domain.LottoMoney;
import lotto.domain.Statistics;
import lotto.domain.TotalWinningMoney;

import static lotto.domain.WinningMoneyType.find;

public class WinningResultOutputView {

    public static void winningResult(TotalWinningMoney totalWinningMoney, Statistics statistics) {
        winningMoney(totalWinningMoney);
        returnRate(statistics);
    }

    private static void returnRate(Statistics statistics) {
        System.out.println("총 수익률은 " + statistics.returnRate() + "입니다");
    }

    public static void winningMoney(TotalWinningMoney totalWinningMoney) {
        System.out.println("당첨통계");
        System.out.println("--------------");
        for (Integer matchCount : totalWinningMoney.getWinningMonies().keySet()) {
            System.out.print(matchCount + "개 일치 ");
            System.out.print("(" + find(matchCount).getMoney() + "원)-");
            System.out.println(totalWinningMoney.getWinningMonies().get(matchCount).getNumber() + "개");
        }
    }
}
