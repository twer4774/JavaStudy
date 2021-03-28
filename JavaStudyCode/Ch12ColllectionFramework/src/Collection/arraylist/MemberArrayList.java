package Collection.arraylist;

import Collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public void insertMember(Member member, int index){
        if(index < 0 || index > arrayList.size()+1){
            System.out.println("배열의 범위를 벗어나서 저장할 수 없음");
        }
        arrayList.add(index-1, member);
    }

    public boolean removeMember(int memberId){
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            //회원 아이디가 매개변수와 일치하면
            if (tempId == memberId) {
                arrayList.remove(i); //해당 회원 삭제
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
