package TemplateMethod;

/**
 * Created by shu on 2016/11/13.
 */
abstract class Money {
    protected double value;
    protected Money(double value){
        this.value = value;
    }
    abstract protected String getPrefix();
    abstract protected String getPostfix();
    @Override public String toString(){
        return getPrefix()+String.valueOf(value)+getPostfix();
    }
}
class Dollar extends Money{
    public Dollar(double value){
        super(value);
    }
    @Override protected String getPrefix(){
        return "$";
    }
    @Override protected String getPostfix(){
        return "";
    }
}
class Eur extends Money{
    public Eur(double value){
        super(value);
    }
    @Override protected String getPrefix(){
        return "$";
    }
    @Override protected String getPostfix(){
        return "";
    }
}

class Yen extends Money{
    public Yen(double value){
        super(value);
    }
    @Override protected String getPrefix(){
        return "";
    }
    @Override protected String getPostfix(){
        return "円";
    }
}
class example1 {
    public static void main(String[] arg){
        Yen y = new Yen(100);
        Dollar d = new Dollar(50);
        System.out.println(y);
        System.out.println(d);
        Money[] array = {y,d};
        for(Money m : array){
            System.out.println(m.toString());
        }
    }
}

