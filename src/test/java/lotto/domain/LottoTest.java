package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static lotto.domain.LottoRank.FOURTH;
import static lotto.domain.LottoRank.SECOND;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LottoTest {
    @DisplayName("로또 발행시 로또 번호가 6개가 아닌 경우 에러")
    @Test
    void 로또_발행시_6개_아닐시_에러() {
        List<Integer> lottoNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        assertThatThrownBy(() -> {
            new Lotto(lottoNumbers);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호 정렬")
    @Test
    void 로또번호_정렬() {
        List<Integer> lottoNumbers = new ArrayList<>(Arrays.asList(1, 11, 8, 5, 7, 9));
        Lotto lotto = new Lotto(lottoNumbers);
        List<Integer> lottoList = lotto.getLottoNumbers();
        assertThat(lottoList).isEqualTo(List.of(1, 5, 7, 8, 9, 11));
    }

    @DisplayName("로또등수")
    @Test
    void 로또등수() {
        List<Integer> lottoNumbers = new ArrayList<>(Arrays.asList(1, 5, 7, 8, 9, 11));
        Lotto lotto = new Lotto(lottoNumbers);
        List<Integer> winningLottoNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 10));
        int bonusNumber = 12;
        WinningLotto winningLotto = new WinningLotto(new Lotto(winningLottoNumbers), bonusNumber);
        assertThat(lotto.getLottoResult(winningLotto)).isEqualTo(FOURTH);
    }

    @DisplayName("로또2등")
    @Test
    void 로또2등() {
        List<Integer> lottoNumbers = new ArrayList<>(Arrays.asList(1, 5, 7, 8, 9, 11));
        Lotto lotto = new Lotto(lottoNumbers);
        List<Integer> winningLottoNumbers = new ArrayList<>(Arrays.asList(1, 5, 7, 9, 11, 12));
        int bonusNumber = 8;
        WinningLotto winningLotto = new WinningLotto(new Lotto(winningLottoNumbers), bonusNumber);
        assertThat(lotto.getLottoResult(winningLotto)).isEqualTo(SECOND);
    }
}
