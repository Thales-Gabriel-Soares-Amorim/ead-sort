package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int i, j , key;

        for (i = 1; i < elements.length ; i++){

            key = elements[i];
            j = i -1;

            while (j >= 0 && key < elements[i]){
                elements[j+1] = elements[j];
                j = j -1;

            }
            elements[j+1] = key;
        }

        return elements;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
