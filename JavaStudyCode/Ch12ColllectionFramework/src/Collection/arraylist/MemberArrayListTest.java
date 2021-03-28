package Collection.arraylist;

import Collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        Member memberHong = new Member(1004, "홍길동");
        Member memberJo = new Member(1005, "조조조");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        try{
            memberArrayList.insertMember(memberJo, 6);
        } catch (Exception e){
            e.printStackTrace();
        }

        memberArrayList.showAllMember();


        //길동 삭제
//        memberArrayList.removeMember(memberHong.getMemberId());
//        memberArrayList.showAllMember();
    }

}
