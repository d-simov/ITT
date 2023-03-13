package Task05GSM;

public class Demo {

    public static void main(String[] args) {

        GSM samsung = new GSM();
        samsung.model = "Galaxy";
        samsung.insertSimCard("0883332211");

        GSM nokia = new GSM();
        nokia.model = "Nokia 3310";
        nokia.insertSimCard("0899445566");

        GSM xiaomi = new GSM();
        xiaomi.model = "RedMi 6";
        xiaomi.insertSimCard("0878998877");

        samsung.call(nokia, 2.3);
        samsung.call(xiaomi, 5.6);
        samsung.call(nokia, 1);
        nokia.call(samsung,5.6);
        nokia.call(xiaomi, 1.8);

        System.out.println();
        xiaomi.printInfoForTheLastIncomingCall();
        xiaomi.printInfoForTheLastOutgoingCall();
        System.out.printf("\nSum for calls of %s are: %.2f lv.", samsung.model, samsung.getSumForCall());
    }
}
