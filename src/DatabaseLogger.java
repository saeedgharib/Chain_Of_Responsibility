public class DatabaseLogger extends AbstractLogger {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public DatabaseLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println(ANSI_WHITE+"Database:Logger: " +ANSI_YELLOW+ message);
    }
}
