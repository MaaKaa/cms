package b_Zadania_Domowe.b_Dzien_2.task1;

public class CheckScope implements ScopeChecker {

    @Override
    public boolean checkScope(int number) {
        if (number > 0 && number < 100){
            return true;
        }
        return false;
    }
}
