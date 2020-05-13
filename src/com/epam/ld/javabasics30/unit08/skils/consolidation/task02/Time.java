package com.epam.ld.javabasics30.unit08.skils.consolidation.task02;

public class Time {
    private static final int TIME_HOURS_IN_DAY = 24;
    private static final int TIME_MINUTES_IN_HOUR = 60;
    private static final int TIME_SECONDS_IN_MINUTE = 60;
    private static final int TIME_SECONDS_IN_DAY = TIME_SECONDS_IN_MINUTE * TIME_MINUTES_IN_HOUR * TIME_HOURS_IN_DAY;
    private int hours;    // 0..23
    private int minutes;  // 0..59
    private int seconds;  // 0..59

    public Time() {
        this(0, 0, 0);
    }


    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if ((hours < 0) || (hours >= TIME_HOURS_IN_DAY)) {
            hours = 0;
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if ((minutes < 0) || (minutes >= TIME_MINUTES_IN_HOUR)) {
            minutes = 0;
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if ((seconds < 0) || (seconds >= TIME_SECONDS_IN_MINUTE)) {
            seconds = 0;
        }
        this.seconds = seconds;
    }

    public void moveAhead(int hours, int minutes, int seconds) {
        int s = seconds + this.seconds + TIME_SECONDS_IN_MINUTE * (minutes + this.minutes + TIME_MINUTES_IN_HOUR * (hours + this.hours));
        //int d = s / TIME_SECONDS_IN_DAY; // days is out of scope the task
        s %= TIME_SECONDS_IN_DAY;
        if (s < 0) {
            s += TIME_SECONDS_IN_DAY;
            //d--; // days is out of scope the task
        }
        setSeconds(s % TIME_SECONDS_IN_MINUTE);
        int m = s / TIME_SECONDS_IN_MINUTE;
        setMinutes(m % TIME_MINUTES_IN_HOUR);
        setHours(m / TIME_MINUTES_IN_HOUR);
    }

    public void moveBehind(int hours, int minutes, int seconds) {
        moveAhead(-hours, -minutes, -seconds);
    }
}
