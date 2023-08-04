public class Demo6Task_d {
    public static void main(String[] args) {
        //Declare varialbles
        int qty1 = 5, qty2 = 10;
        float pr1 =0.99f, pr2 = 1.49f ;
        String itm1 = "Apples", itm2 = "Oranges", dollar = "\033[0;32m$\033[0m ";


        String yellowClr = "\033[0;33m",redClr = "\033[0;31m",blueclr = "\033[0;34m" ,reset  = "\033[0m";
        String boader = String.format("%s+---------+-----------+-------+%s",yellowClr,reset);
        String line = String.format("%1$s|%2$s",yellowClr,reset);
        System.out.println(boader);
        System.out.printf("%1$s \033[1;37m%3$s    %1$s \033[1;37m%4$s  %1$s \033[1;37m%5$s %1$s   \033[0m\n",line,reset,"ITEM","Quantity","Price");
        System.out.println(boader);
        System.out.printf("%1$s %4$s  %1$s         \033[0;34m%5$d\033[0m %1$s \033[0;32m$\033[0m%2$s%7$.2f%3$s %1$s   \n",line,redClr,reset,itm1,qty1,dollar,pr1);
        System.out.printf("%1$s %4$s  %1$s        \033[0;34m%5$d\033[0m %1$s \033[0;32m$\033[0m%2$s%7$.2f%3$s %1$s   \n",line,redClr,reset,itm1,qty2,dollar,pr2);
        System.out.println(boader);
    }
}
