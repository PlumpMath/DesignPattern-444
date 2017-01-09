package TemplateMethod;

/**
 * Created by shu on 2017/01/09.
 */

interface Soldier {
    int getPowerLevel();
    String getAttackName();
    String getHometown();
}

abstract class Saiyan implements Soldier {
    abstract public int getPowerLevel();// 戦闘力
    abstract public String getAttackName(); // 技名
    public String getHometown() {
        return "サイヤ人";
    }
}

abstract class Earth implements Soldier {
    abstract public int getPowerLevel();// 戦闘力
    abstract public String getAttackName(); // 技名
    public String getHometown() {
        return "地球人";
    }
}


class SonGoku extends Saiyan {
    @Override
    public int getPowerLevel() {
        return 10000;
    }

    @Override
    public String getAttackName() {
        return "kamehameha";
    }
}
class Krillin extends Earth {
    @Override
    public int getPowerLevel() {
        return 10;
    }

    @Override
    public String getAttackName() {
        return "kienzan";
    }
}

class ExampleSoldier {
    public static void main(String[] arg){
        SonGoku sonGoku = new SonGoku();
        System.out.println(sonGoku.getPowerLevel());
        System.out.println(sonGoku.getAttackName());
        System.out.println(sonGoku.getHometown());

        Krillin krillin = new Krillin();
        System.out.println(krillin.getPowerLevel());
        System.out.println(krillin.getAttackName());
        System.out.println(krillin.getHometown());
    }
}
