package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        //identificar o 1° numero
        for(int i = 0; i < elements.length-1; i++){
            int guardaNumero = i; //salva ele
        //identifica o 2°
            for(int j = i+1; j <elements.length; j++){
                //confere
                if(elementos[j] > guardaNumero){
                guardaNumero = j;
                }
            }
        //trocas
            int extra = elements[guardaNumero];
            elements[guardaNumero] = elements[i];
            elements[i] = extra;
        };
        int [] sorted = elements.clone();
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
