public class Sword<T extends Metal>{
    
    public boolean checkEndurance(T metall){
        if (metall.getEndurance()>49) return true;
        else return false;
    }
}
