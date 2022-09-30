public class HW1 {
    public static void main(String[] args) {

 int x1 = 1 , y1 = 1,  x2 = 2  , y2 = 2;

//1. Может ли конь переместиться с первой на вторую клетку?
        // Возможно мои математические предположения неверны, и так нельзя писать код , но я думая я где-то близко))
        boolean horse =((Math.abs(x1-x2)==1) && (Math.abs(y1-y2)==2)) || ((Math.abs(x1-x2)==2) && (Math.abs(y1-y2)==1));
        System.out.println(horse);
    }
}
