public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        int updatedEuros = this.euros + addition.euros;
        int updatedCents = this.cents + addition.cents;

        Money plusMoney = new Money(updatedEuros, updatedCents);

        return plusMoney;
    }

    public Money minus(Money substraction) {
        int updatedEuros = this.euros - substraction.euros; // 10 - 3 = 7
        int updatedCents = this.cents - substraction.cents; //  0 - 50 = -50

        if (updatedCents < 0) {
            updatedEuros = updatedEuros - 1;
            updatedCents = 100 + updatedCents;
        }

        if(updatedEuros < 0 ) {
                return new Money(0,0);
            }


        return new Money(updatedEuros,updatedCents);
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.euros) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
