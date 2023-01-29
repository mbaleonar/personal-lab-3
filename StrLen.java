interface StringChecker { boolean checkString(String s); }
public class StrLen implements StringChecker {
    public boolean checkString(String s){
        if (s.length() == 4){
            return true;
        }
        return false;
    }
}
