public class Calculator {



        public double sum (float x, float y) {
            double result = x + y;
            return result;
        }


        public  double substraction (float x, float y){
            double result1 = x - y;
            return result1;
        }

        public double multiplication (float x, float y){
            double result2 = x * y;
            return result2;
        }

        public float division (float x, float y){
            float result3 = x/y;
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



}
