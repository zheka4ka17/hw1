public class HM2 {
    public static void main(String[] args) {
        //2. Может ли король переместиться с первой на вторую клетку
        // здесь тоже получилось что-то сложно , но по моим расчетом вроде верно
        int x1 = 1 , y1 = 1,  x2 = 2  , y2 = 2;
        boolean king = (((x1==x2) && (Math.abs(y1-y2)==1 )) || ((y1==y2) && (Math.abs(x1-x2)==1))) || ((Math.abs(x1-x2)==1) && (Math.abs(y1-y2)==1));
        System.out.println(king);
    }
}
