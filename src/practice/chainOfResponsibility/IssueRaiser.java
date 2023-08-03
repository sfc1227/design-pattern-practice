package practice.chainOfResponsibility;

class IssueRaiser {
    public ReceiverInterface setFirstReceiver;

    public IssueRaiser(ReceiverInterface firstReceiver)
    {
        //???
        
    }

    public void raiseMessage(Message msg) {
        if (setFirstReceiver != null)
            // ???

    }
}
