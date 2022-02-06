package yandexPrakticum.DataTypes;

public class TicketNumber {
    public static void main(String[] args) {
        CashBox cashbox = new CashBox((short) 1101);
        String[] electronicQueue = new String[]{
                "№1",
                "№2",
                "№3",
                "№4",
                "№5",
                "№6"
        };

        for (int i = 0; i < electronicQueue.length; i++) {
            increaseTicketNumber(cashbox);
            System.out.println("Клиент " + electronicQueue[i] + ", талон номер: " + cashbox.ticketNumber + ", подойдите к кассе");
        }
    }

    private static void increaseTicketNumber(CashBox cashbox) {
        increase(cashbox.ticketNumber, (byte) 1);
        cashbox.ticketNumber = increase(cashbox.ticketNumber, (byte) 1);// измени код тут
    }

    private static short increase(short numberToIncrease, byte increaser) {
        numberToIncrease = (short) (numberToIncrease + increaser); // измени код тут
        return numberToIncrease;
    }
}

class CashBox {
    public CashBox(short initialNumber) {
        ticketNumber = initialNumber;
    }

    short ticketNumber;
}