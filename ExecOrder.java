import java.time.LocalDate;

public class ExecOrder {
    public static void main(String[] args) {
        Order p1 = new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true);
        Order p2 = new Order("ICBK62", LocalDate.of(2025, 9, 2), 1050, 10, false);
        Order p3 = new Order("ICY62", LocalDate.of(2025, 9, 2), 1050, 10, false);
        Order p4 = new Order("ICC62", LocalDate.of(2025, 9, 2), 1050, 10, false);
        Order p5 = new Order("ICM62", LocalDate.of(2025, 9, 2), 1050, 10, false);
    }
}
