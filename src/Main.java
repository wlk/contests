
public class Main {
    public static void main(String[] args){
        String s1 = "COUNT(IF( round((unix_timestamp(wt_conversions.first_purchase_date) - round(t.occurred / 1000)) / 3600) == ";
        String s2 = ", 1, NULL)) as tracking_";
        String s3 = "_before_conversion,";
        int n = 48;
        for (int i = 0; i <= n; ++i){
            System.out.println(s1 + i + s2 + i + s3);
        }

        String ss1 = "wt_tracking.tracking_";
        String ss2 = "_before_conversion,";

        for (int i = 0; i <= n; ++i){
            System.out.println(ss1 + i + ss2);
        }
    }
}
