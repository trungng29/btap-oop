import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }
}

class ath implements Comparable<ath> {

    public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    private String name;
    private int yrs;
    private String st;
    private String en;

    ath(
            String name,
            String yrs,
            String st,
            String en
    ) {
        this.name = name;
        this.yrs = 2021 - Integer.parseInt(yrs.substring(6));

    }

    @Override
    public int compareTo(ath o) {
        return 0;
    }

}
