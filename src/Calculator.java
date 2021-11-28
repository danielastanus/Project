import java.util.List;

public class Calculator {



         public double sum (float x, float y) {
            double result = x + y;
            return result;
        }

        public double sum (float x, float y, float z) {
            double result = x + y + z;
            return result;
    }

        public double sum (List<Integer> list) {
            double result = 0;
            for (Integer x: list){
            result += x;
        }
        return result;
    }


        public  double substraction (float x, float y){
            double result1 = x - y;
            return result1;
        }

    public  double substraction (double x, float y, float z){
        double result1 = x - y - z;
        return result1;
    }


        public double multiplication (float x, float y){
            double result2 = x * y;
            return result2;
        }

    public double multiplication (float x, float y, double z){
        double result2 = x * y * z;
        return result2;
    }


        public float division (float x, float y){
            float result3 = x/y;
            return result3;
        }

    public float division (float x, float y, float z){
        float result3 = x/y/z;
        return result3;
    }

        public float modulus (float x, float y){
            float result4 = x%y;
            return result4;
        }

        public float array (float x, float y, float z){
            float result5 = (x+y+z)/3;
            return result5;

        }

        public float degreeFarenheit (float x){
            float degreeCelsius =(x-32)*5/9;
            return degreeCelsius;
        }

        public double inches (double x){
            double meters = 0.0254 *x;
            return meters;



        }

        public double speedKmHr(double distanceKm,double timeHr){
            System.out.println(distanceKm);
            System.out.println(timeHr);
            return distanceKm/timeHr;



        }

        public double printSpeedInMetric(int meters, int hours, int minutes, int seconds){
            int timeInSeconds = (hours* 3600) + (minutes *60) + seconds;
            float speedMeters = meters/timeInSeconds;
            System.out.println("The speed in m/s: "+speedMeters);
            double kmPerHour = speedMeters * 3.6;
            System.out.println("The speed in km/h:" +kmPerHour);
            double milesPerHour =kmPerHour/ 1.609;
            System.out.println("The speed in m/h:" +milesPerHour);
            return speedMeters + kmPerHour + milesPerHour;
        }











}
