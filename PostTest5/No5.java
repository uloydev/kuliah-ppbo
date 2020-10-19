import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;
        Time time;
        int h, m, s;

        print("Selamat Datang Di Program Time\n");
        do {
            print("\nmasukkan jam : ");
            h = input.nextInt();
            print("masukkan menit : ");
            m = input.nextInt();
            print("masukkan detik : ");
            s = input.nextInt();
            time = new Time(h, m, s);
            print("\nUniversal time : " + time.toUniversalString());
            print("\nStandard time : " + time.toString());
            input.nextLine();
            print("\n\nUlang lagi ? (y/n)");
            again = input.nextLine();
        } while (again.equals("y"));
        print("\nBye-bye\n");        
    }

    public static void print(Object any) {
        System.out.print(any);
    }
}

class Time {
    private int hour, minute, second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public String toUniversalString() {
        this.timeValidation();
        Object hour = this.hour == 0 ? "00" : this.hour;
        Object minute = this.minute == 0 ? "00" : this.minute;
        Object second = this.second == 0 ? "00" : this.second;
        return hour + ":" + minute + ":" + second;
    }

    public String toString() {
        String suffix;
        this.timeValidation();
        suffix = (this.hour < 12) ? "AM" : "PM";
        this.hour = (this.hour != 0 ) ? this.hour % 12 : 12;
        Object hour = this.hour == 0 ? "00" : this.hour;
        Object minute = this.minute == 0 ? "00" : this.minute;
        Object second = this.second == 0 ? "00" : this.second;
        return hour + ":" + minute + ":" + second + " " + suffix;
    }

    private void timeValidation() {
        if (this.hour < 0 || this.hour >= 24)
            this.hour = 0;
        if (this.minute < 0 || this.minute >= 60)
            this.minute = 0;
        if (this.second < 0 || this.second >= 24)
            this.second = 0;
    }
}
