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
    public static String maximumValue(String[]array){
        String max = array[0];
        for(int index = 0; index<array.length; index++){
            if(array[index].length()>max.length()){
                max =array[index];
            }
        }
        return max;
    }
    public static void main(String[] args) {
      String[]strings ={"rahul","jitendra","sonu"};
      String max = Array.maximumValue(strings);
        System.out.println("the maximum String is : "+ max);
    }
}
