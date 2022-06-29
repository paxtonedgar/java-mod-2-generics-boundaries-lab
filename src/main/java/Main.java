import java.util.List;

public class Main {
    // implement the public averageList method here
    
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        averageList(intList); // 3.0

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        averageList(doubleList); // 3.0       
    }

        public static void averageList(List<? extends Number> list) {
            double total = 0;

            for(Number n : list){
        	    total += n.doubleValue();
            }

            double average = total / list.size();
            System.out.format("The average is: %.3f%n", average);
        }

}
