public class ConsoleLogger extends AbstractLogger {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public ConsoleLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println(ANSI_WHITE+"Console:Logger: "+ANSI_GREEN + message);
    }
}
