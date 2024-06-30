public class ErrorLogger extends AbstractLogger {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(ANSI_WHITE+"Error Console:Logger: " +ANSI_RED+ message);
    }
}
