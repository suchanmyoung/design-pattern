package adapter_by_instance;

import adapter_by_class.Print;
import adapter_by_class.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
