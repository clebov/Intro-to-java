package LevelTest;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        level l1 = level.HIGH;

        if(l1 == level.HIGH){

        }else if(l1 == level.MEDIUM){

        } else if (l1 == level.LOW){}

        switch(l1){
            case HIGH:
                System.out.println(level.HIGH.toString());
                break;
            case MEDIUM:
                System.out.println(level.MEDIUM.toString());
                break;
            case LOW:
                System.out.println(level.LOW.toString());
                break;
        }

        level[]Values = level.values();

        for(level lev: Values){
            System.out.println(lev);
        }

        level high = level.valueOf("HIGH");
        System.out.println(high);

        level blevel = level.HIGH;
        System.out.println(blevel.getLevelCode());

        System.out.println(blevel.lowercase());

        EnumSet<level> enumSet = EnumSet.of(level.HIGH,level.MEDIUM);
    }
}
