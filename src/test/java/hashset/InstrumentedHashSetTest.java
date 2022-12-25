package hashset;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentedHashSetTest {

    @DisplayName("addAll() 호출로 3개의 원소를 입력하면 addCount는 3이 돼야 한다.")
    @Test
    public void addAll() {
        InstrumentedHashSet<String> pokemon = new InstrumentedHashSet<>();
        pokemon.addAll(Arrays.asList("피카츄", "파이리", "이상해씨"));
        Assertions.assertThat(pokemon.getAddCount()).isEqualTo(3);
    }
}
