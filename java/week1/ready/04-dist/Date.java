// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Date<m> {
    
    public int day;
    public int month;

    public ArrayList<Integer> months31Days = new ArrayList<Integer>();
    public ArrayList<Integer> months30Days = new ArrayList<Integer>();
    public ArrayList<Integer> months28Days = new ArrayList<Integer>();

    Date( int d, int m )
    {
        System.out.println(day);
        System.out.println(month);
        months31Days.add(1);
        months31Days.add(3);
        months31Days.add(5);
        months31Days.add(7);
        months31Days.add(8);
        months31Days.add(10);
        months31Days.add(12);

        months30Days.add(4);
        months30Days.add(6);
        months30Days.add(9);
        months30Days.add(11);

        months28Days.add(2);


        if( months31Days.contains(m) && d<=31 && d >= 0 && m <12){
          this.month = m;
          this.day = d;
      } else if(months31Days.contains(m) && d>31 && m <12){

            this.month = this.month + (d % 31);
            this.day = d - 31;
        }

          if(m == 4 || m == 6 || m == 9 || m == 11 && d<=30 && d >= 0 && m <12){
          this.month = m;
          this.day = d;
      }else if(m == 4 || m == 6 || m == 9 || m == 11 && d>30 && m <12){
           this.month = this.month + (d % 30);
            this.day = d - 30;
      }

        if(m > 12){
          this.month = 1;
          this.day = 1;

      }
//        else{
//            this.month = m;
//            this.day = d;
//        }
//        if(this.month > 12){
//            this.month = 1;
//            this.day = 1;
//        }else{
//            this.month = m;
//            this.day = d;
//        }
    }

    void addDays( int n )
    {
        if (months31Days.contains(this.month) && (this.day + n) > 31) {
            System.out.println(this.day + n);
            int updatedDay = (this.day + n) - 31;
            int updatedMonth = this.month + ((this.day + n) % 31);

            if(updatedMonth <= 12) {
                this.month = updatedMonth;
                this.day = updatedDay;
            }else if(updatedMonth > 12){
                this.month = 1;
                this.day = 1;
            }


        }else if(months31Days.contains(this.month) && (this.day + n) <= 31 && this.month <= 12){
            this.day = this.day + n;
//            this.month = this.month;

        }
        if (months30Days.contains(this.month) && this.day + n > 30) {
            int updatedMonth = this.month + ((this.day + n )% 30);
            int updatedDay = (this.day + n) - 30;

            if(updatedMonth <= 12) {
                this.month = updatedMonth;
                this.day = updatedDay;
            }else{
                this.month = 1;
                this.day = 1;
            }

        }else if(months30Days.contains(this.month) && this.day + n <= 30){
            this.day = this.day + n;
        }
        if (months28Days.contains(this.month) && this.day + n > 28) {
            int updatedMonth = month + (this.day + n % 28);
            int updatedDay = (this.day + n) - 28;

            if(updatedMonth <= 12) {
                this.month = updatedMonth;
                this.day = updatedDay;
            }else{
                this.month = 1;
                this.day = 1;
            }

        }else if(months28Days.contains(this.month) && this.day + n <= 28){
            this.day = this.day + n;
        }

    }

    public String toString() {
        String result = "";
        if (this.day < 10 && this.month < 10) {
            result =  "0" + this.day + "/" + "0" + this.month;
        }
        if (this.day < 10 && this.month > 10 ) {
            result = "0" + this.day + "/" + this.month;
        }
        if (this.day > 10 && this.month < 10) {
            result = this.day + "/" + "0" + this.month;
        }
        if (this.day > 10 && this.month > 10 ) {
            result = this.day + "/" +  this.month;
        }

        System.out.println(this.month);
        return result;
    }
}
