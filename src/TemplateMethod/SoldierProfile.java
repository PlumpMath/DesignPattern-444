package TemplateMethod;

/**
 * Created by shu on 2017/01/09.
 */

interface Soldier {
    String name();
    int powerLevel();
    String attackName();
    String race();
    void print();
}

abstract class Saiyan implements Soldier {
    String mName;
    int mPowerLevel;
    String mAttackName;
    String mRace;

    Saiyan() {
        mName = name();
        mPowerLevel = powerLevel();
        mAttackName = attackName();
        mRace = race();
    }
    abstract public String name(); // 名前
    abstract public int powerLevel();// 戦闘力
    abstract public String attackName(); // 技名
    public String race() {
        return "サイヤ人";
    }
    public void print() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("##################\n");
        strBuilder.append(mName + "\n");
        strBuilder.append("戦闘力:" + mPowerLevel + "\n");
        strBuilder.append("技:" + mAttackName + "\n");
        strBuilder.append("出身:" + mRace + "\n");
        strBuilder.append("##################\n");
        System.out.println(strBuilder.toString());
    }
}

abstract class Earth implements Soldier {
    String mName;
    int mPowerLevel;
    String mAttackName;
    String mRace;

    Earth() {
        mName = name();
        mPowerLevel = powerLevel();
        mAttackName = attackName();
        mRace = race();
    }
    abstract public String name();
    abstract public int powerLevel();// 戦闘力
    abstract public String attackName(); // 技名
    public String race() {
        return "地球人";
    }
    public void print() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("##################\n");
        strBuilder.append(mName + "\n");
        strBuilder.append("戦闘力:" + mPowerLevel + "\n");
        strBuilder.append("技:" + mAttackName + "\n");
        strBuilder.append("出身:" + mRace + "\n");
        strBuilder.append("##################\n");
        System.out.println(strBuilder.toString());
    }
}


class SonGoku extends Saiyan {
    @Override
    public String name() {
        return "孫悟空";
    }
    @Override
    public int powerLevel() {
        return 10000;
    }

    @Override
    public String attackName() {
        return "かめはめ波";
    }
}
class Krillin extends Earth {
    @Override
    public String name() {
        return "クリリン";
    }
    @Override
    public int powerLevel() {
        return 1000;
    }

    @Override
    public String attackName() {
        return "気円斬";
    }
}

class SoldierProfile {
    public static void main(String[] arg){
        SonGoku sonGoku = new SonGoku();
        sonGoku.print();

        Krillin krillin = new Krillin();
        krillin.print();
    }
}
