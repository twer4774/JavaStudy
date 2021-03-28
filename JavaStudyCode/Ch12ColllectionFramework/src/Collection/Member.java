package Collection;

public class Member implements Comparable<Member>{
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Member){
            Member member = (Member) obj;
            //매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
            if (this.memberId == member.memberId) {
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    //추가한 회원 아이디와 매개변수로 받은 회원아이디를 비교한다. => 오름차순 정렬
    @Override
    public int compareTo(Member member) {
        return(this.memberId - member.memberId); ////내림차순 정렬 return(this.memberId - member.memberId) * (-1);
    }

//    //나 혼자 코딩 => 회원 이름순으로 정렬
//    @Override
//    public int compareTo(Member member) {
//        return (this.memberName.compareTo(member.memberName));
//    }
}
