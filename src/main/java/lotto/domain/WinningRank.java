package lotto.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum WinningRank {
    FIRST_RANK(6, 2000000000), 
    SECOND_RANK(5, 1500000), 
    THIRD_RANK(4, 50000), 
    FOURTH_RANK(3, 5000), 
    FAIL(0, 0);

    private final int matchCount;
    private final int reward;

    WinningRank(int matchCount, int reward) {
        this.matchCount = matchCount;
        this.reward = reward;
    }

    public static WinningRank resultRank(int matchCount) {
        return Arrays.stream(values())
                .filter(winningRank -> winningRank.equals(matchCount))
                .findFirst()
                .orElse(FAIL);
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getReward() {
        return this.reward;
    }
    
    public static List<WinningRank> createWinningRanks() {
        return Stream.of(FIRST_RANK, SECOND_RANK, THIRD_RANK, FOURTH_RANK)
                .sorted(Comparator.comparing(WinningRank::getMatchCount))
                .collect(Collectors.toList());
    }
    
    private boolean equals(int count) {
        return this.matchCount == count;
    }
}
