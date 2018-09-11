//class Time {
//    private int hour;
//    private int minute;
//    private int second;
//
//    Time(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    public String toUniversal() {
//        String hourUniversal = Integer.toString(hour);
//        String minuteUniversal = Integer.toString(minute);
//        String secondUniversal = Integer.toString(second);
//        if (hour < 10) hourUniversal = "0" + hourUniversal;
//        if (minute < 10) minuteUniversal = "0" + minuteUniversal;
//        if (second < 10) secondUniversal = "0" + secondUniversal;
//        return hourUniversal + ":" + minuteUniversal + ":" + secondUniversal;
//    }
//
//    public String toStandard() {
//        String hourStd;
//        String minuteStd = Integer.toString(minute);
//        String secondStd = Integer.toString(second);
//
//        if (hour > 12) {
//            hour = hour - 12;
//        }
//        hourStd = Integer.toString(hour);
//
//
//        if (hour < 10) hourStd = "0" + hourStd;
//        if (minute < 10) minuteStd = "0" + minuteStd;
//        if (second < 10) secondStd = "0" + secondStd;
//
//        return hourStd + ":" + minuteStd + ":" + secondStd + " PM";
//    }
//
//
//    public int add(Time t1, Time t2) {
//        int totalTime = t1.hour + t2.hour;
//        return totalTime;
//
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        Time t1 = new Time(23,5,6);
//        System.out.println(t1.toUniversal());
//        System.out.println(t1.toStandard());
//
//        Time t2 = new Time(4,24,33);
//        System.out.println(t2.toUniversal());
//        System.out.println(t2.toStandard());
//
//        t1.add(t1, t2);
//        System.out.println(t1.add(t1, t2));
//
//    }
//}
class Time{
    private int hr=0;
    private int min=0;
    private int sec;
    Time(int hr,int min,int sec){
        this.sec = sec;
        if(this.sec>=60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = min;
        if(this.min>=60){
            this.min=this.min%60;
            this.hr++;
        }
        this.hr = hr%24;
    }
    public void settime(int hr,int min,int sec){
        this.sec = sec;
        if(this.sec>=60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = min;
        if(this.min>=60){
            this.min=this.min%60;
            this.hr++;
        }
        this.hr = hr%24;
    }
    public void add(Time tim){
        this.sec = this.sec + tim.sec;
        if(this.sec>=60){
            this.sec = this.sec%60;
            this.min++;
        }
        this.min = this.min + tim.min;
        if(this.min>=60){
            this.min=this.min%60;
            this.hr++;
        }
        this.hr = (this.hr + tim.hr)%24;
    }
    public String toUniversal(){
        String res = "";
        String shr = Integer.toString(hr);
        String smin = Integer.toString(min);
        String ssec = Integer.toString(sec);
        if(shr.length()==2){
            res = res + shr;
        }else{
            res = res + "0"+shr;
        }
        res = res + ":";
        if(smin.length()==2){
            res = res + smin;
        }else{
            res = res + "0"+smin;
        }
        res = res + ":";
        if(ssec.length()==2){
            res = res + ssec;
        }else{
            res = res + "0"+ssec;
        }
        return res;
    }
    public String toStandard(){
        boolean ok = false;
        String res = "";
        String shr = Integer.toString(hr);
        String smin = Integer.toString(min);
        String ssec = Integer.toString(sec);
        if(hr<13){
            res = res + shr;
            ok = true;
        }else{
            res = res + Integer.toString((hr-12));
        }
        res = res + ":";
        if(smin.length()==2){
            res = res + smin;
        }else{
            res = res + "0"+smin;
        }
        res = res + ":";
        if(ssec.length()==2){
            res = res + ssec;
        }else{
            res = res + "0"+ssec;
        }
        if(ok){
            res = res + " AM";
        }else{
            res = res + " PM";
        }
        return res;
    }
}
class Main{
    public static void main(String[] args){
        Time t = new Time(18,15,16);
        t.settime(16,16,16);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(27,29,29);
        t.add(t2);
    }
}