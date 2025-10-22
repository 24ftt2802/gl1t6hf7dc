public class ProductRating {
    public static void main(String[] args) {
       
        int[][] ratings = {
            {4, 5, 4},  
            {3, 5, 3},  
            {4, 5, 3},  
            {1, 2, 1}   
        };
        
        System.out.println("Rating\tProduct\tPackage\tDelivery");
        
        double productAvg = 0, packageAvg = 0, deliveryAvg = 0;
        
        for (int i = 0; i < ratings.length; i++) {
            productAvg += ratings[i][0];
            packageAvg += ratings[i][1];
            deliveryAvg += ratings[i][2];
        }
        
        productAvg /= ratings.length;
        packageAvg /= ratings.length;
        deliveryAvg /= ratings.length;
        
        System.out.printf("Average\t%.2f\t%.2f\t%.2f%n", productAvg, packageAvg, deliveryAvg);
        System.out.println();
        
        for (int i = 0; i < ratings.length; i++) {
            double customerAvg = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                customerAvg += ratings[i][j];
            }
            customerAvg /= ratings[i].length;
            System.out.printf("Customer %d provide the average rating %.2f%n", i + 1, customerAvg);
        }
    }
}