package sample;

public class Modal {
    public float calculate(long numb1, long numb2, String operator){
        switch(operator){
            case "+":
                return numb1 + numb2;
            case "-":
                return numb1 - numb2;
            case "x":
                return numb1*numb2;
            case "/":
                if(numb2 == 0)
                    return 0;
                return numb1/numb2;
            default:
                return 0;
        }
    }
}
