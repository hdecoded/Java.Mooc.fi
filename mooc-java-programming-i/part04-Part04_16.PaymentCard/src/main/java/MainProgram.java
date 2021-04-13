public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        PaymentCard paulSCard = new PaymentCard(20);
        PaymentCard mattSCard = new PaymentCard(30);

        paulSCard.eatHeartily();
        mattSCard.eatAffordably();

        printBalance(paulSCard, mattSCard);

        paulSCard.addMoney(20);
        mattSCard.eatHeartily();

        printBalance(paulSCard, mattSCard);

        paulSCard.eatAffordably();
        paulSCard.eatAffordably();

        mattSCard.addMoney(50);

        printBalance(paulSCard, mattSCard);
    }

    private static void printBalance(PaymentCard paulSCard, PaymentCard mattSCard) {
        System.out.println("Paul: " + paulSCard);
        System.out.println("Matt: " + mattSCard);
    }
}
