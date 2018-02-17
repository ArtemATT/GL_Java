package Java_Courses;

public class Olympiad {
    public static void main(String[] args) {
        int h1 = 9, m1 = 30, s1 = 47;
        int h2 = 12, m2 = 17, s2 = 29;
        int hSubs = 0, mSubs = 0;
        int hRez, mRez, sRez;

        if (s2 > s1) {
            sRez = s2 - s1;
        }
        else {
            sRez = 60 + s2 - s1;
            mSubs++;
        }

        if (m2 - mSubs > m1) {
            mRez = m2 - m1;
        }
        else {
            mRez = 60 + m2 - m1 - mSubs;
            hSubs++;
        }
        hRez = h2 - hSubs - h1;

        System.out.println(hRez + " " + mRez + " " + sRez);
    }
}
