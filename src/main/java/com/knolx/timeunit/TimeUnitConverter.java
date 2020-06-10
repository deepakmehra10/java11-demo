package com.knolx.timeunit;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitConverter {
    public static void main(String[] args) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        
        long days = timeUnit.convert(Duration.ofHours(24));
        System.out.println(days);
        
        long days1 = timeUnit.convert(Duration.ofMinutes(3600));
        System.out.println(days1);
    }
}
