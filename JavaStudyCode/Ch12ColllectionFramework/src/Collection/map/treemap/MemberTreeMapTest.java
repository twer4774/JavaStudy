package Collection.map.treemap;

import Collection.Member;
import Collection.map.hashmap.MemberHashMap;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        //순서와 상관없이 회원추가
        Member memberSon = new Member(1002, "손민국");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberPark = new Member(1003, "박서훤");

        //순서와 상관없이 회원추가
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberPark);


        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
