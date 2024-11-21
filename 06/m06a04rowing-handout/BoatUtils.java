public class BoatUtils {

    public static Member[] createBoat(int seats) {
        Member[] boat = new Member[seats];
        return boat;
    }

    public static void printBoat(Member[] boat) {
        for (Member member : boat) {
            if (member != null) {
                System.out.println(member.toString());
            } else {
                System.out.println("<Empty seat>");
            }
        }
    }

    public static boolean isBoatFull(Member[] boat) {
        for (Member member : boat) {
            if (member == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean assignMember(Member[] boat, Member m) {
        if (isBoatFull(boat) || isMemberOnBoat(boat, m)) {
            return false;
        }

        for (int i = 0; i < boat.length; i++) {
            if (boat[i] == null) {
                boat[i] = m;
                return true;
            }
        }
        return false; 
    }

    private static boolean isMemberOnBoat(Member[] boat, Member m) {
        for (Member member : boat) {
            if (member != null && member.equals(m)) {
                return true;
            }
        }
        return false;
    }
}
