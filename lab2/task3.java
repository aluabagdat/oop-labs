public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if (h >= 0 && h < 24) this.hour = h;
        else this.hour = 0;
        
        if (m >= 0 && m < 60) this.minute = m;
        else this.minute = 0;
        
        if (s >= 0 && s < 60) this.second = s;
        else this.second = 0;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = hour;
        String ampm = "AM";
        if (h >= 12) {
            ampm = "PM";
            if (h > 12) h -= 12;
        }
        if (h == 0) h = 12;
        return String.format("%02d:%02d:%02d %s", h, minute, second, ampm);
    }

    public void add(Time t) {
        this.second += t.second;
        this.minute += t.minute + this.second / 60;
        this.second %= 60;

        this.hour += t.hour + this.minute / 60;
        this.minute %= 60;

        this.hour %= 24;
    }

    public static void main(String[] args) {
        Time t1 = new Time(23, 5, 6);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());
    }
}
