package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        /* MallardDuck에서 상속받은 performQuack(),performFly() 메소드가 호출됨.
        * */
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

/* 컴파일 결과
꽥
날고 있어요!.
저는 못 날아요.
로켓 추진으로 날아갑니다
* */