package pac;

import java.util.Random;

public class Translate {
    public int getLimitation(int age){
        int limit = 0;
        if (age <= 25){
            limit = 1;
        } else if (age > 25 && age <= 50){
            limit = 2;
        } else if (age > 50 && age <= 75){
            limit = 3;
        } else if (age > 75){
            limit = 4;
        }
        return limit;
    }
    
    public int randomNr(int limit){
        Random ran = new Random();
        int randomNr = 0;
        switch(limit){
            case 1:
                randomNr = ran.nextInt(5) + 1;
                break;
            case 2:
                randomNr = ran.nextInt(5) + 6;
                break;
            case 3:
                randomNr = ran.nextInt(5) + 11;
                break;
            case 4:
                randomNr = ran.nextInt(5) + 16;
                break;
        }
        return randomNr;
    }
}
