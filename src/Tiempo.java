public class Tiempo {

    private int hour;
    private int minute;
    private int second;

    public Tiempo(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString(){
        return (hour+":"+minute+":"+second);
    }

    public void nextSecond() {

        second++;

        if (second > 59) {
            second = 0;
            minute++;
        }
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
    }

    public void prevSecond(){
        second--;

        if(second<0){
            second=59;
            minute--;
        }
        if(minute<0){
            minute=59;
            hour--;
        }
        if(hour<0){
            hour=23;
        }
    }
}
