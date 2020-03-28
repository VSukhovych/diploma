package edu.nulp.diploma.logger;


import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class ThreadLoggingFilter extends Filter<ILoggingEvent> {
    private String threadName;

    public ThreadLoggingFilter(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public FilterReply  decide(ILoggingEvent  event) {
        if (event.getThreadName() != null && event.getThreadName().equals(this.threadName)) {
            return FilterReply.ACCEPT;
        }
        return FilterReply.DENY;
    }
}
