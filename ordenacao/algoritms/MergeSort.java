package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        //TODO Implementar
        return sorted;
    }

    protected void mergeSort(int[] lista, int inicio, int fim){
        int meio;
        if(inicio<fim){
            meio = floor((inicio+fim)/2);
            mergeSort (lista,inicio,fim);
            mergeSort(lista,inicio+1,fim);
            merge(lista,inicio,meio,fim);
        }
    }
    private int floor(int i) {
        return 0;
    }

    protected void merge (int[] lista, int inicio, int meio, int fim){
        for(int k = inicio;k <= fim; k++){


            int i =inicio;
            int j = meio+1;

            for(){}
        }
    }
    @Override
    public String getName() {
        return "MergeSort";
    }

}
