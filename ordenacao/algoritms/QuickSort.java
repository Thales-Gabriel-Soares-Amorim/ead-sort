package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        quicksort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void quicksort(int[] lista, int left, int right) {
        if (left < right) {
            int pivo = partition(lista, left, right);
            quicksort(lista, left, pivo - 1);
            quicksort(lista, pivo + 1, right);
        }
    }

    protected int partition(int[] lista, int left, int right){
       int pivo = lista[left]; //declarar pivo para ordenação
       int i = left-1;
       for(int j = left; j < right; j++){
        if(lista[j]<= pivo){
            i = i+1;
            int extra = lista[i];
            lista[i] = lista[j];
            lista[j] = extra;
            
        }
       }
//trocas
        int extra = lista[i+1];
        lista[i+1] = lista[right];
        lista[right] = extra;
        return i+1;
    }
    @Override
    public String getName() {
        return "QuickSort";
    }

}
