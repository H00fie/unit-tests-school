package bm.app;

import java.math.BigDecimal;

public class LoledClass {

    String lol = "eg";
    Integer omg = 6;



    private void fuckAll(){
        System.out.println("Very fuck");
        System.out.println("Very fuck!");

    }


    private class Item {
        String feature;
        Integer number;

        private Item(String lol, Integer omg){
            this.feature = lol;
            this.number = omg;
        }
    }

    private BigDecimal thisClassDoesSomething(BigDecimal input){
        Integer result = 0;
        for (int i = 0; i < input.intValue(); i++) {
            result += i;
        }
        return new BigDecimal(result);
    }
}


