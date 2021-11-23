package com.currency;

import java.util.Objects;

public class Rupee {
    int value;

    public Rupee(int value) {
        this.value = value;
    }

    public Rupee add(Rupee rupee) {

        Rupee rupee3 = new Rupee(value + rupee.value);
        return rupee3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

   /*public int compare(Rupee rupeeTenCoin) {
     if (value == rupeeTenCoin.value)
            return 1;
        return 0;
    }*/
}
