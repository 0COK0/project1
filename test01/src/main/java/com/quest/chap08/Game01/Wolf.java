package com.quest.chap08.Game01;

public class Wolf extends Monster {

    @Override
    public void attack() {
        System.out.println("늑대가 플레이어를 공격합니다.");
    }
    @Override
    public void damage() {
        System.out.println("늑대가 데미지를 입었다.");
    }
    @Override
    public void die() {
        System.out.println("늑대가 쓰러졌습니다.");
    }
    public void evasion() {
        System.out.println("늑대가 회피하였습니다.");
    }

}
