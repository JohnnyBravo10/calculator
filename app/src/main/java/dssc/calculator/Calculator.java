package dssc.calculator;

public class Calculator {


    public double compute(String operation) {
        if ((operation.contains("+") && operation.indexOf('+')>0 )){
            return Double.parseDouble(operation.substring(0, operation.indexOf('+'))) + Double.parseDouble(operation.substring(operation.indexOf('+')+1));
        }
        if (operation.contains("-") && operation.indexOf('-')>0){
            return Double.parseDouble(operation.substring(0, operation.indexOf('-'))) - Double.parseDouble(operation.substring(operation.indexOf('-')+1));
        }
        if (operation.contains("*")){
            return Double.parseDouble(operation.substring(0, operation.indexOf('*'))) * Double.parseDouble(operation.substring(operation.indexOf('*')+1));
        }
        if (operation.contains("/")){
            return Double.parseDouble(operation.substring(0, operation.indexOf('/'))) / Double.parseDouble(operation.substring(operation.indexOf('/')+1));
        }
        return Double.parseDouble(operation);
    }
}


