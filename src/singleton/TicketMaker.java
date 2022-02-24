package singleton;

public class TicketMaker {
    private static int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("Ticket이 발급되었습니다.");
    }

    public static TicketMaker getNextTicketNumber(){
        ticket++;
        System.out.println(ticket + "이 발급되었습니다.");
        return ticketMaker;
    }
}

