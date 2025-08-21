package tdd;

public class Calculator {

    public int add(int i, int i1) {
        return i + i1;
    }

    public int subtract(int i, int i1) {
        return i -i1;
    }

    public int multiply(int i, int i1) {
        return i *i1;

    }

    public int divide(int i, int i1) {
        return i /i1;

    }

    public int add(String i) {
        String[] listOfNmb =  i.split(",");
        int sum = 0;
        for(String s : listOfNmb){
            sum+= Integer.parseInt(s.trim());
        }
        return sum;
    }

    public int add(int[] ints) {
        int sum = 0;
        for(int i : ints){
            sum+=i;
        }
        return sum;
    }
}
