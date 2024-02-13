package com.quest.chap08.Game01;

public class Application {
    public static void main(String[] args) {

        //리드미//
        /* 1. Monster를 생성 Mosnter를 부모클래스로 만들어주고
        *  2. wolf, slime, lycan을 자식클래스로 만들어 상속시켜주고
        *  3. player01 및 그 외 클래스를 만들어서 출력에 쓸 메소드를 선언해주고
        *  4. 클래스에 변수를 할당  새 인스턴스를 생성
        *  5. 출력문들과 새로 만든 객채들을 사용해 게임같은 단편소설을 만들어줬습니다
        *  6. 자식 클래스에 상속받지않은 메소드들은 형변환으로 사용해 활용해보았습니다.
        *
        *
        * player01
        * */

        Monster monster = new Monster();
        Slime slime = new Slime();
        Wolf wolf = new Wolf();
        Lycan lycan = new Lycan();

        Player01 player01 = new Player01();

        Monster m1 = new Wolf();
        Monster m2 = new Slime();
        Monster m3 = new Lycan();
        Player01 p1 = new Player01();

        System.out.println("|||| 작은 숲 ||||");
        System.out.println("이 곳 부터는 몬스터들이 등장합니다.");
        System.out.println("작은 숲은 슬라임, 늑대 등 여러 몬스터가 서식중 입니다.");
        System.out.println("이 곳의 몬스터들은 시간이 지나면 마을을 공격하기 때문에 모든 몬스터들을 섬멸하시기 바랍니다.");
        System.out.println("기척이 느껴집니다.");

        System.out.println("======== 슬라임이 출연했습니다. ========");
        m2.attack();
        p1.defense();
        p1.attack();
        m2.damage();
        ((Slime)m2).split();    //다운캐스팅
        System.out.println("모험가는 침착하게 스킬을 사용합니다.");
        p1.skill1();
        m2.die();
        System.out.println("싸움의 소리를 듣고 또 다른 몬스터가 기척 없이 다가옵니다.");
        System.out.println("======== 늑대가 기습을 하며 등장합니다.========");
        p1.nonDefense();
        p1.damage();
        p1.attack();
        ((Wolf)m1).evasion();
        m1.attack();
        p1.skill2();
        m1.damage();
        m1.die();
        System.out.println("늑대의 습격으로 인해 모험가는 부상을 당헀다.");
        System.out.println("멀지 않은 곳에서 수많은 몬스터들의 움직임 느껴진다.");
        System.out.println("======== 산 울림과 수많은 몬스터 무리를 무리들을 이끌고 작은 숲의 주인 라이칸이 모습을 드러냈다. ========");
        m3.attack();
        p1.defense();
        p1.attack();
        ((Lycan)m3).evasion();
        ((Lycan)m3).skill1();
        p1.damage();
        p1.skill2();
        m3.damage();
        ((Lycan) m3).skill2();
        p1.breached();
        p1.damage();
        ((Player01)p1).collapse();
        System.out.println("======== 갑자기 빛이 모험가에게로 쏟아졌다. ========");
        p1.Awakening();
        System.out.println("라이칸은 위협을 느끼고 기술을 사용합니다");
        ((Lycan) m3).skill2();
        p1.skill3();
        System.out.println("모험가는 스킬 발동과 동시에 주변에 모든 적들을 소멸시켰습니다.");
        System.out.println("마을의 평화가 왔습니다.");













    }
}
