public class Generics_Demo {
    public static void main(String[] args) {
        Integer[] arr={10,2,4,6};
        Display(arr);
        String[] arr1={"raj","ankit","ankita"};
        Display(arr1);
    }
    public static<T> void Display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static<T>T get(T[] arr){
        return arr[0];
    }

}
