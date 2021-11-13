package edu.northeastern.utkarsh;

//Time Complexity: O(n)
//Space Complexity: O(1)

//The following code snippet can be pasted in the solution section for Leetcode problem #1279 for desired output
public class TrafficLightIntersection {
    public static void main(String[] args) {

    }

    class trafficManagement{
        private final Signal signal;

        public trafficManagement(){
            signal = new Signal();
        }

        public void carArrived(int carId, int roadId, int direction, Runnable turnGreen, Runnable crossCar){
            synchronized (signal){
                if(signal.greenRoad != roadId){
                    turnGreen.run();
                    signal.greenRoad = roadId;
                }
                crossCar.run();
            }
        }
    }
}
