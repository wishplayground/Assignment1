public class Demo6Task_b {
    public static void main(String[] args) {
        String yellowClr = "\033[0;33m",redClr = "\033[0;31m" ,reset  = "\033[0m";
        System.out.printf("%s+-----------------+-----+\033[0m%s\n",yellowClr,reset);
        System.out.printf("%1$s|%2$s \033[1;34m%3$s\033[0m            %1$s|%2$s \033[1;34m%4$s\033[0m %1$s|%2$s\n",yellowClr,reset,"Name","Age");
        System.out.printf("%s+-----------------+-----+\033[0m%s\n",yellowClr,reset);
        System.out.printf("%1$s|%3$s %4$s           %1$s|%3$s %2$s%5$d%3$s %1$s |%3$s\n",yellowClr,redClr,reset,"Alice",24);
        System.out.printf("%1$s|%3$s %4$s             %1$s|%3$s %2$s%5$d%3$s %1$s |%3$s\n",yellowClr,redClr,reset,"Bob",30);
        System.out.printf("%s+-----------------+-----+\033[0m%s\n",yellowClr,reset);
    }
}
