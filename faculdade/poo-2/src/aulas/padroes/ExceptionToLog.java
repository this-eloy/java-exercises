package aulas.padroes;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;

public class ExceptionToLog {
    
    private ExceptionToLog() {}
    
    public static String get(Exception exception) {
        
        String log = "\n\n";
        
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        log += date.toString() + "\n";

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exception.printStackTrace(printWriter);
        log += stringWriter.toString() + "\n";
        
        return log;
        
    }
    
}
