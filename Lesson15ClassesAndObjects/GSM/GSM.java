package Task05GSM;

public class GSM {

    String model;
    boolean hasSimCard;
    String simMobileNumber;
    double outgoingCallsDuration;
    Call lastIncomingCall;
    Call lastOutgoingCall;

    void insertSimCard(String number) {
        if (number.matches("\\d{10}")) {
            hasSimCard = true;
            simMobileNumber = number;
        }
        else {
            System.out.println("This is not a valid number.");
        }
    }

    void removeSimCard() {
        simMobileNumber = null;
        hasSimCard = false;
    }

    void call (GSM receiver, double duration) {
       if (callIsVerified(receiver, duration)) {
           outgoingCallsDuration += duration;
           Call call = new Call();
           call.duration = duration;
           call.caller = this;
           call.receiver = receiver;
           lastOutgoingCall = call;
           receiver.lastIncomingCall = call;

       }
    }

    boolean callIsVerified (GSM receiver, double duration) {
        if (duration > 0) {
            if (!simMobileNumber.equals(receiver.simMobileNumber)) {
                if (hasSimCard && receiver.hasSimCard) {
                    return true;
                }
            }
        }
        return false;
    }

    double getSumForCall(){
        return outgoingCallsDuration * Call.priceForAMinute;
    }

    void printInfoForTheLastOutgoingCall(){
        if (lastOutgoingCall != null) {
            System.out.println("Last outgoing call to number: " + lastOutgoingCall.receiver.simMobileNumber + " with duration " + lastOutgoingCall.duration + ".");
        }
        else {
            System.out.println("There were no outgoing calls for " + model + ".");
        }
    }

    void printInfoForTheLastIncomingCall(){
        if (lastIncomingCall != null) {
            System.out.println("Last incoming call from number: " + lastIncomingCall.caller.simMobileNumber + " with duration " + lastIncomingCall.duration + ".");
        }
        else {
            System.out.println("There were no incoming calls.");
        }
    }


}
