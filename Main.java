package Date_Month_Year;

import java.util.*;
class DayException extends Exception{
 public void DayException(){}
}
class MonthException extends Exception{
 public void MonthException(){}
}
class YearException extends Exception{
 public void YearException(){}
}
class Check{
 public static int readDay(int day,int month) throws DayException
 {
 try{
 if(day<=maximumDay(month)){
 return day;
 }
 /* else if(day<=30&&(month==4||month==6||month==9||month==11))
 {
 return day;
 }
 else if(day<=31&&month<=12)
 {
 return day;
 }*/
 else {
 throw new DayException();
 }
 }
 catch (DayException e) {
 throw new DayException();
 }
 }
 public static int readMonthNumber(int month) throws MonthException
 {
 try{
 if(month<=12)
 {
 return month;
 }
 else{
 throw new MonthException();
 }
 }
 catch(MonthException e)
 {
 throw new MonthException();
 }
 }
 public static int readYearNumber(int year) throws YearException
 {
 try{
 if(year>=1000&&year<=3000)
 {
 return year;
 }
 else{
 throw new YearException();
 }
 }
 catch(YearException e)
 {
 throw new YearException();
 }
 }
 public static int maximumDay(int monthNumber)
 {
 
if(monthNumber==1||monthNumber==3||monthNumber==5||monthNumber==7||monthNum
ber==8||monthNumber==10||monthNumber==12)
 {
 return 31;
 }
 else if(monthNumber==2)
 {
 return 29;
 }
 else{
 return 30;
 }
 }
 public static String monthString(int monthNumber) throws MonthException
 {
 try{
 if(monthNumber<=12)
 {
 String[] 
arr={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};

 return arr[monthNumber-1];
 }
 else{
 throw new MonthException();
 }
 }
 catch(MonthException e){
 throw new MonthException();
 }
 }
}
public class Main
{
 public static void main(String []args)
 {
 Scanner sc=new Scanner(System.in);
 int month=sc.nextInt();
 int day=sc.nextInt();
 int year=sc.nextInt();
 while(true){
 try{
 String a=Check.monthString(month);
 int b=Check.readDay(day,month);
 int c=Check.readYearNumber(year);
 System.out.println("Date:"+a+"-"+b+"-"+c);
 break;
 }
 catch(DayException e)
 {
 System.out.println("Invalid Day");
 day=sc.nextInt();
 }
 catch(MonthException e)
 {
 System.out.println("Invalid Month");
 month=sc.nextInt();
 }
 catch(YearException e)
 {
 System.out.println("Invalid Year");
 year=sc.nextInt();
 }}
 }
}

