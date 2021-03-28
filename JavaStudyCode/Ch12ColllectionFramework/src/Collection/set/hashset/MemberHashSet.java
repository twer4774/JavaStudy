package Collection.set.hashset;

import Collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next(); //회원을 하나씩 가져와서
            int tempId = member.getMemberId();

            //ir에 있는 멤버 아이디와, 파라미터로 입력된 memberId의 값 비교
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId +  "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
