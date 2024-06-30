public class FileLogger extends AbstractLogger {
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(ANSI_WHITE+"File:Logger: "+ANSI_PURPLE + message);
    }
}
