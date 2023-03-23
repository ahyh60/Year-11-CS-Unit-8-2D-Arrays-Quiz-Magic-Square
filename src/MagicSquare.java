public class MagicSquare {

    /**
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int j = 0; j < array2d[0].length;j++) {
            sum = sum + array2d[0][j];
        }
        return sum;
    }


    /**
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     * Because we have already determined the sum of the first row
     * via the method 'calculateCheckSum', this method can begin
     * iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int sum;
        for (int i = 0; i < array2d.length; i++) {
            sum = 0;
            for (int j = 0; j < array2d[i].length; j++) {
                sum += array2d[i][j];
            }
            if (sum != checkSum)
                return false;
        }
        return true;
    }

    /**
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int sum;
        for (int j = 0; j < array2d[0].length; j++) {
            sum = 0;
            for (int i = 0; i < array2d.length; i++) {
                sum += array2d[i][j];
            }
            if (sum != checkSum)
                return false;
        }
        return true;
    }

    /**
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int d1 = 0;
        int d2= 0;
        for(int i  = 0; i< array2d.length; i++){
            d1 = d1 + array2d[i][i];
        }

        for(int i = 0; i< array2d.length; i++){
            d2 = d2 + array2d[i][array2d.length-i-1];
        }

        if(d1 == checkSum && d2 == checkSum)
            return true;
        else
            return false;

    }


    /**
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int sum = calculateCheckSum(array2d);
        if (magicRows(array2d, sum)==true && magicColumns(array2d, sum) ==true  && magicDiagonals(array2d, sum) ==true)
            return true;
        else
            return false;
    }
}
