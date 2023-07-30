public class Demo4 {
    public static void main(String[] args) {
        int day = 28, month = 12, year = 2023,hour = 23,minutes = 59, second = 59;
        System.out.printf("\033[35;1m%d\033[30;0m/\033[31;1m%s\033[31;0m/\033[33;1m%s\033[33;0m \033[34;1m%s\033[34;0m:\033[36;1m%s\033[36;0m:\033[32;1m%s\033[30;0m\n", month,day, year,hour,minutes,second);
        
    }
}
