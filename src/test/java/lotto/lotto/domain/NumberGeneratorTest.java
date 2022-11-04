package lotto.lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("로또 번호 생성기")
class NumberGeneratorTest {

    @DisplayName("구매횟수만큼 로또 번호들 리스트 생성")
    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5})
    void generate(int purchaseCount) {
        assertThat(new LottoGenerator(purchaseCount).generateLottos()).hasSize(purchaseCount);
    }
}
