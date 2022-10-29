public class Week4{
    public static void main(String[] args){

        


        int d=2;

        // Print out the day of the week
        // M, T, W, R, F, SA, SU
        // 1, 2, 3, ...

        daysOfTheWeek thatDay;

        // We want thatDay to take the associated value.
        switch(d){
        case 1:
            thatDay=daysOfTheWeek.MONDAY;
            break;
        case 2:
            thatDay=daysOfTheWeek.TUESDAY;
            break;
        case 3:
            thatDay=daysOfTheWeek.WEDNESDAY;
            break;
        case 4:
            thatDay=daysOfTheWeek.THURSDAY;
            break;
        case 5:
            thatDay=daysOfTheWeek.FRIDAY;
            break;
        case 6:
            thatDay=daysOfTheWeek.SATURDAY;   
            break;         
        default:
            thatDay=daysOfTheWeek.SUNDAY;
        }

        String tDay="";
        System.out.println("Day "+d+" is "+thatDay);

        int dd=6;
        // switch(dd){
        //     case 1 -> tDay="Monday";
        //     case 2 -> tDay="Tuesday";
        //     case 3 -> tDay="Wednesday";
        //     case 4 -> tDay="Thursday";
        //     case 5 -> tDay="Friday";
        //     case 6 -> tDay="Saturday";
        //     case 7 -> tDay="Sunday";
        // }
        String isHoliday;
        if(dd==6 || dd==7){
            isHoliday="a holiday";
        }
        else
        {
            isHoliday="not a holiday";
        }

        System.out.println("Day "+dd+" is "+tDay +", which is "+isHoliday);
    
        for(int i=0;i<10;i++)//We are in row 1
                             //1 2 4 
                             //We are in row 2
                             //1 2 4
                             //We are in row 4
                             //1 2 4
        //i=7                //We are in row 5
                             //1 2 4
                             //We are in row 6
                             //1 2 4
                             //We are in row 7
                             //1 2 4
        {
            if(i==2){
                continue;
            }
            if(i==7){
                break;
            }
            //i=4
            System.out.println("We are in row "+(i+1));
            // for(int j=0;j<5;j++)
            // //j=0
            // {
            //     if(j==2)
            //     {
            //         continue;
            //     }
            //     //j=0
            //     System.out.print((j+1)+" ");
            //     if(j==3)
            //     {
            //         break;
            //     }
            // }
            System.out.println();
        }

        int count=0;
        //count = 12
        while(count<10)
        {
            System.out.println(count);
            count=count+3;
        }
        

        //count = 9

        do
        {
            System.out.println(count);
            count=count-3;
        }while(count<7&&count>=0);

        //count = -3
        do
        {
            System.out.println(count);
            count=count-3;
        }while(count<7&&count>=0);
        // 0 3 6 9 12 9 6 3 0 hoh
        //count = -3
        while(count<-1)
        {
            System.out.print("hoh");
            if(count==-3)
            {
                break;
            }
            count++;
            
        }
        System.out.println();
        
        // Given an integer, print out the sum of digit values.
        // java digitSum 3546287382
        // 18
        // Or a harder question would be printing out
        // 3+5+4+6=18

        int num = 5334;
        //number == 5334
        //sum == 0
        // %10 = 4, sum+=4; 
        //number == 5334
        //sum == 4
        // sayıyı 10a bölmeye devam edicem
        //number == 533
        //sum == 4
        // %10 = 3, sum+=3;
        // sayıyı 10a bölmeye devam edicem
        //number == 53 
        //sum == 7
        // %10 = 3, sum+=3;

        // sayıyı 10a böldügümde onuc sıfır cıkıyorsa


        int number = 341235236;
        int result = 0;
        while(number>0){
            result+=number%10;
            // System.out.print((number%10));
            // if(number>=10) // if two or more digits remain
            // {
            //      System.out.print("+");
            // }   
            number=number/10;
        }
        System.out.println("="+result);
    }
}

enum daysOfTheWeek{
    MONDAY,TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY


}