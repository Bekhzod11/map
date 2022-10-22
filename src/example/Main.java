package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();
        while (true){
            System.out.println("1->add work 2->addtynonm 3->translate 4-> list 5->edittranslate 6->editword 7-deleteword 8 -deletetranslate");
            int n = scanner.nextInt();
            switch (n){
                case 1->{
                    dictionaryService.addWord();
                }
                case 2->{
                    dictionaryService.addSynonyms();
                }
                case 3->{
                    dictionaryService.translate();
                }
                case 4->{
                    dictionaryService.list();

                }
                case 5->{
                    dictionaryService.editTranslate();
                }
                case 6->{
                    dictionaryService.editWord();
                }
                case 7->{
                    dictionaryService.deleteWord();
                }
                case 8->{
                    dictionaryService.deleteTranslate();
                }


            }



        }
    }
}
