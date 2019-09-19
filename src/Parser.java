public class Parser{
    public boolean isDelimiter(String a){
        switch (a){
            case "(":
            case ")":
                return true;
            default:
                return false;
        }
    }

    public boolean isOperator(String a){
        switch (a){
            case "+":
            case "-":
            case "*":
            case ">":
            case "<":
            case "=":
                return true;
            default:
                return false;
        }
    }

    public boolean isSimpleLiteral(String a) {
        if (a == null || a.isEmpty()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isDigit(a.charAt(i))) return false;
        }
        return true;
    }
}