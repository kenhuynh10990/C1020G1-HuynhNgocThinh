package OOP.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime){
        return startTime;
    }

    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }
    public void stop(){
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }
    public void getElapsedTime(){
        int elaspedTime = (endTime.toSecondOfDay() - startTime.toSecondOfDay()) * 100;
        System.out.println("Số mili giây đếm đc:" + elaspedTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Waiting!!!");
        for (int i =0; i<100000000;i++){
            stopWatch.stop();
        }
        stopWatch.getElapsedTime();
    }
}
