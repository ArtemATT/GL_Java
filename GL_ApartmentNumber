package Java_Courses;

public class ApartmentNumber {
    public static void main(String[] args) {
        int n = 30; // flats in building
        int p = 2; // number of entrance
        int q = 5; // number of flours
        int k = 27;
        int rezP, rezQ;

        int flatsPerP = n/p;
        int flatsPerQ = flatsPerP/q;

        if (k % flatsPerP == 0) {
            rezP = k / flatsPerP;
            if (k % flatsPerQ == 0) {
                rezQ = k / rezP / flatsPerQ;
            }
            else {
                rezQ = k / rezP / flatsPerQ + 1;
            }
        }
        else {
            rezP = k / flatsPerP + 1;

            if (k % flatsPerP % flatsPerQ == 0 )
            {
                rezQ = (k % flatsPerP) / flatsPerQ;
            }
            else {
                rezQ = (k % flatsPerP) / flatsPerQ + 1;
            }
        }

        System.out.println(rezP + " " + rezQ);
    }
}
