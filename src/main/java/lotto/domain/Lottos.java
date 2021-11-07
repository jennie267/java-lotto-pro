package lotto.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lottos implements Iterable<Lotto> {
    private final List<Lotto> lottos;

    public Lottos(Money money) {
        this.lottos = buyLotto(money);
    }

    public static List<Lotto> buyLotto(Money money) {
        List<Lotto> lottos = new ArrayList<Lotto>();
        for (int i = 0; i < money.buyableQuantity(); i++) {
            lottos.add(Lotto.buyAuto());
        }
        return lottos;
    }

    public List<Lotto> getLottos() {
        return this.lottos;
    }

    public void execute(WinningLotto winningLotto) {
        for (Lotto lotto : lottos) {
            lotto.judgeRank(winningLotto);
        }
    }

    @Override
    public Iterator<Lotto> iterator() {
        return lottos.iterator();
    }

}
