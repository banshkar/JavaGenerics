public class Array{
   public static int maximumValue(Integer[]array){
       int max = array[0];
       for(int index = 0; index<array.length; index++){
           if(array[index]>max){
               max =array[index];
           }
       }
       return max;
   }
    public static Double maximumValue(Double[]array){
        Double max = array[0];
        for(int index = 0; index<array.length; index++){
            if(array[index]>max){
                max =array[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {
      Double[]doubles = {80.5,26.5,50.3};
       Double max = Array.maximumValue(doubles);
        System.out.println("the maximum Value :"+ max);
    }
}
