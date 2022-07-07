public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = {{"1", "2", "89", "32"},
                          //  {"15", "47", "23", "3"},
                            {"1", "5", "57", "21"},
                            {"5u", "15", "1", "4"}};


        cheackArray(array);
    }


    private static void cheackArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int summ = 0;
        int val = 0;
        if (array.length != 4) {
            try {
                throw new MyArraySizeException("Размер массива не соответствует 4х4.");
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                try {
                    throw new MyArraySizeException("Размер массива не соответствует 4х4.");
                } catch (MyArraySizeException e) {
                    e.printStackTrace();
                }
            }
            for (int j = 0; j < array[i].length; j++) {

                try {
                    val = Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    try {
                        throw new MyArrayDataException(i, j, array[i][j]);
                    } catch (MyArrayDataException ex) {
                        ex.printStackTrace();
                        val = 0;
                        System.out.printf("Ошибка в ячейке [%d][%d]. Заданно значение: default = 0;%n",i,j);
                    }
                }
                summ = summ + val;
            }
        }
        System.out.println("Сумма всех ячеек массива равна: " + summ);
    }
}
