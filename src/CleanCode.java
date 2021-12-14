public class CleanCode {
    static class Check {

        int smallernumber;
        int largernumber;
    }

    static Check Findlargersmaller(int[] Array, int sizeOfArray){
        Check objectOfCheck = new Check();

        int i;

        if (sizeOfArray == 1) {
            objectOfCheck.largernumber = Array[0];
            objectOfCheck.smallernumber = Array[0];
            return objectOfCheck;
        }

        if (Array[0] > Array[1]) {
            objectOfCheck.largernumber = Array[0];
            objectOfCheck.smallernumber = Array[1];
        }

        else {
            objectOfCheck.largernumber = Array[1];
            objectOfCheck.smallernumber = Array[0];
        }

        for (i = 2; i < sizeOfArray; i++) {
            if (Array[i] > objectOfCheck.largernumber)
            {
                objectOfCheck.largernumber = Array[i];
            }
            else if (Array[i] < objectOfCheck.smallernumber)
            {
                objectOfCheck.smallernumber = Array[i];
            }
        }

        return objectOfCheck;
    }

    public static void main(String[] args) {
        int [] Array = {1000, 11, 445, 1, 330, 3000}; //Given array of elements
        int sizeOfArray = 6;
        Check objectOfCheck = Findlargersmaller(Array, sizeOfArray);//Calling of the method

        //Printing Array
        System.out.printf("\n Given array : ");
        for(int i=0;i<sizeOfArray;i++){
            System.out.printf(Array[i]+" ");
        }
        System.out.printf("\n Smallest Number in array : %d", objectOfCheck.smallernumber);
        System.out.printf("\n Largest Number in array : %d", objectOfCheck.largernumber);
    }
}