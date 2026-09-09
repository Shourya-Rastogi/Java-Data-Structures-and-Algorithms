package StackAndQueues.MonotonicStackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class AsteroidCollision {
    int[] asteroidCollision(int[] asteroids){
        List<Integer> st=new ArrayList<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0) st.add(asteroids[i]);
            else{
                while(!st.isEmpty()
                        && st.getLast()>0 &&
                        st.getLast()<Math.abs(asteroids[i]) )
                    st.removeLast();
            }
            if(!st.isEmpty() && st.getLast()==Math.abs(asteroids[i])) st.removeLast();
            else if(st.isEmpty() || st.getLast()<0) st.add(asteroids[i]);
        }
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }
        return result;
    }

    int[] asteroid(int[] asteroids){
        int n = asteroids.length;

        // List acting as a stack to store surviving asteroids
        List<Integer> st = new ArrayList<>();

        // Traverse through each asteroid
        for (int asteroid : asteroids) {

            // If asteroid is moving right, push it to the stack
            if (asteroid > 0) {
                st.add(asteroid);
            }

            // If asteroid is moving left, handle possible collisions
            else {
                // Destroy all smaller right-moving asteroids
                while (!st.isEmpty() && st.getLast() > 0 &&
                        st.getLast() < Math.abs(asteroid)) {
                    st.removeLast();
                }

                // Destroy both if sizes are equal
                if (!st.isEmpty() && st.getLast() == Math.abs(asteroid)) {
                    st.removeLast();
                }

                // If top of stack is a left-moving or no asteroid, add this one
                else if (st.isEmpty() || st.getLast() < 0) {
                    st.add(asteroid);
                }
            }
        }

        // Convert the list to an array
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        // Return the final state of asteroids
        return result;
    }
}
