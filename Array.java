public class Array <T extends Comparable<T>>{
    T value_1;
    T value_2;
    T value_3;
    public Array(T value_1, T value_2, T value_3) {
        this.value_1 = value_1;
        this.value_2 = value_2;
        this.value_3 = value_3;
    }
    public  T Maximum(){
        return Array.maximum(value_1,value_2,value_3);
    }
    public static <T extends Comparable<T>> T maximum(T value_1, T value_2, T value_3){
        T max = value_1;
        if(value_2.compareTo(max)>0){
            max = value_2;

        }  if (value_3.compareTo(max)>0){
            max =value_3;
        }
        toPrint(value_1,value_2,value_3);
        return max;
    }

    public static  <T> void toPrint( T value_1, T value_2, T value_3){
        System.out.println("max value :"+value_1+" "+value_2+" "+ value_3+ " " );
    }
    public static void main(String[] args) {
        Array  array_1 =new Array(10,2000,200);
        Array  array_2 =new Array(10.2,20.4,11.6);
        Array  array_3 =new Array("rahul","jitendra","Gwalior");
        System.out.println(array_1.Maximum());
        System.out.println(array_2.Maximum());
        System.out.println(array_3.Maximum());
    }
}
