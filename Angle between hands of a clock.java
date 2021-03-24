class Solution {
    public double angleClock(int hour, int minutes) {
        
        //hour hand moves (360/12)=30 per hour and 30/60=0.5 per min
        double hour_angle = (30*hour) + (minutes)* 0.5;
        
        // min hand moves 0 per hour and 360/60=6 per min
        double min_angle = 0*hour + 6*minutes;
    
        double angle = Math.abs(hour_angle-min_angle);
    
    if(angle<=180)
        return angle;
    else
        return 360-angle;
    }
}
