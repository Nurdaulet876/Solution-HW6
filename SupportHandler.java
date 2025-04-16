public abstract class SupportHandler {
    public SupportHandler next;
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    public abstract void handle(String issue);
}
