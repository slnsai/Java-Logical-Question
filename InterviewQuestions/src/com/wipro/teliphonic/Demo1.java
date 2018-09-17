package com.wipro.teliphonic;

import java.util.TimerTask;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Demo1 extends TimerTask{
	Thread t1 = new Thread(){
	     public void run(){
	        for(int i = 1;i <= 10;i++)
	        {
	            System.out.println(i);
	        }           
	     }
	 };

	// my second thread
	Thread t2 = new Thread(){
	     public void run(){
	        for(int i = 11;i <= 20;i++)
	        {
	            System.out.println(i);
	        }           
	     }
	 };

	public static void main(String[] args){
	      long ONCE_PER_DAY = 1000*60*60*24;

	     Calendar calendar = Calendar.getInstance();
	     calendar.set(Calendar.HOUR_OF_DAY, 12);
	     calendar.set(Calendar.MINUTE, 05);
	     calendar.set(Calendar.SECOND, 00);
	     Date time = calendar.getTime();

	     TimerTask check  = new timercheck();
	     Timer timer = new Timer();
	     timer.scheduleAtFixedRate(check, time ,ONCE_PER_DAY);
	}

	@Override    
	// run method of timer task
	public void run() {
	    t1.start();
	    t2.start();
	}

}
