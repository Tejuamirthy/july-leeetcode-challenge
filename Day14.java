// Given two numbers, hour and minutes. Return the smaller angle (in degrees) formed between the hour and the minute hand.

class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) {
            hour = 0;
        }
        double minC = minutes*6, hourC = (hour + ((double)minutes/(double)60))*30, temp = Math.abs(hourC-minC);
        // System.out.println(""+hourC+" - "+ minC);
        
        return temp <= 180 ? temp : 360 - temp;
    }
}
