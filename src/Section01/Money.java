package Section01;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Money implements Comparable<Money> {
    private final Long amount;

    public Money(Long amount) {
        this.amount = amount;
    }

    public Money plus(Money money) {
        return new Money(amount + money.amount);
    }

    @Override
    public int compareTo(@NotNull Money o) {
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}
