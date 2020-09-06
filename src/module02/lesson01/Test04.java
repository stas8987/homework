package module02.lesson01;

import java.util.Arrays;


public class Test04 {
    public static void main(String[] args) {
        Person01 vanHelsing = new Person01 ("Van Helsing", 17);
        Person01 altair = new Person01 ("Altair", 25);
        Person01 deckartCain = new Person01 ("Deckart Cain", 33);
        Person01 sam = new Person01 ("Sam", 36);
        Person01 gannibal = new Person01 ("Gannibal", 85);
        Person01 [] piople = new  Person01[5];
        piople [4] = vanHelsing;
        piople [3] = altair;
        piople [0] = deckartCain;
        piople [2] = sam;
        piople [1] = gannibal;
        //System.out.println(Arrays.toString(piople));
        sortByAge(piople);
        sortByName(piople);

    }
    private static void sortByName(Person01 [] piople) {
        System.out.println("After sorting by name:");
        sortName(piople);
        System.out.println(Arrays.toString(piople));
    }
    private static void sortByAge(Person01 [] piople){
        System.out.println("After sorting by age:");
        sortAge(piople);
        System.out.println(Arrays.toString(piople));
        }

    private static void sortName(Person01 [] piople){
        String [] tempPiople = new String[piople.length];
        int [] tempPiopleAge = new int[piople.length];
        char [] tempSort = new  char[piople.length];
        for (int index = 0; index<piople.length; index++){
            tempPiople[index] = piople[index].name;
            tempPiopleAge[index]=piople[index].age;
            char[] q = tempPiople[index].toCharArray();
            tempSort[index] = q[0];
        }
        Arrays.sort(tempSort);
        for (int index = 0; index<piople.length; index++){
            char[] q = tempPiople[index].toCharArray();
            for (int sqrl = 0; sqrl<tempSort.length; sqrl++)
            if (tempSort[sqrl]==q[0]){
                tempSort[sqrl] = (char)10;
                piople[sqrl].name = tempPiople[index];
                piople[sqrl].age = tempPiopleAge[index];
            }
        }
    }
    private static void sortAge(Person01 [] piople){
        String [] tempPiople = new String[piople.length];
        int [] tempPiopleAge = new int[piople.length];
        int [] tempSort = new  int[piople.length];
        for (int index = 0; index<piople.length; index++){
            tempPiople[index] = piople[index].name;
            tempPiopleAge[index] = piople[index].age;
            tempSort[index] = piople[index].age;
        }
        Arrays.sort(tempSort);
        for (int index = 0; index<piople.length; index++){
            for (int sqrl = 0; sqrl<tempSort.length; sqrl++)
                if (tempSort[sqrl]==tempPiopleAge[index]){
                    tempSort[sqrl] = 0;
                    piople[sqrl].name = tempPiople[index];
                    piople[sqrl].age = tempPiopleAge[index];
                }
        }
    }

}

