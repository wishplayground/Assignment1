public class Demo6Task_c {
    public static void main(String[] args) {
        int pop1 = 3966936, pop2 = 8336817;
        String yellowClr = "\033[0;33m",redClr = "\033[0;31m" ,reset  = "\033[0m";
        String boader = String.format("%s+-----------------+--------------+------------+%s",yellowClr,reset);
        String line = String.format("%1$s|%2$s",yellowClr,reset);
        System.out.println(boader);
        System.out.printf("%1$s \033[1;37m%3$s            %1$s \033[1;37m%4$s        %1$s \033[1;37m%5$s %1$s   \033[0m\n",line,reset,"City","State","Population");
        System.out.println(boader);
        System.out.printf("%1$s %4$s     %1$s %5$s    %1$s \033[0;31m%6$,d\033[0m  %1$s   \n",line,redClr,reset,"Los Angeles","Califonia",pop1);
        System.out.printf("%1$s \033[0;32mNew\033[0m %4$s        %1$s \033[0;32mNew\033[0m %5$s     %1$s \033[0;31m%6$,d\033[0m  %1$s   \n",line,redClr,reset,"York","York",pop2);
        System.out.println(boader);
    }   
    
}
