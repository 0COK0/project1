package com.quest.chap08.Game01;

public class Lycan extends Monster {

    public void attack() {
        System.out.println("라이칸이 공격을 합니다.");
    }

    public void damage() {
        System.out.println("라이칸이 데미지를 입었다.");
    }

    public void evasion() {
        System.out.println("라이칸은 가볍게 공격을 피했다.");
    }
    public void skill1() {
        System.out.println("라이칸은 날카로운 발톱으로 매섭게 공격해왔다.");

    }
    public void skill2() {
        System.out.println("라이칸은 칼날같은 발톱으로 바람을 가르듯 모험가를 향해 공격을 휘몰아쳤다.");
    }
}
