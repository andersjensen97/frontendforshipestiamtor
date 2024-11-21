class Boat {

    private Member[] members;

    public Boat(int seats) {
        this.members = new Member[seats];
    }

    public void print() {
        for (Member member : members) {
            if (member == null) {
                System.out.println("<Empty seat>");
            } else {
                System.out.println(member.toString());
            }
        }
    }

    public boolean isFull() {
        for (Member member : members) {
            if (member == null) {
                return false;
            }
        }
        return true;
    }

    public boolean assignMember(Member member) {
        if (isFull()) {
            return false;
        }

        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                return true;
            }
        }

        return false;
    }
}