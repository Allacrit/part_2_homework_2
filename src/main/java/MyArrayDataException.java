public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int indexA, int indexB) {
        super(String.format("Ошибка значения в ячейке [%d][%d].",indexA,indexB));
    }

    public MyArrayDataException(int indexA, int indexB, String val) {
        super(String.format("Ошибка в ячейке [%d][%d]. Значение: %s.",indexA,indexB,val));
    }



}
