public class CodingExercise29 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double totalArea = width * height;

        if(width > 0 && height > 0 && extraBuckets >= 0 && areaPerBucket > 0){
            for (int i = 1; i <= extraBuckets ; i++){
                if (totalArea >= areaPerBucket){
                    totalArea -= areaPerBucket;
                }
            }
            if(totalArea != 0){
                return (int) (totalArea / areaPerBucket) + 1;
            }
        }
        return -1;
    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        double totalArea = width * height;

        if(width > 0 && height > 0 && areaPerBucket > 0){
            return (int) (totalArea / areaPerBucket) + 1;
        }
        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area > 0 && areaPerBucket > 0){

                return (int) (area / areaPerBucket) + 1;
        }
        return -1;
    }
}


