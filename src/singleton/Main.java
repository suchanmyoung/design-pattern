package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        }else{
            System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
        }
        System.out.println("End.");

        TicketMaker ticketMaker1 = TicketMaker.getNextTicketNumber();
        TicketMaker ticketMaker2 = TicketMaker.getNextTicketNumber();

        if(ticketMaker1==ticketMaker2){
            System.out.println("같은 창구에서 발급되었습니다.");
        }else{
            System.out.println("다른 창구에서 발급되었습니다.");
        }

        for (int i=0; i<9; i++){
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
    }
}
