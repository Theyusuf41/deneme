package Team_Work_Project.Team_Work_Project02;

public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayinin max number print eden code create ediniz.

     */


    public static void main(String[] args) {

        int arr1[][] = {
                {1, 2, 3},//0.kat
                {2, 3, 1},//1.kat
                {5, 5, 5}, //2.kat
                {2, 10, 3} //3.kat
        };

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > result) {
                    result=arr1[i][j];
                }
            }
        }
        System.out.println("max number=" + (result));
    }
}
