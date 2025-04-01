class People {
    void think(){
        System.out.println("생각한다.");
    }

}
class Man extends People {
    @Override
    void think() {
        System.out.println("남자가 생각한다.");
    }
    void shave() {
        System.out.println("면도한다.");
    }
}
class Woman extends People {
    @Override
    void think() {
        System.out.println("여자가 생각한다.");
    }
    void makeup(){
        System.out.println("화장한다.");
    }
}

public class ex36 {
    public static void main(String[] args) {
        People man = new Man();
        People woman = new Woman();
        man.think();
        woman.think();
        myFunc(man);
        myFunc(woman);
    }
    static void myFunc(People p) {
        //instanceof 연산자 : 객체 타입을 확인하는 연산자
        if(p instanceof  Man) {
            Man m = (Man)p;
            m.shave();
        }else {
            Woman w = (Woman) p;
            w.makeup();
        }
    }
}