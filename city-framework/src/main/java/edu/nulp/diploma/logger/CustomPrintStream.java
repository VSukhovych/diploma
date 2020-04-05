package edu.nulp.diploma.logger;

import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class CustomPrintStream {

    public PrintStream getPrintStream() {
        OutputStream output = new OutputStream() {
            private ByteArrayOutputStream baos = new ByteArrayOutputStream();

            @Override
            public void write(int b) {
                baos.write(b);
            }

            @Override
            public void flush() {
                writeLogMessage(baos);
                baos = new ByteArrayOutputStream();
            }
        };

        return new PrintStream(output, true);
    }

    private void writeLogMessage(ByteArrayOutputStream baos) {
        String logMessage = baos.toString().replaceAll("\n$|\r\n$", "");
        if (StringUtils.isNotEmpty(logMessage) && !logMessage.contains("none")) {
            LogListener.log.info(logMessage);
        }
    }
}
