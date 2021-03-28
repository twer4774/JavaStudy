package Collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId;
    }

    //같은 객체를 중복 저장하지 않기 위해 필요(MemberHashSet에서 홍길동이 추가되면 안된다)
    @Override
    public int hashCode() {
        return memberId;
    }

    //Comparator 인터페이스
    @Override
    public int compare(Member2 member1, Member2 member2) {
        return member1.getMemberId() - member2.getMemberId();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member2){
            Member2 member = (Member2) obj;
            //매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
            if (this.memberId == member.memberId) {
                return true;
            } else{
                return false;
            }
        }
        return false;
    }
}
